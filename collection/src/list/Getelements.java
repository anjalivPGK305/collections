package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Getelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList list= new ArrayList();
		System.out.println("Enter the size");
		int n= s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Name");
			String name= s.next();
			System.out.println("Age");
			int age= s.nextInt();
			list.add(name);
			list.add(age);
			
		}
		Iterator itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		

	}

}
