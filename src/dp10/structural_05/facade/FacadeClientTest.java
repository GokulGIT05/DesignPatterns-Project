package dp10.structural_05.facade;

public class FacadeClientTest {
	
	public static void main(String[] args) {
		
		// Without Facede
		boolean isConnected = Gk1_MySQLHelper.getConnection();
		Gk1_MySQLHelper sqlObj = new Gk1_MySQLHelper();
		sqlObj.getHTMLReport("Customer",isConnected);
		System.out.println("**********************************************");
		
		// Above all the four lines has been converted into single line
		// With Facade
		
		Gk3_HelperFacade.generateReport(ConnectionType.MYSQL, ReportType.HTML, "GK_HTML_SQL");
		Gk3_HelperFacade.generateReport(ConnectionType.MYSQL, ReportType.PDF, "GK_PDF_SQL");
		System.out.println("**********************************************");
		
		Gk3_HelperFacade.generateReport(ConnectionType.ORACLE, ReportType.HTML, "GK_HTML_SQL");
		Gk3_HelperFacade.generateReport(ConnectionType.ORACLE, ReportType.PDF, "GK_PDF_SQL");
		
	}
}
