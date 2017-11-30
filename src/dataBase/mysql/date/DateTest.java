package dataBase.mysql.date;

import java.sql.Statement;
import java.util.Random;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

import dataBase.mysql.tree.TreeNode;
import dataBase.mysql.utils.DbUtils;
import dataBase.mysql.utils.DbUtils.DB;

public class DateTest {
	private static final DB TYPE = DB.MYSQL;
	
	/**
	 * 插入语句
	 */
	@Test
	public void insertDate() {
		Statement statement = DbUtils.getStatement(TYPE);
		int days = 31;
		for(int i=0; i<days; i++) {
			String countSql = "select count(rank_) as rank_ from test1 ";
			try {
				// 个数
				ResultSet rs = statement.executeQuery(countSql);
				int count = 0;
				while(rs.next()) {
					count = rs.getInt("rank_");
				}
				// 插入
				//String day = this.getRandom(false, 31);
				String day = String.valueOf(i+1);
				String hour = this.getRandom(true, 24);
				String min = this.getRandom(true, 60);
				String second = this.getRandom(true, 60);
				String sql = "insert into test1(rank_, create_time) "
						+ "values("+count+", "
						+ "to_date('2016-11-"+day+" "+hour+":"+min+":"+second+"', 'yyyy-MM-dd HH24:mi:ss'))";
				System.out.println("sql: " + sql);
				statement.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		DbUtils.close(TYPE);
	}
	
	/**
	 * 查询表头
	 * @throws SQLException 
	 */
	@Test
	public void findMetaData() throws SQLException {
		String sql = "select * from visu_schema_sys where 1=-1";
		ResultSet rs = DbUtils.executeQuery(sql, TYPE);
		ResultSetMetaData md = rs.getMetaData(); // 得到结果集(rs)的结构信息，比如字段数、字段名等
		for(int i=1; i<=md.getColumnCount(); i++) {
			int size = md.getColumnDisplaySize(i);
			System.out.println("size="+size);
			
			String typeName = md.getColumnTypeName(i);
			System.out.println("typeName="+typeName);
			
			int colType = md.getColumnType(i);
			System.out.println("colType="+colType);
			
			String colTypeName = md.getColumnTypeName(i);
			System.out.println("colTypeName="+colTypeName);
			
			String colLabel = md.getColumnLabel(i);
			System.out.println("colLabel="+colLabel);
			
			String colName = md.getColumnName(i);
			System.out.println("colName="+colName);
			
			int precision = md.getPrecision(i);
			System.out.println("precision="+precision);
			
			int scale = md.getScale(i);
			System.out.println("scale="+scale);
			
			String catalogName = md.getCatalogName(i);
			System.out.println("catalogName="+catalogName);
			
			String schemaName = md.getSchemaName(i);
			System.out.println("schemaName="+schemaName);
			System.out.println("----------------------------------");
		}
		DbUtils.close(TYPE);
	}
	
	private String getRandom(boolean zero, int max) {
		int i = new Random().nextInt(max);
		if(!zero) {
			if(i == 0) {
				this.getRandom(zero, max);
			}
		}
		if(i < 10) {
			return "0"+i;
		} else {
			return String.valueOf(i);
		}
	}
}
