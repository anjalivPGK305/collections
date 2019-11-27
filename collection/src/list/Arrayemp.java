package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arrayemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		int id;
		String name;
		int age;
		int salary;
		String quali;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size");
		n= s.nextInt();
		ArrayList list= new ArrayList();
		Employee[] emp= new Employee[n];
		for(i=0;i<n;i++)
		{
			emp[i]=new Employee();
			System.out.println("Enter employee id");
			//id= s.nextInt();
			emp[i].setId(s.nextInt());
			System.out.println("Enter employee name");
			//name= s.next();
			emp[i].setName(s.next());
			System.out.println("Enter the age");
			//age= s.nextInt();
			emp[i].setAge(s.nextInt());
			System.out.println("Enter the salary");
			//salary= s.nextInt();
			emp[i].setSalary(s.nextInt());
			System.out.println("Enter qualification");
			//quali= s.next();
			emp[i].setQuali(s.next());		
			list.add(emp[i]);
			
		}
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext())
		{
			Employee e = itr.next();
			System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary()+" "+e.getQuali());
		}
		

	}

}
class Employee{
	int id;
	String name;
	int age;
	int salary;
	String quali;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getQuali() {
		return quali;
	}
	public void setQuali(String quali) {
		this.quali = quali;
	}
	
}
