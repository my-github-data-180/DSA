package com.app;

public class Nonrepeating {

	public static void main(String[] args) {
		
		int arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int num=0,i,j;
		int count=0;
		int num=nonReapeat()blic int nonRepeat(){
		
	for( i=0;i<arr.length-1;i++) {
		      
			for(j=0;j<arr.length-1;j++) {
				 if(i!=j && arr[i]==arr[j]){
					 break;
				 }	 
			}
			if(count==0) {
				return arr[i];
			}
			break;
	      
			
			
		}
		}
	  num= arr[i];
		System.out.println("First non-repeating element in array :"+num);	
}
}
7