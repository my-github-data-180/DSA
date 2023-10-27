package com.app;

import java.util.Scanner;

public class Tester {

	static Employee arr[] =new Employee[5];
	public static void main(String[] args) {
		
       Scanner sc= new Scanner (System.in);
       Search s= new Search();
       Employee e=new Employee();

	  
       
       int choice = 0;
       do {
    	   System.out.println("Enter employee details:");
    	   System.out.println("1.Accept employee data");
    	   System.out.println("2.Search by employee id:");
    	   System.out.println("3.Search by  employee name:");
    	   System.out.println("4.Search by  employee salary:");
    	   System.out.println("4 EXIT:");
    	   System.out.println("Enter the choce:");
    	   choice=sc.nextInt();
    	   
    	   
    	   switch(choice) {
    	   
    	   case 1:
    		   int i=0;
    			   arr[i]=e.acceptData();
    		   i++;
    	   break;
    	   
    	   
    	   case 2:
    		   System.out.println("Enter employee id:");
    		   int idd=sc.nextInt();
    		   
    		  
    		   Employee em=s.idSearch(arr, idd);  
    		   System.out.println(em);
    	   break;
    	   
    	   
    	   
    	   case 3:
    		   System.out.println("Enter the name:");
    		   String nam=sc.next();
    		  
    		   Employee empp=s.nameSearch(arr, nam);  
    		   System.out.println(empp);
    	   break;
    	   
    	   
    	   case 4:
    		 
    		   System.out.println("Enter the salary:");
    		   double sal=sc.nextDouble();
    		  
    		   Employee emp=s.salarySearch(arr, sal);
    		   System.out.println(emp);
    	   break;
    	   
    	  	   
    	   }
       }while(choice!=0);
       
       
      
       
       
       
       
       
       
       
       

	}

}
