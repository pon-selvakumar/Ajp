package JAVAPROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Regestrationjdbc {
	
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/event";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "psk5512";
	
	 public void insert(String fee,int partid,String part_name,String part_email,String status) {
		   try
		   {
			   Connection con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
			   PreparedStatement pst=con.prepareStatement("insert into registrations values(?,?,?,?,?);");
			   pst.setString(4,fee);
			   pst.setInt(1,partid );
			   pst.setString(2, part_name);
			   pst.setString(3,part_email);pst.setString(5, status);
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
		  PreparedStatement pst=con.prepareStatement("select * from registrations");
		  ResultSet rs=pst.executeQuery();
		  while(rs.next())
		  {
			  System.out.println("Participants_id:"+rs.getShort(1)+" Participats_name:"+rs.getString(2)+"Participant_email:"+rs.getString(3)+" Event_fee"+rs.getShort(4)+" Event_Status:"+rs.getString(5));
			  
		  }
		 
	 }
	 public void update(String fee,int partid,String part_name,String part_email,String status) throws SQLException
	 {
		 Connection con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
	    	PreparedStatement pst=con.prepareStatement("update registrations set partici_name=?,email=?,payment_fee=?,payment_st=? where partici_id=?");
	    	 pst.setString(3,fee);
			   pst.setInt(5,partid );
			   pst.setString(1, part_name);
			   pst.setString(2,part_email);pst.setString(4, status);
	    	
	    	int suxes2= pst.executeUpdate();
			   if(suxes2>0)
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
	    	PreparedStatement pst=con.prepareStatement("delete from registrations where partici_id=?");
	    	pst.setInt(1, id);
	    	int suxes1= pst.executeUpdate();
			   if(suxes1>0)
			   {
				   System.out.println("Successfully deleted");
				   
			   }
			   else
			   {
				   System.out.println("deletion failed");
				   
			   }
			   con.close();
	 }

}
