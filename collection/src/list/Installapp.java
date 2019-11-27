package list;
import java.util.*;
public class Installapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList list= new ArrayList();
		//App ob[] new App(40);
		int n;
		String name="";
		do {
			System.out.println("1.Display installed Applications\n2.Install an application\n3.Uninstall an application\n4.Quit\n");
			n= s.nextInt();
			if(n>4)
			{
				System.out.println("Invalid input");
				break;
			}
			else
			{
			switch(n)
			{
			case 1:if(list.isEmpty())
			{
				System.out.println("There is no application installed");
			}
			else
			{

			System.out.println("installed application are");
			Iterator itr = list.iterator();// iteration object is created
			int i = 1;
			while (itr.hasNext())
			{

			System.out.println(i + ")" + itr.next());
			i++;
			}
			}
			break;
			case 2:
				
				System.out.println("Enter name");
				name= s.next();			
				list.add(name);
				System.out.println("Application installed successfully");
			break;
			case 3:if(list.isEmpty())
			{
				System.out.println("No applications installed");
			}
			else {
				System.out.println("Installed applications are");
				Iterator itr= list.iterator();
			    int i=1;
				while (itr.hasNext())
				  {

				    System.out.println(i + ")" + itr.next());
				    i++;
				  }			
			System.out.println("Enter the application number");
			int num=s.nextInt();
			  if (num> i)
			  {
			  System.out.println("application not found");
			  }		
			  list.remove(num-1);
			  System.out.println("Application uninstalled successfully");
			  break;						
			}
			}
			}
		}while(n!=4);
	}
}
