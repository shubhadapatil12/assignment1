package connectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class moviesDAO
{
	Connection con;
	PreparedStatement pst;
	String sql;
	ResultSet rs;
	public List<movies>  getRecords()
	{
		sql=" SELECT * FROM movies ";
		
		
		List<movies> stlist = new ArrayList<movies>();
		try
		{
			con=DBConnection.MakeConnection();
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next())
			{
				movies st= new movies();
			 
			 st.setName(rs.getString("name"));
			 st.setActor(rs.getString("actor"));
			 st.setActress(rs.getString("actress"));
			 st.setDirector(rs.getNString("director"));
			 st.setYearofrelease(rs.getInt("yearofpassing"));
			 
			  stlist.add(st);	
				
			}
			return stlist;

			
		}catch(Exception ex)
		{
		  ex.printStackTrace();	
		}
		
		return null;
		
	}
}
