package set;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set= new HashSet<String>();
		set.add("Sreekumar");
		set.add("Anjali");
		set.add("Jinsu");
		set.add("Anjali");
		set.add("Sreehari");
		set.add("Sreehari");
		set.add("Saritha");
		set.add("Vijay");
		
		Iterator itr= set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
