package Assignment;


class Student {
 
 public void mark()
 {
	 System.out.println("mark");
 }
  public  void details() 
  {  
   System.out.println("details");
  
 }
 }
  class Classteacher extends Student implements principle {
  
	  public void department()
	  {
	  System.out.println("department");
	  
  }

@Override
public void resign() {
	System.out.println("resign");
	
}

@Override
public void rejoin() {
	System.out.println("rejoin");
	
}
  
  
  }

interface principle
  {
	  public void resign();
	  public void rejoin();
  
 }
  
  public class Student123{
	  public static void main(String[] args) {
		  Classteacher c = new Classteacher();
		  c.details();
		  c.mark();
		  c.department();
		  c.rejoin();
		  c.resign();
	  }
  
  
  }


  
  
  
 
