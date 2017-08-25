package dataBase.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DbUtils {
	
	public static enum DB {
		ORACLE, MYSQL;
	}
	
	public static Statement getStatement(DB type) {
		if(type.equals(DB.ORACLE)) {
			return DbOracleUtils.getStatement();
		} else if(type.equals(DB.MYSQL)) {
			return DbMysqlUtils.getStatement();
		} else {
			return null;
		}
	}
	
	public static PreparedStatement getPs(String sql, DB type) {
		if(type.equals(DB.ORACLE)) {
			return DbOracleUtils.getPs(sql);
		} else if(type.equals(DB.MYSQL)) {
			return DbMysqlUtils.getPs(sql);
		} else {
			return null;
		}
	}
	
	public static Connection getConnection(DB type) {
		if(type.equals(DB.ORACLE)) {
			return DbOracleUtils.getConnection();
		} else if(type.equals(DB.MYSQL)) {
			return DbMysqlUtils.getConnection();
		} else {
			return null;
		}
	}
	
	public static void close(DB type) {
		if(type.equals(DB.ORACLE)) {
			DbOracleUtils.close();
		} else if(type.equals(DB.MYSQL)) {
			DbMysqlUtils.close();
		}
	}
	
}
