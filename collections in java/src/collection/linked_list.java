package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linked_list {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	LinkedList list=new LinkedList();
	
	
	System.out.println("\nEnter Your name :");
	String name=s.next();
	System.out.println("Enter Your Age :");
	int age=s.nextInt();
	System.out.println("Enter Your Address :");
	String address=s.next();
	
	
	list.add(name);
	list.add(age);
	list.add(address);
	System.out.print(list);
	
}
//Iterator itr=list.iterator();
//System.out.print("[");
//while(itr.hasNext());
//{
//	System.out.print(itr.next()+" ");
//} 
//	System.out.print("]");
//	
//}
}
