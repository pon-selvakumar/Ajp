package JAVAPROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Participantsjdbc {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/event";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "psk5512";
	
	 public void insert(String evname,int partid,String part_name,String part_email) {
		   try
		   {
			   Connection con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
			   PreparedStatement pst=con.prepareStatement("insert into parti values(?,?,?,?);");
			   pst.setString(2,evname);
			   pst.setInt(1,partid );
			   pst.setString(3, part_name);
			   pst.setString(4,part_email);
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
	    	PreparedStatement pst=con.prepareStatement("select * from parti");
	    	ResultSet rs=pst.executeQuery();
	    	while(rs.next())
	    	{
	    		System.out.println("Event_name:"+rs.getString(2)+" participant_id:"+rs.getShort(1)+" participant_name:"+rs.getString(3)+" participant_email"+rs.getString(4));
	    	}
	    	con.close();
	    	
	    }
	    public void update(String evname,String name,String email,int id) throws SQLException
	    {
	    	Connection con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
	    	PreparedStatement pst=con.prepareStatement("update parti set evname=?,parti_name=?,parti_email=? where parti_id=? ");
	    	 pst.setString(1,evname);
			   pst.setInt(4,id );
			   pst.setString(2, name);
			   pst.setString(3,email);
			   int Suxes1=pst.executeUpdate();
			   if(Suxes1>0)
			   {
				   System.out.println("Successfully updated");
				   
			   }
			   else
			   {
				   System.out.println("updation  failed");
				   
			   }
			   con.close();
			   
			   
	    }
	    public void delete(int id) throws SQLException
	    {
	    	Connection con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
	    	PreparedStatement pst=con.prepareStatement("delete from parti where parti_id =?");
	    	pst.setInt(1, id);
	    	int Suxes2=pst.executeUpdate();
			   if(Suxes2>0)
			   {
				   System.out.println("Successfully deleted");
				   
			   }
			   else
			   {
				   System.out.println("not deleted");
				   
			   }
			   con.close();
	    	
	    	
	    }

}

