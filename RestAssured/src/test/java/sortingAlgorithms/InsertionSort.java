package sortingAlgorithms;
import java.util.Arrays;



public class InsertionSort {

	public static void main(String[] args)
	{
		new InsertionSort().logic();
	}
	
	public void logic()
	{
		int[] a = {4,2,1,6,9};
		int swap=0;
		
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
		//	int swap=0;
			
			for(int j=i+1;j>0;j--)
			{
				if(temp<a[j])
				{
					swap=temp;
					temp=a[i];
					a[i]=swap;
					
				}
				
			}
			
			System.out.println(Arrays.toString(a));
			
		}
	}
}
