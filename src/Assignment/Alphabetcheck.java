package Assignment;

import java.util.Scanner;

public class Alphabetcheck {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a character");
		char ch = sc.next().charAt(0);
		
		
		if (Character.isLetter(ch)) {
			System.out.println(ch + " is an alphabet");
		}
		
		else {
			System.out.println(ch + " is not an alphabet");
			
		}
		}

	}


