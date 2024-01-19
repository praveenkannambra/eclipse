package Assignment;

public class Triangle {

	public static void main(String[] args) {
	 Triangle t= new Triangle();
	 System.out.println(t.area(15,30));
	 

	}
	
		public int area(int b,int h)
		{
			int v=(int) (.5*b*h);
			return v;
	}
}
