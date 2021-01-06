package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Array1 {

	public static void main(String args[])
	{

		new Array1().differentways();

	}

	public void general()
	{
		int empid[]=new int[100];
		empid[0]=1;
		System.out.println(empid[0]);


		int[] b = {12, 13, 14};
		for(int i=0;i<b.length;i++)
		{ 
			System.out.print(b[i]+" ");
		}

		for(int i:b)
		{
			System.out.println(i);
		}
	}

	public void userinput1D()
	{
		String cont;
		int i=0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter the size of the Array");
			int size=sc.nextInt();


			int[] array=new int[size];


			for(int k=0;k<array.length;k++)
			{
				System.out.println("Enter the values");
				int values =sc.nextInt();
				array[k]=values;

			}




			for(int j=0;j<array.length;j++)
			{
				System.out.println(array[j]);
			}
			System.out.println("Continue?");
			cont=sc.next();
		}
		while(cont.contentEquals("Yes")||cont.contentEquals("yes")||cont.contentEquals("Y"));
	}

	public void arr2d()  //jagged Array
	{
		int[][] a = {{12,34,54,55},{23,25},{32,35,37}};

		System.out.println("points to the single array"+a[0]);


		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}




	}

	public void arr3d()
	{
		int[][][] a = {{{10,20},{30,40,50,60},{70,80}}};

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}

		}


	}

	public void differentways()
	{
		int[] a = {10,20,30};
		int[] c = {101,20,303};
		System.out.println("Single Array");
		for(int i:a)
		{

			System.out.print(i+" ");
		}

		System.out.println();
		System.out.println(Arrays.toString(a));


		int[][] b = {{10,20},{30,40}};
		System.out.println("2D Array");

		System.out.println(Arrays.deepToString(b));

	 int test = Arrays.compare(a, c);
				System.out.println(test);



	}


}
