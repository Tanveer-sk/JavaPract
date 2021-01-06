package sortingAlgorithms;
import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args)
	{
		
		new BubbleSort().bubbleSortString();
		
	}
	
	public void bubbleSortInteger()
	{
		
	//	int[] a = {56,34,45,12,1,45,5,23,55,2,2};
		int[] a = {1,3,5,6};
		int temp;
		int round=0;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1;j++)
			{
				
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			round=round+1;
			
			//  if(flag==0) { break; }
			 
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(System.currentTimeMillis());
		System.out.println("Round number "+(round-1));
		
	}

	public void bubbleSortString()
	{
		String[] a = {"zeesh","zzz","Pit","Tan","Moss","Rzk","zohe"};
		String temp;
		
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
				
			}
			System.out.println(i);
			
			 if(flag==0) { break; }
			 
			
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}
}
