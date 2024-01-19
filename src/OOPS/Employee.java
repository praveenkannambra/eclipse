package OOPS;

public class Employee {
		int empid;
		int salary;
		int deptno;
		String empname;
		
		
public void display()
			{
			
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(empname);
		System.out.println(deptno);
			}
			
			public static void main(String[] args) {
				
		Employee emp=new Employee();
		emp.deptno=200;
		emp.salary=24000;
		emp.empname="praveen";
		emp.empid=1;
		emp.display();
	

}
}