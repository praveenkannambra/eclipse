package basic;

public class withoutsize2dim {

	public static void main(String[] args) {
		int a[][]= {{10,20,60,},{30,40,80}};
		for (int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j + " ");
			}
			System.out.println();

		}

	}

}
