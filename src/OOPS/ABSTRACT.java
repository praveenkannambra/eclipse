package OOPS;

abstract class Google
{
 abstract void search();
 
 public void message()
 {
	 System.out.println(" thank you for using");
 }
}

class searchall extends Google {

	@Override
	void search() {
	{
		System.out.println("search all details");
	}
		
}
}

 class searchimage extends Google {

	@Override
	void search() {
		System.out.println("image search results");
		
		
	}
	 
	 
 }
 
 class searchvideo extends Google
 {

	@Override
	void search() {
		System.out.println("search video");
		
	}
	 
 }
  public class ABSTRACT {
	  public static void main(String[] args) {
		  searchall a= new searchall();
		  a.search();
		  a.message();
		   searchimage i= new searchimage();
		   i.search();
		   i.message();
		   searchvideo v=new searchvideo();
		   v.message();
		   v.search();
		  
	  }
	  
	  
  }