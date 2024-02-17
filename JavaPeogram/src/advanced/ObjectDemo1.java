package advanced;

 class Demo1 implements Cloneable{
	 int id;
	 String name;
	 
	 public  Demo1(int id, String name) {
		 this.id = id;
		 this.name = name;
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
		protected void finalize() throws Throwable{
			System.out.println("Finalize executed to clean up the memory");
		
					}
		 protected  Object clone() throws CloneNotSupportedException{
			 System.out.println("Object is being copied");
			 return super.clone();
		 
		 
		
	 }
 }

public class ObjectDemo1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Program starts ....");
		Demo1 d1 = new Demo1(101,"Dinga");
		Object Obj = d1.clone();
		Demo1 d2 =  (Demo1) Obj;		
		System.out.println(d1.id);
		System.out.println(d1.name);
		System.out.println(d2.id);
		System.out.println(d2.name);
		System.out.println("Program end...");
	}

}
