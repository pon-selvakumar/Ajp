package JAVAPROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Venuejdbc {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/event";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "psk5512";
//	private static final int EventId = 0;
   
    

    // Establishing database connection+
   public void insert(int id,String evname,String date,String vname) {
	   try
	   {
		   Connection con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
		   PreparedStatement pst=con.prepareStatement("insert into venue values(?,?,?,?);");
		   pst.setInt(1,id);
		   pst.setString(2,evname );
		   pst.setString(4, date);
		   pst.setString(3,vname);
		  int suxes= pst.executeUpdate();
		   if(suxes>0)
		   {
			   System.out.println("Successfully inserted");
			   
		   }
		   else
		   {
			   System.out.println("insertion failed");
			   
		   }
		   con.close();
		   
	   }
	   catch (SQLException e) {
			e.printStackTrace();
	   }}
   		public void read() throws SQLException
   		{
   			Connection con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
 		   PreparedStatement pst=con.prepareStatement("select * from venue;");
 		   ResultSet rs=pst.executeQuery();
 		   while(rs.next())
 		   {
 			   System.out.println("Event_id:"+rs.getString(1)+" Event_name:"+rs.getString(2)+" Venue:"+rs.getString(3)+" Event_date:"+rs.getString(4));
 		   }
 		     con.close();	
	   
   		}
   		public void update(int id,String vname,String evename,String date) throws SQLException
   		{
   			Connection con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
  		   PreparedStatement pst=con.prepareStatement("update venue set eve_name=?,venue_name=?,Event_date=? where eve_id=?");
  		 pst.setInt(4,id);
		   pst.setString(1,evename );
		   pst.setString(3, date);
		   pst.setString(2,vname);
		   int suxes1= pst.executeUpdate();
		   if(suxes1>0)
		   {
			   System.out.println("Successfully updated");
			   
		   }
		   else
		   {
			   System.out.println("updation failed");
			   
		   }
		   con.close();
   		}
   		public void delete(int id) throws SQLException
   		{
   			Connection con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
   		   PreparedStatement pst=con.prepareStatement("delete from venue where eve_id=?");
   		   pst.setInt(1, id);
   		int value1=pst.executeUpdate();
		if(value1>0)
		{
			System.out.println("row deleted Successfully");
		}
		else
		{
			System.out.println("failed to delete the row");
			
		}
		 con.close();
	    
	   
   }
   		   
  
   			
   		
}
