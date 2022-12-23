package case_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class crud_app_using_arraylist {
	public static void main(String[] args) {
		System.out.println("\n\tCRUD APP USING ARRAYLIST");
		System.out.println("____________________________________________________________________________________________________________");
		int choice=0;
		ArrayList list=new ArrayList();

		do {
			
			Scanner s=new Scanner(System.in);
			System.out.println("\n1) DISPLAY INSTALLED APPLICATION");
			System.out.println("2) INSTALL AN APPLICATION");
			System.out.println("3) UNINSTALL AN APPLICATION");
			System.out.println("4) UPDATE");
			System.out.println("5) QUIT");
			
			System.out.println("\nEnter Your Choice :");

		    choice=s.nextInt();
		
			
			switch(choice)
			{
			case 1:if(list.isEmpty()) {
				System.out.println("There is no application installed");
			}
			
			else {
				
				Iterator itr=list.iterator();
				while(itr.hasNext())
						{
					System.out.print(itr.next()+",");
						}
			              }
			break;
			case 2:
				System.out.println("Enter Application Name :");
				String a=s.next();
			list.add(a);
			System.out.println("Installed Successfully...!");
			break;
			
			case 3:
				System.out.println("Enter the index number to be deleted :");
				var n=s.nextInt();
				list.remove(n);
				System.out.println("Application uninstalled Successfully...!");
			
			break;
			case 4:
				System.out.println("Enter the index number to be updated :");
				var u=s.nextInt();
				System.out.println("Enter application do you want to update :");
				String up=s.next();
				list.set(u, up);
				System.out.println(up+"/tupdated Successfully...!");
				break;
			case 5:System.out.println("SUCCESSFULLY EXIT..........!");
				return;
			default:
			    System.out.println("INVALID ENTER...!");

			}
	
		}while(choice!=0);
		
		
		
	}

}
