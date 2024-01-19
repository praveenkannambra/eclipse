package basic;

public class STRING {

	private static final char[] l = null;

	public static void main(String[] args) {
    String s5="luminar123";
    System.out.println(s5.toUpperCase());
    System.out.println(s5.toLowerCase());
    System.out.println(s5.endsWith("3"));
    System.out.println(s5.startsWith("3"));
    
    //compare two strings
    
    String a="abc";
    String b="Abc";
    System.out.println(a.equals(b));
    System.out.println(a.equalsIgnoreCase(b));
    
    //trim
    
    String q=" hello ";
    System.out.println(q);
    System.out.println(q.trim());
    
    //extract portion
    
    String y="welcome";
    System.out.println(y.substring(3));
    System.out.println(y.substring(0,4));
    
    //words or char is present or not
    
    String x="welcome to Luminar";
    System.out.println(x.contains("luminar"));
    
    //replace
    
    System.out.println(x.replace("el","xy"));
    
    //to display a particular character
    
    String z="welcome";
    System.out.println(z.charAt(4));
    
    //split
    
    String w1="welcome to luminar";
    String[] words=w1.split(" ");
    for(String l:words)
    {
    	System.out.println(l);
    }

 

	}

}
