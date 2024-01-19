package OOPS;

 class car{
	 void speed()
	 {
		 System.out.println("car speed");
		 
	 }
void power(){

	System.out.println("car power");
}
}
	 class Bmw extends car{

		@Override
		void speed() {
			System.out.println("bmw speed");
			
			super.speed();
		}
	 
		@Override
		void power() {
System.out.println("bmw power");
			super.power();
		}
 }
	 public class Methodoverriding3{
	 
	public static void main(String[] args) {
		Bmw ob= new Bmw();
		ob.speed();
		ob.power();
	}
	 }
 
 


