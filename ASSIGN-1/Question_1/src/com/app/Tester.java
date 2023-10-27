package com.app;

import java.nio.channels.NoConnectionPendingException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {55,66,88,99,44,66,77};
         for (int i : arr) {
        		System.out.print(i+",");
        		System.out.println();
		}
	     System.out.println("Enter the key for linear search:");
	     int key=sc.nextInt();
	     Nocomparison n= new Nocomparison();
	     int com=n.linerSearch(arr,key);
	     if(com!=-1) 
	    	 System.out.println("Number of comparison(linear ) to find key:"+com);
	    	 else
	     System.out.println("key not found");
	      
	     
	     System.out.println("************************************************************");
	     
		  
	     
	     
	     
	     
	     
	     
	     int ar[]= {11,33,44,55,66,77,88};
         for (int i : ar) {
			System.out.print(i+",");
			System.out.println();
         }
	     System.out.println("Enter the key for binary search:");   
	     int keg=sc.nextInt();
	     int comp=n.binarySearch(arr, keg);
	     if(comp!=-1) 
	    	 System.out.println("Number of comparison(linear ) to find key:"+comp);
	     else
	     System.out.println("key not found");
	      
	     
	}
	
	
}

