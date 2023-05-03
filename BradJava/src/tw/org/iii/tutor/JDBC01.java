package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC01 {
	public static void main(String[] args) {
		// 1. Load Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/iii?user=root&password=root");
			System.out.println("OK2");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}
}
