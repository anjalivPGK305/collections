package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Addall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<String> list= new ArrayList<String>();//declaring stringarray with object list
		list.add("Hai");//to add elements in arraylist
		list.add("Welcome");
		list.add("Face");
		ArrayList<String> list1= new ArrayList<String>();//declaring stringarray with object list1
		list1.add("Java");
		list1.add("program");
		list.addAll(list1);//adding elements of both the elements together
		Iterator itr= list.iterator();//to traverse elements one by one
		while(itr.hasNext())//returns true if element present else false
		{
			System.out.println(itr.next());//print the elements
		}
		
		

	}

}
