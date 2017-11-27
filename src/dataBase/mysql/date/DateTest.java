package dataBase.mysql.date;

import java.sql.Statement;
import java.util.Random;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import dataBase.mysql.DbUtils;
import dataBase.mysql.DbUtils.DB;
import dataBase.mysql.tree.TreeNode;

public class DateTest {
	private Statement statement = null;
	
	private static final DB TYPE = DB.ORACLE;
	
	@Test
	public void insertDate() {
		statement = DbUtils.getStatement(TYPE);
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
	
	public void updateTimeMysql() {
		
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
