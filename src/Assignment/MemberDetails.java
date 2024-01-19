package Assignment;

 class Members {
	 
	int age;
	int salary;
	String address;
	String name;
 

	public void printdetails() 
	{
		System.out.println("age=" +age);
		System.out.println("salary="+salary);
		System.out.println("name="+name);
		System.out.println("address="+address);
	
	}
}
class Worker extends Members
{
	String specialization;
}
class Manager extends Members
{
	String department;
}


public class MemberDetails {
	
	 public static void main(String[] args) {
		 Worker e1= new Worker();
		 e1.age=34;
		 e1.salary=25000;
		 e1.address="abc";
		 e1.name="ronaldo";
		 e1.printdetails();
	 e1.specialization=" selenium ";
	 System.out.println("specialization"+ e1.specialization);
	 
	 Manager e2=new Manager();
	 e2.name="albin";
	 e2.age=25000;
	 e2.address="dce";
	e2.salary=4300;
	e2.department= "electronics";
	System.out.println("department"+ e2.department);
	e2.printdetails();
	 }
}
	
		
 
    		  
    		   
    	   
    	  
      

	


