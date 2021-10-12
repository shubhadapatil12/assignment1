package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static  Connection MakeConnection()
	  {
		  Connection con=null;
		  
		  try
		  {
			  Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root", "");
			//  return con;
			 System.out.println(con);
			  
		  }catch(Exception ex)
		  {
			ex.printStackTrace();  
		
		  }
		  return con;
		  
	  }

}
