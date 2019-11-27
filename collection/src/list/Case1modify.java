package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Case1modify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n= s.nextInt();
		int i;
		int k=1;
		String str,email1;
		ArrayList list= new ArrayList();
		Customer1[] cust= new Customer1[n];
		for(i=0;i<n;i++)
		{
			cust[i]= new Customer1();
			System.out.println("Enter the name:");
			String name=s.next();
			System.out.println("Enter the address:");
			String address = s.next();
			System.out.println("Enter the contact number:");
			String contact= s.next();
			System.out.println("Enter E-mail ID:");
			String email= s.next();
			System.out.println("Enter prooftype:");
			String ptype=s.next();
			System.out.println("Enter proofID:");
			int pid= s.nextInt();
			System.out.println("Thanks for Registering.Your id is "+k);
			k++;
			System.out.println("Update email?(yes/no)");
			str=s.next();
			String m=str.toLowerCase();
			if(m.contentEquals("yes")==true)
			{
				System.out.println("Enter the update emailid:");
				email1=s.next();
				cust[i].setName(name);
				cust[i].setAddress(address);
				cust[i].setContact(contact);
				cust[i].setEmail(email1);
				cust[i].setPtype(ptype);
				cust[i].setPid(pid);
			}
			else
			{
				cust[i].setName(name);
				cust[i].setAddress(address);
				cust[i].setContact(contact);
				cust[i].setEmail(email);
				cust[i].setPtype(ptype);
				cust[i].setPid(pid);
			}
			list.add(cust[i]);
		}
		Iterator itr= list.iterator();
		int j=1;
		while(itr.hasNext())
		{
			Customer1 c= (Customer1)itr.next();
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
		Iterator itr1= list.iterator();
		int l=0;
		while(itr1.hasNext())
		{
			Customer1 c= (Customer1)itr1.next();
			System.out.println(l+" "+c.getName());
			l++;
		}
		System.out.println("Do you want to delete (yes/no)");
		String d= s.next();
		if(d.contentEquals("yes")==true)
		{
			System.out.println("Enter the index to delete");
			int index=s.nextInt();
			list.remove(index);
			Iterator itr2= list.iterator();
			while(itr2.hasNext())
			{
				Customer1 c= (Customer1)itr2.next();
				System.out.println("Name->"+c.getName());
				System.out.println("Address->"+c.getAddress());
				System.out.println("Contact Number->"+c.getContact());
				System.out.println("E-mail ID->"+c.getEmail());
				System.out.println("ProofType->"+c.getPtype());
				System.out.println("Proof ID->"+c.getPid());
				System.out.println();
			}
		}
	}

}
class Customer1{
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

