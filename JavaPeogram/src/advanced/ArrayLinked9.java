package advanced;
import java.util.*;
public class ArrayLinked9 {

	public static void main(String[] args) {
		System.out.println("================ArrayList=====================");
		ArrayList<String> v = new ArrayList<String>();
		v.add("Arun");
		v.add("Zaid");
		v.add("Harshit");
		v.add("Payal");
		v.add("Lovely");
		Object[] array = v.toArray();
		for(int i =0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
