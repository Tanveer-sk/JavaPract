package sortingAlgorithms;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		new SelectionSort().logic();

	}
	
	public void logic()
	{
		int[] a= {15,4,34,2,55,6};
		int min;
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
			System.out.println("loop number"+i+Arrays.toString(a));
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}

}
