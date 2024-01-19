package Assignment;

import java.util.Scanner;

public class Vowels123 {

	public static void main(String[] args) {
		int vowels=0;
		int nonvowels=0;
		try (Scanner sc =new Scanner(System.in)){
			System.out.println("enter a word");
			String a =sc.nextLine();
			
		for (int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowels=vowels+1;
			}else
			{
				nonvowels=nonvowels+1;
			}
		}
		}
				System.out.println("vowels count:" +vowels);
						;
				System.out.println("nonvowels count:" +nonvowels);
			}
		}
			
			
		
				

	


