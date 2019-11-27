package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n= s.nextInt();
		
		ArrayList list= new ArrayList();//ArrayList declaration
		//ArrayList<String> list=new ArrayList();
		//ArrayList<Integer> list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name");
			String name= s.next();
			System.out.println("Enter the age");
			int age= s.nextInt();
			list.add(name);//add method
			list.add(age);			
		}
		//System.out.println(list.get(0));
		//list.remove(0);
		//System.out.println(list.get(0));
		/*ArrayList list1=(ArrayList)list.clone();
		System.out.println("Clone value "+list1.get(0));//get clone value
		list1.remove(0);// to remove the value
		System.out.println(list1.get(0));*/
		System.out.println("Enter the update name");
		String name1=s.next();
		list.set(0, name1);//set is to update the value
		//list.clear();//to clear everything
		//System.out.println("List values");
		Iterator itr= list.iterator();//It is used to traverse elements one by one
		while(itr.hasNext())//return boolean value true if element is present otherwise false
		{
			System.out.println(itr.next());//Returns the next element in the iteration
		}

	}

}
