package JAVAPROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.sql.*;
public class Eventjdbc {
	
	
	 private static final String JDBC_URL = "jdbc:mysql://localhost:3306/event";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "psk5512";
//		private static final int EventId = 0;
	   
	    

	    // Establishing database connection+
	   public void insert(int id,String name,String manager,String ph) {
		   try
		   {
			   Connection con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
			   PreparedStatement pst=con.prepareStatement("insert into event_details values(?,?,?,?);");
			   pst.setInt(1,id);
			   pst.setString(2,name );
			   pst.setString(3, manager);
			   pst.setString(4,ph);
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
	   
	   //READ OPERATION
	   public  void read() throws SQLException
	   {
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","psk5512");
		   
		   PreparedStatement pst=con.prepareStatement("Select * from  event_details");
		   ResultSet rs=pst.executeQuery();
		   while(rs.next())
		   {
			   System.out.println("EVent id:"+rs.getString(1)+" Event Name:"+rs.getString(2)+" Event manager:"+rs.getString(3)+" phone:"+rs.getString(4));
		   }
		   con.close();
	   }
	   public void update(String name,String manager,String ph,int id ) 
	   {
		   try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","psk5512");
				PreparedStatement pst=con.prepareStatement("update event_details set Event_name=?,Event_manager=?,manager_ph=? where Event_id=?");
			    pst.setInt(4, id);
			    pst.setString(1, name);
			    pst.setString(2, manager);
			    pst.setString(3, ph);
				
			    int row_affect=pst.executeUpdate();
			    if(row_affect > 0) {
			    	System.out.println("Event detail updated successfully!");
			    }else {
			    	System.out.println("Failed to update  detail Event, no id match with "+id);
			    	 con.close();
			    }
			}catch(SQLException e) {
				e.printStackTrace();
			}
	   }
	   public void delete(int ID) throws SQLException
	   {
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","psk5512");
			PreparedStatement pst=con.prepareStatement("delete from Event_details where Event_id=?");
			pst.setInt(1, ID);
			int value=pst.executeUpdate();
			if(value>0)
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
