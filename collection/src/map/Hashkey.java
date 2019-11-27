package map;
import java.util.*;
public class Hashkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String name;
		int age,n,i;
		n=s.nextInt();
		Map<Integer,Employee1> map= new HashMap<Integer,Employee1>();
		Employee1[] emp= new Employee1[n];
		for(i=0;i<n;i++)
		{
			name= s.next();
			age= s.nextInt();
			emp[i]= new Employee1();
			emp[i].setAge(age);
			emp[i].setName(name);
			map.put(i, emp[i]);
		}
		for(Map.Entry<Integer,Employee1> entry:map.entrySet())
		{
			int key=entry.getKey();
			Employee1 e= entry.getValue();
			System.out.println(key+e.getName()+e.getAge());
		}

	}

}
class Employee1{
	String name;
	int age;
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
	
}
