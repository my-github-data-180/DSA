

package com.app;

public class List {

	public class Node{
		private int data;
		private Node next; 
		
		public Node(int value) {
			data=value;
			next=null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public List() {
	 head=null;	
	 tail=null;
	}
	
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public void addFirst(int value){
		Node newnode =new Node(value);
		
		if(isEmpty()) {
			head=newnode;
		}
		else
		{
			 newnode.next=head;	
			 head=newnode;
			
		}	 
	}
	
	
	
	public void deleteFirst() {
	    
	    if(isEmpty()) {
	    	head=null;
	    	
	    }
	    else if(head.next==null)
	    {
	    head=null;	
	    }
	    else
	    {
	    Node trav= head;
	    if(trav.next.next!=null) {
	    trav=trav.next;
	    head=trav;
	    }
	    
	    }
	    
	}
	
	
	
	public void addLast(int value){
	   Node newnode =new Node(value);
	   
	   if(isEmpty()){
		head=newnode;   
	   }
	   else 
	   {
	    Node trav=head;
	    while(trav.next!=null)
	    	trav= trav.next;
	    
	    trav.next=newnode;
	   }	
	}
	
	
	
	public void deleteLast() {
		if(isEmpty()) {
			head=null;
		}else if(head.next==null) {
			head=null;
		}
		else
		{
			Node trav=head;
			
			while(trav.next.next!=null)
				trav=trav.next;
	
			trav.next=null;
		}
	}
	
	
	
	public void displayList() {
		Node trav=head;
		System.out.println("List  :");
		
		while(trav!=null) {
			System.out.println(" "+trav.data);
			trav=trav.next;		
		}
		System.out.println();
		
		
	}
	
	
	
}