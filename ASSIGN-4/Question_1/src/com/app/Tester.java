package com.app;

public class Tester {
public static void main(String []args) {
	List list =new List();
	list.addFirst(10);
	list.addFirst(20);
	list.addFirst(30);
	list.addFirst(40);
	list.addFirst(50);
	list.displayList();
	
    list.deleteFirst();
    list.displayList();
    
    list.addLast(5);
    list.displayList();
    
    list.deleteLast();
    list.displayList();
}
}
