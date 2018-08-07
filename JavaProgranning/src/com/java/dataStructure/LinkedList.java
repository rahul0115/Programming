package com.java.dataStructure;
// this is the class which perform some specific task
public class LinkedList {
  Node head; // this is the head
  
  public void insert(int data) { // This is the Method use to insert the data from user
	  Node node= new Node(); // object creation of Node class
	  node.data=data;  //here we are getting the reference of node class and asigning the value 
	  
	  if(head==null) {
	   head=node;	  
	  }
	  else {
		  Node n=head;
		  while(n.next!=null) {
		     n=n.next;
		  }
		  n.next=node;
	  }
  }
  
  
public void show() {
   Node node =head;
   while(node.next!=null) {
	   System.out.println(node.data);
	   node=node.next;
   }
   System.out.println(node.data);
}
}
