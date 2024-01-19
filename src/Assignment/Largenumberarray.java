package Assignment;

import java.util.Scanner;

public class Largenumberarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		System.out.println("enter the number");
		int a []=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int j=0;j<n;j++)
		{
			if(a[j]>a[0])
			{
	max=a[j];
}
		}
		
	
System.out.println("the largest number is:" + max);
	
}

}




