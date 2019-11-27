package set;
import java.util.*;
import java.util.Set;
public class Setcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,count=0;
		String symbol;
		Set<NewCard> s= new TreeSet<NewCard>(new Symbol());
		NewCard[] c= new NewCard[40];
		System.out.println("Enter no of symbols");
		int n= sc.nextInt();
		while(s.size()<n)
		{
			symbol=sc.next();
			num=sc.nextInt();
			c[count]=new NewCard();
			c[count].setSymbol(symbol);
			c[count].setNum(num);
			s.add(c[count]);
			count++;
		}
		System.out.println(n+"symbols gathered in "+count+" cards.");
		System.out.println("Cards are ");

		Iterator<NewCard> itr= s.iterator();
		while(itr.hasNext())
		{
			NewCard ca = (NewCard)itr.next();
			System.out.println(ca.getSymbol()+" "+ca.getNum());
		}
		
	}

}
