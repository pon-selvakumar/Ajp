package JAVAPROJECT;

import java.sql.SQLException;
import java.util.Scanner;

public class jdbcMain {

	public static void  main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Eventjdbc crud=new Eventjdbc();
		Participantsjdbc crud1=new Participantsjdbc();
		Venuejdbc crud2=new Venuejdbc();
		Regestrationjdbc crud3=new Regestrationjdbc();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println( );
				System.out.println("|Enter 1 to manage Event_details         |	WELCOME TO EVENT MANAGEMENT SYSTEM	|    operations:");
				System.out.println("|Enter 2 to manage Participants_details  |				                |            =>Enter .1 to insert");
				System.out.println("|Enter 3 to manage Venue_details         |					        |            =>Enter .2 to read");
				System.out.println("|Enter 4 to manage registeration_details |					        |            =>Enter .3 to update");
				System.out.println("| PRESS 99.99 TO CLOSE CONNECTION        |					        |            =>Enter .4 to delete");
//				double dd=in.nextDouble();
//				if(dd==1.2)
//				{
//					System.out.println("success");
//				}
//			p.insert();
				int disp1=0 ,disp2=0,disp3=0,disp4=0;
				while(1>0)
				{
					double gotable=in.nextDouble();
					if(gotable==1.1)
					{
						if(disp1==0)
						{
							System.out.println("welcome to table Event details");
							disp1++;
						}
						
						int id=0; String name,manager,ph;
						
							//Inserting operation
						System.out.println("Enter the Event_id ");
						id=in.nextInt();
						System.out.println("Enter the Event name:");
						name=in.next();
						System.out.println("Enter  manager name");
						manager=in.next();
						System.out.println("Enter manager phone number:");
						ph=in.next();
						crud.insert(id,name,manager,ph);
					}
//					Reading operation
					if(gotable==1.2)
					{
						if(disp1==0)
						{
							System.out.println("welcome to table Event details");
							disp1++;
							}
							crud.read();
					}
					if(gotable==1.3)
					{
						if(disp1==0)
						{
							System.out.println("welcome to table Event details");
							disp1++;
						}
					//	updating operation
						int idd=0; String nname,managerr,pho;
						System.out.println("update Event name:");
						nname=in.next();
						System.out.print("Update Event manager");
						managerr=in.next();
						System.out.print("Update manager ph:");
						pho=in.next();
						System.out.print("NOW enter the Event id to update these:");
						idd=in.nextInt();
						crud.update(nname, managerr, pho, idd);
					}
					if(gotable==1.4)//						deleting operation
					{
						if(disp1==0)
						{
							System.out.println("welcome to table Event details");
							disp1++;
						}

						int Id;
						System.out.println("Enter the Event id to delete the row");
						Id=in.nextInt();
						crud.delete(Id);
					}
//					break;
			        //complete (if) line for event_details.
					
				    if(gotable==2.1)//participants table.
				    {
					   if(disp2==0)
					   {
						   System.out.println("welcome to table participants table");
						   disp2++;
					   }
					    int part_id;
						String part_name,part_email,evname;
						System.out.println("Enter the Event name:");
						evname=in.next();
						System.out.println("Enter the participant_id ");
						part_id=in.nextInt();
						System.out.println("Enter particpant name:");
						part_name=in.next();
						System.out.println("Enter  participant email");
						part_email=in.next();
						crud1.insert(evname, part_id, part_name, part_email);
				}
				if(gotable==2.2)//read
				{
					if(disp2==0)
					{
						System.out.println("welcome to table participants table");
						disp2++;
					}
					crud1.read();
				}
				if(gotable==2.3)
				{
					if(disp2==0)
					{
						System.out.println("welcome to table participants table");
						disp2++;
					}
					int id;
					String name,ename,email;
					System.out.println("update Event name:");
					ename=in.next();
					System.out.print("Update participant name");
					name=in.next();
					System.out.print("Update participant email:");
					email=in.next();
					System.out.print("NOW enter the participant id to update these:");
					id=in.nextInt();
					crud1.update(ename, name, email, id);
				}
				if(gotable==2.4)
				{
					if(disp2==0)
					{
						System.out.println("welcome to table participants table");
						disp2++;
					}
					int iid;
					System.out.println("Enter the participant id to delete the row");
					iid=in.nextInt();
					crud1.delete(iid);
				}
				//complete (if) line for participant_details.
				if(gotable==3.1)//Avenue table.
				{
					if(disp3==0)
					{
						System.out.println("welcome to Avenue table");
						disp3++;
					}
					//insert
					int id;
					System.out.println("Enter the Event id ");
					id=in.nextInt();
					String evname,vname,date;
					System.out.println("Enter the Event name:");
					evname=in.next();
					System.out.println("Enter venue name:");
					vname=in.next();
					System.out.println("Enter  Event date ");
					date=in.next();
					crud2.insert(id, evname, date, vname);
				}
					if(gotable==3.2)
					{//read
						if(disp3==0)
						{
							System.out.println("welcome to Avenue table");
							disp3++;
						}
						crud2.read();
					}
					if(gotable==3.3)//update
					{
						if(disp3==0)
						{
							System.out.println("welcome to Avenue table");
							disp3++;
						}
						int id;
						String evname,vname,date;
						System.out.println("update Event name:");
						evname=in.next();
						System.out.print("Update venue name");
						vname=in.next();
						System.out.print("Update date:");
						date=in.next();
						System.out.print("NOW enter the Event id to update these:");
						id=in.nextInt();
						crud2.update(id, evname, vname, date);
						
					}
					if(gotable==3.4)//delete
					{
						if(disp3==0)
						{
							System.out.println("welcome to Avenue table");
							disp3++;
						}
						int id;
						System.out.println("Enter the Event id to delete the row");
						id=in.nextInt();
						crud2.delete(id);
						
					}	
				// Avenue if block completed.
				if(gotable==4.1)
				{
					if(disp4==0)
					{
						System.out.println("welcome to Regestration details:");
						disp4++;
						}
					//insert
					int part_id;
					String part_name,part_email,fee,st;

					System.out.println("Enter the participant_id ");
					part_id=in.nextInt();
					System.out.println("Enter particpant name:");
					part_name=in.next();
					System.out.println("Enter  participant email");
					part_email=in.next();

					System.out.println("Enter the fee:");
					fee=in.next();
					System.out.println("Enter the payment status:");
					st=in.next();
					crud3.insert(fee, part_id, part_name, part_email, st);
				}
				if(gotable==4.2)//read
					{
					if(disp4==0)
					{
						System.out.println("welcome to Regestration details:");
						disp4++;
						}
						crud3.read();
					}
				if(gotable==4.3)//update
				{
					if(disp4==0)
					{
						System.out.println("welcome to Regestration details:");
						disp4++;
						}
					int part_id;
					String part_name,part_email,fee,st;
						
					System.out.print("Update participant name:");
					part_name=in.next();
					System.out.print("Update participant email:");
					part_email=in.next();
					System.out.print("update payment Status: ");
					st=in.next();
					System.out.println("Update fee Structure:");
					fee=in.next();
						
					System.out.print("NOW enter the participant id to update these:");
					part_id=in.nextInt();
					crud3.update(fee, part_id, part_name, part_email, st);
	
					}
					if(gotable==4.4)//delete
					{
						if(disp4==0)
						{
							System.out.println("welcome to Regestration details:");
							disp4++;
							}
						int id;
						System.out.println("Enter the participant id to delete the row");
						id=in.nextInt();
						crud3.delete(id);
					}
					if(gotable==99.99)
					{
						System.out.println("  		 ALL CHANGES ARE SAVED SUCCESSFULLY ---- THANK YOU ---- CONNECTION GET CLOSED! ");
						return;
					}
				}
		}
			
				
			
	}
}
