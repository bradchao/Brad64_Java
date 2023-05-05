package tw.org.iii.tutor;

public class JDBC12 {
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost/brad";

	public static void main(String[] args) {
		String sql = 
			"select e.FirstName, e.LastName, sum(od.UnitPrice * od.Quantity) sum "
			+ "from orders o "
			+ "join employees e on (o.EmployeeID = e.EmployeeID) "
			+ "join orderdetails od on (o.OrderID = od.OrderID) "
			+ "GROUP by e.EmployeeID "
			+ "ORDER by sum desc";
		
		
		
		
		
	}

}
