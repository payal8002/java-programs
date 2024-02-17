package advanced;

import java.util.Set;

import java.util.*;

  class Employee{
	String name;
	int id;
	public Employee(String name , int id) {
		this.name=name;
		this.id=id;
	}
	public int hashCode() {
		return id;
		
	}
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
	public String toString() {
		return name+" "+id;
	}
}




public class CollectionsTest {

	public static void main(String[] args) {
		Employee c1=new Employee("Mukesh",121);
		Employee c2 =new Employee("Jyoti",122);
		Employee c3 =new Employee("Arun",121);
		Employee c4 =new Employee("Payal",121);
		Employee c5 =new Employee("Komal",121);
		Employee c6 =new Employee("Komal",121);
		
		
		HashSet set=new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		set.add(c5);
		set.add(c6);
		
    System.out.println(set);
	}

}
