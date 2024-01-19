package OOPS;

 class Encap{
	 private String name;
	 private String designation;
	 public String getName() {
		 return name;
	 }
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setName(String name) {
		this.name = name;
	}

	}


 
 
 
 public class Encapsuation{
	 public static void main(String[] args) {
		 Encap ob = new Encap();
		ob.setName("rakhy");
		System.out.println(ob.getName());
		ob.setDesignation("tester");
		System.out.println(ob.getDesignation());
	 }
 }
