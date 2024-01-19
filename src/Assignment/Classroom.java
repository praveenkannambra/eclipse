package Assignment;

public class Classroom {
	int rollno;
	int mark;
	String name;
   public void store(int rollno,int mark,String name) {
		this.rollno=rollno;
		this.mark=mark;
		this.name=name;
	}
  public void display() {
	  System.out.println("rollno="+ rollno);
	  System.out.println("mark="+ mark);
	  System.out.println("name=" + name);
	  
  
  
  
  }
  public static void main(String[] args) {
	  Classroom obj = new Classroom();
	  obj.store(1, 110,"praveen");
	  obj.display();
  }
}
