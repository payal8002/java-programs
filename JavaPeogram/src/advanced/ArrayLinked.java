package advanced;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinked {

	public static void main(String[] args) {
		System.out.println("===========ArrayLinked================");
		ArrayList<String> v= new ArrayList<String>();
		v.add("Arun");
		v.add("Zaid");
		v.add("Harshit");
		v.add("Payal");
		v.add("Lovely");
		System.out.println(v.get(0));
		System.out.println(v.get(4));
		System.out.println("======================LinkedList=======================");
		LinkedList<String> s = new LinkedList<String>(); 
		s.add("Arun");
		s.add("Zaid");
		s.add("Harshit");
		s.add("Payal");
		s.add("Lovely");
		System.out.println(v.get(0));
		System.out.println(v.get(4));
		
	}
}
