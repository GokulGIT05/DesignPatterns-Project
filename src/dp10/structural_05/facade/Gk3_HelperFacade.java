package dp10.structural_05.facade;

public class Gk3_HelperFacade {

	public static void generateReport(ConnectionType cType, ReportType rType, String tableName) {
		
		boolean isDBConnected = false;
		
		switch (cType) {

		case MYSQL:
			isDBConnected = Gk1_MySQLHelper.getConnection();
			System.out.println("Got the Connection: " + isDBConnected);
			Gk1_MySQLHelper sqlHelperObj = new Gk1_MySQLHelper();
			switch (rType) {
			case PDF:
				sqlHelperObj.getPDFReport(tableName, isDBConnected);
				break;
			case HTML:
				sqlHelperObj.getHTMLReport(tableName, isDBConnected);
			}
			break;
		case ORACLE:
			isDBConnected = Gk1_MySQLHelper.getConnection();
			System.out.println("Got the Connection: " + isDBConnected);
			Gk2_OracleHelper oracleHelperObj = new Gk2_OracleHelper();
			switch (rType) {
			case PDF:
				oracleHelperObj.getPDFReport(tableName, isDBConnected);
				break;
			case HTML:
				oracleHelperObj.getHTMLReport(tableName, isDBConnected);
			}
		}
	}
}
