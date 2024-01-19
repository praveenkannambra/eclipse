package Assignment;

import java.util.Scanner;

public class Ascendingorder {

	public static void main(String[] args) {
		int a[]= new int[10];
		int n,i,j,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		n=sc.nextInt();
		System.out.println("enter the numbers");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++) {
				if( a[i]<a[j] ){
				temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
		}
		System.out.println(" array in ascending order is:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}

	}

}
