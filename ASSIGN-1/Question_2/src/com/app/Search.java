package com.app;

public class Search {
	
	public  Employee idSearch(Employee []arr,int e){
      	for(int i=0; i<arr.length-1;i++) {
    	       if(e==arr[i].getId()) 
    	    	  
    	      
    	    	   return arr[i];
    	    	   
      	}
		return null;
		
      	
	
	    	   
    }
	
	
	
	public Employee nameSearch(Employee []arr,String e){
      	for(int i=0; i<arr.length-1;i++) {
    	       if(arr[i].getName().equalsIgnoreCase(e))
    	    	   return arr[i];
    	      
      	}
      	
	    	   return null;
    }
	
	
	
	
	public Employee salarySearch(Employee []arr,double e){
      	for(int i=0; i<arr.length-1;i++) {
    	       if(e==arr[i].getSalary())
    	    	   return arr[i];
    	      
      	}
      	
	    	   return null;
    }
	
	
	
	
	
	
	
	

}
