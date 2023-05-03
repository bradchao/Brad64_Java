package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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
			
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO cust (cname,tel,birthday) VALUES ('aa','123','1999-01-02')";
			if (stmt.execute(sql)) {
				System.out.println("Query");
			}else {
				System.out.println("Update");
			}
			
			
			int count = stmt.executeUpdate(sql);
			System.out.println(count);
			
			
			
			System.out.println("OK2");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}
}
