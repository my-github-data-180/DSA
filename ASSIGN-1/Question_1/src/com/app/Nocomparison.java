package com.app;

import java.util.Scanner;

public class Nocomparison {
	  int comparison=0;
	public int linerSearch(int arr[],int key) {
      		
		for(int i=0; i<arr.length;i++) {
			comparison ++;
			if(key==arr[i])
			return comparison;
		}
	
		return comparison;	
	}
	
	
	
	public int binarySearch(int arr[],int key) {
	      comparison=0;
		int left=0,mid,right=arr.length-1;
		while(left<=right) {
		mid=(left+right)/2;
		 comparison++;
		if(arr[mid]==key) 
			return comparison;
		if(key>arr[mid])
		   left=mid+1;
		else
			right=mid-1;
		}
		return comparison;
	}
	
		
	}
		
	

