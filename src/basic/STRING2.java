package basic;

public class STRING2 {

	public static void main(String[] args) {
	 String s="jmeter ";
	 String s1="performance testing tool";
	 String a= s + s1;
	 System.out.println(a);
 //2
	  String f="java language is platform independent";
	  if (f.contains("language"))
	  {
	  System.out.println("pass");
	}
	  else
	  {
		System.out.println("fail");  
	  }
	  
	  //3
	  
	  String s3="selenium webdriver is used for webapplication testing";
	  String[] words=s3.split(" ");
	 for( String l:words)
	 System.out.println(l);
	 System.out.println(s3.contains("webapplication"));
	 
	 //to char array
	 String t="hello";
	 char[] c1=t.toCharArray();
	 for(char v:c1)
	 {
		 System.out.println(v);
	 }
	}

}
