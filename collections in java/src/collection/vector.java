package collection;

import java.util.Scanner;
import java.util.Vector;

public class vector {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Vector v=new Vector();
	System.out.println("Enter Your Name :");
	String name=s.next();
	System.out.println("Enter Your Age :");
	int age=s.nextInt();
	
	
	v.add(name);
	v.add(age);
	
	System.out.print(v);
}
}
