package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n= s.nextInt();
		int i;
		String str,email1;
		ArrayList list= new ArrayList();
		Customer[] cust= new Customer[n];
		for(i=0;i<n;i++)
		{
			cust[i]= new Customer();
			System.out.println("Enter the name:");
			cust[i].setName(s.next());
			System.out.println("Enter the address:");
			cust[i].setAddress(s.next());
			System.out.println("Enter the contact number:");
			cust[i].setContact(s.next());
			System.out.println("Enter E-mail ID:");
			cust[i].setEmail(s.next());
			System.out.println("Enter prooftype:");
			cust[i].setPtype(s.next());
			System.out.println("Enter proofID:");
			cust[i].setPid(s.nextInt());
			System.out.println("Update email?(yes/no/Yes/No/YES/NO)");
			str=s.next();
			if(str.contentEquals("yes")==true || str.contentEquals("Yes")==true || str.equals("YES"))
			{
				System.out.println("Enter the update emailid:");
				email1=s.next();
				cust[i].setName(s.next());
				cust[i].setAddress(s.next());
				cust[i].setContact(s.next());
				cust[i].setEmail(email1);
				cust[i].setPtype(s.next());
				cust[i].setPid(s.nextInt());
			}
			else
			{
				cust[i].setName(s.next());
				cust[i].setAddress(s.next());
				cust[i].setContact(s.next());
				cust[i].setEmail(s.next());
				cust[i].setPtype(s.next());
				cust[i].setPid(s.nextInt());
			}
			list.add(cust[i]);
		}
		Iterator<Customer> itr= list.iterator();
		int j=1;
		while(itr.hasNext())
		{
			Customer c= itr.next();
			System.out.println("Customer Details:"+j);
			System.out.println();
			System.out.println("Name->"+c.getName());
			System.out.println("Address->"+c.getAddress());
			System.out.println("Contact Number->"+c.getContact());
			System.out.println("E-mail ID->"+c.getEmail());
			System.out.println("ProofType->"+c.getPtype());
			System.out.println("Proof ID->"+c.getPid());
			System.out.println();
			j++;
			//System.out.println(c.getName()+" "+c.getAddress()+" "+c.getContact()+" "+c.getEmail()+" "+c.getPtype()+" "+c.getPid());
		}

	}

}
class Customer{
	String name;
	String address;
	String contact;
	String email;
	String ptype;
	int pid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
}

