package com.app;
import java.util.Arrays;

public class Insertiondescending {
	

		
		public static int insertionSort(int arr[]) {
			int comp=0;
			for(int i=1;i<arr.length;i++) {
				int temp=arr[i];
				int j=i+1;
				comp++;
				while(j>=0 && arr[j]>temp) {
					arr[j-1]= arr[j];
					j++;	
				}
				arr[j-1]=temp;	
			}
			return comp;
			
		}
		
		
		
		
		public static void main(String []args) {
			
			int arr[]= {66,88,99,33,77,22,11};
			System.out.println("Array before sort :"+Arrays.toString(arr));
			int comp=insertionSort(arr);
			System.out.println("Array before sort :"+Arrays.toString(arr));
			System.out.println("comparison :"+comp);
			
		}
		
		
		
		
	}
