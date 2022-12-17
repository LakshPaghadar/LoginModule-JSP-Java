

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getDatabaseConnection()
	{
		String URL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String Username = "root";
		String password = "8490064724";
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try{
            conn = DriverManager.getConnection(URL,Username,password);
            return conn;
        }
        catch(Exception e){
			return conn;
        }
	}
}
