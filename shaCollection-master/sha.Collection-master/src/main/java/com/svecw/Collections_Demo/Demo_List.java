package com.svecw.Collections_Demo;
import java.util.*;
public class Demo_List {
	public static void main(String args[]){
	ArrayList<Integer> ar = new ArrayList<Integer>() {{
		   add(1);
		   add(2);
		   add(3);
		   add(4);
		   add(5);
		   add(6);
		   add(7);
		   add(8);
		   add(9);
		   add(10);
		}};
		LinkedList<Integer> ll = new LinkedList<Integer>() {{
		   add(1);
		   add(2);
		   add(3);
		   add(4);
		   add(5);
		   add(6);
		   add(7);
		   add(8);
		   add(9);
		   add(10);
		}};
		System.out.println("Enter 1/2:");
		Scanner s = new Scanner(System.in);
		int c=s.nextInt();
		while(c==1||c==2){
		if(c==1){
		System.out.println("In ArrayList:");
		System.out.println("Enter 1/2/3/4");
		int opt=s.nextInt();
		if(opt==1){
		System.out.println("Enter index:");
		int i = s.nextInt();
		System.out.println("Retrieved element"+ar.get(i));
		}
		else if(opt==2){
		System.out.println("Enter index:");
		int i = s.nextInt();
		System.out.println("Deleted element"+ar.remove(i));
		}
		else if(opt==3){
		System.out.println("Enter element:");
		int i = s.nextInt();
		ar.add(i);
		System.out.println("Element added");

		}
		else if (opt == 4)
		System.out.println(ar);
		}
		else{
		System.out.println("In LinkedList:");
		System.out.println("Enter 1/2/3/4");
		int opt=s.nextInt();
		if(opt==1){
		System.out.println("Enter index:");
		int i = s.nextInt();
		System.out.println("Retrieved element"+ll.get(i));
		}
		else if(opt==2){
		System.out.println("Enter index:");
		int i = s.nextInt();
		System.out.println("Deleted element"+ll.remove(i));
		}
		else if(opt==3){
		System.out.println("Enter element:");
		int i = s.nextInt();
		ll.add(i);
		System.out.println("Element added");

		}
		else if (opt == 4)
		System.out.println(ll);

		}
		System.out.println("Enter 1/2:");
		c=s.nextInt();
		}
		}
		}
