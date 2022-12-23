package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class array_list {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	ArrayList list=new ArrayList();
	
	System.out.println("\nEnter First Number");
	int a=s.nextInt();
	System.out.println("Enter a String :");
	String b=s.next();
	System.out.println("Enter second number :");
	int c=s.nextInt();
	
	
	list.add(a);
	list.add(b);
	list.add(c);
	
	
	Iterator itr=list.iterator();
	System.out.print("[");
	while(itr.hasNext())
			{
		System.out.print(itr.next()+" ");
			}
	System.out.println("]");
		
	}

}
