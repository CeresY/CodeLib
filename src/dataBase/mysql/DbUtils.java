package dataBase.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * mysql工具类
 * @author yangzhan-xps13
 *
 */
public class DbUtils {
	static final String URL = "jdbc:mysql://localhost:3306/vbi2";
	static final String USER = "vbi";
	static final String PWD = "123456";
	static Connection conn = null;
	static Statement statement = null;
	
	public static Statement getStatement() {
		conn = getConnection();
		try {
			statement = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statement;
	}
	
	public static Connection getConnection() {
		try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("成功加载MySQL驱动！");
            conn = DriverManager.getConnection(URL, USER, PWD);
        }catch(ClassNotFoundException e1){
            System.out.println("找不到MySQL驱动!");
            e1.printStackTrace();
        } catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close() {
		if(statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
