package tw.org.iii.myclasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.exceptions.SQLError;

public class FoodDB {
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost/iii";
	public static final String SQL_QUERY = "SELECT * FROM food";
	
	private Connection conn;
	private ResultSet rs;
	private String[] fieldNames;
	
	public FoodDB() throws SQLException {
		Properties prop = new Properties();
		prop.put("user", USER); prop.put("password", PASSWORD);
		conn = DriverManager.getConnection(URL, prop);
	}
	
	public void queryData(String sql) throws SQLException {
		Statement stmt = conn.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		rs =  stmt.executeQuery(sql);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		fieldNames = new String[rsmd.getColumnCount()];
		for (int i=0; i<fieldNames.length; i++) {
			fieldNames[i] = rsmd.getColumnName(i+1);
		}
	}
	
	// 1-base
	public void delRow(int row) {
		try {
			rs.absolute(row);
			rs.deleteRow();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public String[] getHeader() {
		return fieldNames;
	}
	
	public int getRows() {
		try {
			rs.last();
			return rs.getRow();
		}catch (Exception e) {
			return 0;
		}
	}
	
	public int getCols() {
		return fieldNames.length;
	}
	
	// row, col => 1-base
	public String getData(int row, int col) {
		try {
			rs.absolute(row);
			return rs.getString(fieldNames[col-1]);
		}catch(Exception e) {
			return "XX";
		}
	}
	
	
	// row, col => 1-base
	public void updateData(int row, int col, String aValue) {
		try {
			rs.absolute(row);
			rs.updateString(fieldNames[col-1], aValue);
			rs.updateRow();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
