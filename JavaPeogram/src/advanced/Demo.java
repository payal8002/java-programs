package advanced;
class Demo {
     int id;
     String name;
  public Demo (int id ,String name) {
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
		return name+""+id;
	}
}
