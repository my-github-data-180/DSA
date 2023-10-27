package com.app;

import java.util.Arrays;

public class Bubblesort {

	
	public static int bubbleSort(int arr[]) {
		     int comparisons=0;
		for(int i=1;i<arr.length;i++) {       //here 'i' has no use as such, it serve purpose of the size-1 passes(iterations)
			
			for(int j=0;j<arr.length-i;j++) {
				comparisons++;
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}
		return comparisons;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
	     int arr[]= {55,99,66,77,33,22,11};
	     System.out.println("Array before sort :"+Arrays.toString(arr));
	     int comp=bubbleSort(arr);
	     System.out.println("Array after sort :"+Arrays.toString(arr));
	        System.out.println("Comparison to sort array :"+comp);

	}

}
