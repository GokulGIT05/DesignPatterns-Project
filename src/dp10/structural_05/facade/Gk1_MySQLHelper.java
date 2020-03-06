package dp10.structural_05.facade;

public class Gk1_MySQLHelper {

	// Getting Connection
	public static boolean getConnection() {
		System.out.println("SQL DB Connections Started...");
		return true;
	}

	// Report Generate
	// 1. HTML
	public void getHTMLReport(String tableName, boolean isConnected) {
		if (isConnected) {
			System.out.println("HTML Report is generated for SQL Database and table name is " + tableName);
		} else {
			System.out.println( "DB Connection is not established");
		}
	}

	// 2. PDF
	public void getPDFReport(String tableName, boolean isConnected) {
		
		if (isConnected) {
			System.out.println("PDF Report is generated for SQL Database and table name is " + tableName);
		} else {
			System.out.println( "DB Connection is not established");
		}
	}

}
