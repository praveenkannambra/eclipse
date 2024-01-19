package OOPS;

public class Parameterconstructor {
	
	int empid;
	int salary;
	String designation;
	
	
	public Parameterconstructor(int id,int sal,String desig)
	{
		empid = id;
		salary=sal;
		designation=desig;
		
	}
	public static void main(String[] args) {
		
		Parameterconstructor ob1=new Parameterconstructor(112,34000,"tester");
		System.out.println(ob1.empid);
		System.out.println(ob1.salary);
		System.out.println(ob1.designation);
		
		
	}

}
