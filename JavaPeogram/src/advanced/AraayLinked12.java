package advanced;

import java.util.ArrayList;

public class AraayLinked12 {
	public static void main(String[] args) {
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
		v2.addAll(v1);
		System.out.println(v2.contains("Payal"));
		System.out.println(v2.contains("Payl"));
	}
}
