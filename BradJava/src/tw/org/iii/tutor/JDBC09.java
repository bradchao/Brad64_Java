package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Scanner;

public class JDBC09 {
	private static Connection conn;
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost/iii";
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Account : ");
		String account = scanner.next();
		
		System.out.print("Password : ");
		String passwd = scanner.next();
		
		System.out.print("Email : ");
		String email = scanner.next();
		
		Properties prop = new Properties();
		prop.put("user", USER); prop.put("password", PASSWORD);
				
		try {
			conn = DriverManager.getConnection(URL, prop);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
