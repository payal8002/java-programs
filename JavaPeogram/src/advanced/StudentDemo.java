package advanced;

public class StudentDemo {
		
			 int id;
		   String name;
		  
		  public StudentDemo(int id, String name) {
			  this.id = id;
			  this.name = name;
			  
		  }
		  public int hashCode() {
			  return id;
			  
		  }
		  public boolean equals(Object obj) {
			  return this.hashCode()==obj.hashCode();
		  }

	}


