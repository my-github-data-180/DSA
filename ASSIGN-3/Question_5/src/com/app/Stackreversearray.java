package com.app;

import java.util.Scanner;

public class Stackreversearray {

	public static void main(String [] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int size=sc.nextInt();
		int arr[]= new int[size];
		Stack st = new Stack(size);
		System.out.println("ENTER THE ELEMETS OF ARRAYS:  ");
		for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
			 st.push(arr[i]);
			
		}
	    
		System.out.println("REVERSE ARRAY :");
		for(int j=0;j<size;j++) {
			System.out.println(st.pop());
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
