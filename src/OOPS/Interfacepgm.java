 package OOPS;

interface Whatsappcalls
 {
 int a=10;
	 
	 
	 
	 
	 void calls();
	 void mute();
	 void disconnect();
}
class Audiocalls implements Whatsappcalls{

	@Override
	public void calls() {
		System.out.println("whatsapp calls");
		
		
	}

	@Override
	public void mute() {
		System.out.println("whatsappcall was mute");
		
	}

	@Override
	public void disconnect() {
		System.out.println("whatsappcall was diconnnect");
		
	}
	
}

class Videocalls implements Whatsappcalls{

	@Override
	public void calls() {
		System.out.println("videocalls");
		
	}

	@Override
	public void mute() {
		System.out.println("videocall was mute");
		
		
	}

	@Override
	public void disconnect() {
	  System.out.println("videocall was disconnect");
		
	}
	
	
	
}  

public class Interfacepgm{
	public static void main(String[] args) {
		int a=20;
		Audiocalls w= new Audiocalls();
		w.calls();
		w.mute();
		w.disconnect();
		Videocalls v=new Videocalls();
		v.calls();
		v.mute();
		v.disconnect();
		Whatsappcalls ob= new Audiocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		ob= new Videocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		System.out.println(Whatsappcalls.a);
		//System.out.println(Whatsappcalls.a=20);
		
	}
}