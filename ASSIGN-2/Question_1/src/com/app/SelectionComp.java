package com.app;

import java.util.Arrays;

public class SelectionComp {

	  public static int selectionSort(int arr[]) {
		  int comparisons=0;
	     for(int i=0;i<arr.length-1;i++) {
	    	 
	    	 for(int j=i+1;j<arr.length;j++) {
	    		 comparisons++;
	    		 if(arr[i]>arr[j]) {
	    			 int temp=arr[i];
	    			 arr[i]=arr[j];
	    			 arr[j]=temp;
	    		 }
	    		 
	    	 }
	    	 
	    	 
	     }
		  
	    return comparisons;
		  		  
	  }
	
	
	
	

	
	
	public static void main(String[] args) {
	
		int arr[]= {66,88,99,22,33,77,11};
		System.out.println("array before sort :"+Arrays.toString(arr));
		int comp=selectionSort(arr);
		System.out.println("array after sort :"+Arrays.toString(arr));
		System.out.println("Number of comparison made for sorting :"+comp);
		
	}

}
