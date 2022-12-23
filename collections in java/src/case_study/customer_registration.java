package case_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class customer_registration {
	public static void main(String[] args) {
		System.out.println("\n\t\tCUSTOMER REGISTRATION");
		System.out.println("___________________________________________________________");
		int choice=0;
		ArrayList list=new ArrayList();

		do {
                      Scanner s=new Scanner(System.in);
                      System.out.println("\n1) ADD");
                      System.out.println("2) READ");
                      System.out.println("3) UPDATE");
                      System.out.println("4) DELETE");
                         System.out.println("\nENTER YOUR CHOICE :");
                         choice=s.nextInt();

                       switch(choice)
                       {
                       case 1:
                    	   
                    	   ArrayList li=new ArrayList();
                    	   System.out.println("\n*) NAME :");
                       String a=s.next();
                       System.out.println("*) ADDRESS :");
                       String b=s.next();
                       System.out.println("*) PHONE NUMBER :");
                       int c=s.nextInt();
                       System.out.println("*) EMAIL ID :");
                       String d=s.next();

                       
                       list.add(a);
                       list.add(b);
                       list.add(c);
                       list.add(d);

                       
                    	   break;
                       case 2:
                    	   Iterator itr=list.iterator();
           				while(itr.hasNext())
           						{
           					System.out.print(itr.next()+"\n");
           						}
break;
                       case 3:
                    	   
                    	   System.out.println("");
                    	   
                    	   
                    	   break;
                       case 4:System.out.println("SUCCESSFULLY EXIT..........!");
       				return;
       			default:
       			    System.out.println("INVALID ENTER...!");


                       }
                       
							
		}while(choice!=0);
	}

}
