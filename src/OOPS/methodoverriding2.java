package OOPS;

 class Parent
 
 {
	 public void phone()
	 {
		 System.out.println("nokia");
	 }

 }
 class Child extends Parent
 {
	 public void phone()
	 {
	 
	 super.phone();
	 System.out.println("iphone");
 }
 
 }
 public class methodoverriding2 {
	 
	 public static void main(String[] args) {
		 Child c=new Child();
		 c.phone();
	 }
 }
 