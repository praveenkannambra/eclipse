package OOPS;
class Monkey
{
void jump()
{
	System.out.println("jump");
	
}
void bite()
{
	System.out.println("bite");
	
}
}
class Human extends Monkey implements basicanimal{
public void speak()
{
	System.out.println("speak");
	
}

@Override
public void cat() {
	System.out.println("cat");
	
}

@Override
public void sleep() {
	System.out.println("sleep");
	
}

}


 interface basicanimal
{
	public void cat();
	public void sleep();
}

public class Interface{
	public static void main(String[] args) {
		Human h =new Human();
		h.jump();
		h.speak();
		h.sleep();
		h.cat();
		h.bite();
		
	}

}
	



	