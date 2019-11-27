package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size");
		int n= s.nextInt();
		LinkedList list= new LinkedList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name");
			String name= s.next();
			System.out.println("Enter the Rollno");
			int roll= s.nextInt();
			System.out.println("Enter the Age");
			int age= s.nextInt();
			System.out.println("Enter the place");
			String place= s.next();
			System.out.println("Enter the department");
			String dept= s.next();
			list.add(name);
			list.add(roll);
			list.add(age);
			list.add(place);
			list.add(dept);
			
		}
		Iterator itr= list.iterator();
		while(itr.hasNext())
		{		
			System.out.println(itr.next());
		}
			

	}

}
