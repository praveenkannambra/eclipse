package Assignment;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		{
			System.out.println(" enter a string");
		}
		String s= sc.next();
		char a[]=s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}

	}

}
