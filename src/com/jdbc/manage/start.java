package com.jdbc.manage;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class start {
	
	public static void main(String[] args) throws NumberFormatException, IOException { 
	
		
        System.out.println(" my jdbc tut" + "orial ");
       
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true) {
            System.out.println(" press 1 to add student");
            System.out.println(" press 2 to delete student");
            System.out.println("press 3 to display student");
            System.out.println("press 4 to exit app");
            int c=Integer.parseInt(br.readLine());
            
            if (c==1) {
            	
            	// add student
            	System.out.println("Enter user name");
            	String name= br.readLine();
            	
            	System.out.println("Enter user phone");
            	String phone= br.readLine();
            	
            	System.out.println("Enter user city");
            	String city = br.readLine();
            	
            	
            	student st =new student(name,phone,city);
                boolean answer = studentDao.insertStudentToDB(st);
                
                if(answer) {
                	System.out.println(" student is added sucessfully....");
                	
                }else {
                	
                	System.out.println(" Somerthing went wrong try again....");
                }
                
            	System.out.println(st);
				
            	
			}else if (c==2) {
				
				// delete student
				System.out.println("Enter student id to delete");
				int userId = Integer.parseInt(br.readLine());
			boolean	f = studentDao.deleteStudent(userId);
			if (f) {
				System.out.println("Deleted.....");
				
			}else {
				System.out.println("something went wrong ");
			}
			
				
			}else if (c==3) {
				// Display student
				System.out.println();
				studentDao.showAllStudent();
				
				
				
			}else if (c==4) {
				System.out.println();
				// exit
				break;
			}else {
				
				
			}
            
        }
        System.out.println("Thankyou for using my application...");
      System.out.println("See you soon... bye");
    }

        
        
	}

