package utilities;

public class TestConfig {

	public static String server = "smtp.gmail.com";
	public static String from = "rishirises02@gmail.com";
	public static String password = "r7415369";
	public static String[] to = { "rishikeshyadav02@yahoo.com", "rishikeshyadav02@rediffmail.com",
			"rishirises02@gmail.com" };
	public static String subject = "Extent Project Report";

	public static String messageBody = "--Hello buddy---Be a happy man";
	public static String attachmentPath = "C:\\Users\\Rishi\\Pictures\\Messi.jpg";
	public static String attachmentName = "Lionel Messi.jpg";

	// SQL DATABASE DETAILS
	public static String driver = "net.sourceforge.jtds.jdbc.Driver";
	public static String dbConnectionUrl = "jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval";
	public static String dbUserName = "sa";
	public static String dbPassword = "$ql$!!1";

	// MYSQL DATABASE DETAILS
	public static String mysqldriver = "com.mysql.jdbc.Driver";
	public static String mysqluserName = "root";
	public static String mysqlpassword = "selenium";
	public static String mysqlurl = "jdbc:mysql://localhost:3306/acs";

}
