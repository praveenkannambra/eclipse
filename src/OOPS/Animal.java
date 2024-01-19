package OOPS;

//SingleInheritance {

 class Dog
 {
	 public void barking()
	 {
	 System.out.println("dog is barking");
	 } 
 }
 class Cat extends Dog
 {
	 public void sleeping()
	 {
	  System.out.println(" cat is sleeping");
		
	 }
	} 
	 public class Animal{
    public static void main(String[] args) {
       Cat c= new Cat();
      c.barking();
      c.sleeping();
    
    
    
    }
 }

 
    
    
    
 
