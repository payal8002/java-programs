package advanced;

import java.util.ArrayList;
import java.util.Iterator;

public class ArarayLinked1 {

	public static void main(String[] args) {
		System.out.println("===========ArrayLinked================");
		ArrayList<String> v= new ArrayList<String>();
		v.add("Arun");
		v.add("Zaid");
		v.add("Harshit");
		v.add("Payal");
		v.add("Lovely");
		Iterator it = v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	

}
