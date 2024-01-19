package Assignment;

import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		System.out.println("enter no of lines");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		
		
		for(int i=0;i<a;i++)
		{
			for(int s=1;s<=a-i;s++) 
			{
				System.out.print(" ");
			}
			
			int num=1;
			for(int j=0;j<=i;j++) 
			{
				System.out.print(num+" ");
				num=num * (i-j)/(j+1);
		
			}
			{
				System.out.println();
			}
				}
			
	}

}
