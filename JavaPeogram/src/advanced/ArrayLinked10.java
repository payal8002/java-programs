package advanced;

import java.util.ArrayList;

public class ArrayLinked10 {

	public static void main(String[] args) {
		System.out.println("==========================Collection methods===========================");
		ArrayList<String> v1 = new ArrayList<String>();
		v1.add("Chaya");
		v1.add("Shil");
		v1.add("Ajay");
		ArrayList<String> v2 = new ArrayList<String>();
		v2.add("Arun");
		v2.add("Zaid");
		v2.add("Harshit");
		v2.add("Payal");
		v2.add("Lovely");
		System.out.println("before add all the v1 element, size of v2:"+v2.size());
		System.out.println(v2);
		v2.addAll(v1);
		System.out.println("after add all the v1 element, size of v2:"+v2.size());
		System.out.println(v2);
	}

}
