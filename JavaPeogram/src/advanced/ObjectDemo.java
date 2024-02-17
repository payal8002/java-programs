package advanced;

public class ObjectDemo {

	public static void main(String[] args) {
		Demo d1 = new Demo(101,"Dinga");
		int hashCode1 = d1.hashCode();
		Demo d2 = new Demo(101,"Dinga");
		int hashCode2 = d2.hashCode();
		System.out.println(hashCode1);
		System.out.println(hashCode2);
		System.out.println(d1.equals(d2));
		System.out.println(d1.toString());
		System.out.println(d2);
		
		
		
	}
	

}
