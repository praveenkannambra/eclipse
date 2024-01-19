package basic;

import java.util.Scanner;

public class Onedimenarray {

	public static void main(String[] args) {
	int a[]=new int[6];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your numbers:");
	
	for (int i=0;i<6;i++) {
		a[i]=sc.nextInt();
		
	}
	System.out.println("entered numbers are:");
	for(int i=0;i<6;i++) {
		{
			System.out.println(a[i]);
		}
	}

	}

}
