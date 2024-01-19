package basic;

public class LogicalOperator {

	public static void main(String[] args) {
		String username="abc";
		String password="abcd";
		System.out.println(username=="abc" && password=="abcd");
		System.out.println(username=="abc" || password=="abcd");
		System.out.println(!(username=="abc"));

	}

}
