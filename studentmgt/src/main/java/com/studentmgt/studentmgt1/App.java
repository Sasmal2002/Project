package com.studentmgt.studentmgt1;


import java.util.Scanner;

import com.studentmgt.studentmgt.Dao.StudentDao;
import com.studentmgt.studentmgt.Daoimpl.StudentDaoImpl;
import com.studentmgt.studentmgt.entity.Address;


public class App {

	

	public static void main(String[] args) {
	
			    	StudentDao stu=new StudentDaoImpl();
			    	int k;
					 do{
			    	System.out.println("1. Create Student");
			    	System.out.println("2. View Student");
			    	System.out.println("3. Update Student");
			    	System.out.println("4. Delete Student");
			    	System.out.println("5. Exit");
			    	
			    	System.out.println("Enter choice :");
			    	Scanner sc=new Scanner(System.in);
			    	int ch=sc.nextInt();
			    	switch (ch)
			    	{
			    		
			    	//insert
			    		case 1:
			    			System.out.println("Enter Name :");
				    		String name=sc.next();
				    		System.out.println("Enter contact:");
				    		String contact=sc.next();
				    		System.out.println("Enter the house no:");
				    		String hno=sc.next();
				    		System.out.println("Enter the Area name:");
				    		String area=sc.next();
				    		System.out.println("Enter the City name:");
				    		String city=sc.next();
				    		System.out.println("Enter the State:");
				    		String state=sc.next();
				    		System.out.println("Enter the Pin code:");
				    		String pin=sc.next();
				    		Address add=new Address(hno,area,city,state,pin);
				    		stu.insertstudent(name,contact,add);
				    		break;
				    		//view
			    	case 2:
			    		System.out.println("Enter Student Id :");
						int id=sc.nextInt();
						System.out.println(stu.viewstudent(id));
						break;
						//update
						case 3:
			    	
						System.out.println("Enter Id: ");
						id=sc.nextInt();
						System.out.println("Enter name: ");
						name=sc.next();
						System.out.println("Enter contact: ");
						contact=sc.next();
						System.out.println("Enter the house no:");
			    		hno=sc.next();
			    		System.out.println("Enter the Area name:");
			    		 area=sc.next();
			    		System.out.println("Enter the City name:");
			    		city=sc.next();
			    		System.out.println("Enter the State:");
			    		state=sc.next();
			    		System.out.println("Enter the Pin code:");
			    		pin=sc.next();
			    		add=new Address(hno,area,city,state,pin); 
						stu.updatestudent(id,name,contact,add);
						 break;
					//delete
					case 4:
						System.out.println("Enter Id ");
					 id=sc.nextInt();
					 stu.deletestudent(id);
				System.out.println("Record deleted successfully...");
				break;
				//exit
				case 5:
					System.exit(0);
		    	
			    	}
			    	
			    	System.out.println("Do you want to continue?(1/0): ");
			    	 k=sc.nextInt();
					 }
			    	while(k==1);	 
			    
		}
	}    	




	