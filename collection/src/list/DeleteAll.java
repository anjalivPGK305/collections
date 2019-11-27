package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DeleteAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList list= new ArrayList();
		System.out.println("Enter the elements");
		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		String str4=s.next();
		list.add(str1);//to add elements in arraylist
		list.add(str2);
		list.add(str3);
		list.add(str4);
		
		Iterator itr= list.iterator();//to traverse elements one by one
		while(itr.hasNext())//to check element present or not.returns true if present else false
		{
			System.out.println(itr.next());//prints the elements
		}
		list.clear();//to delete all elements
		

	}

}
