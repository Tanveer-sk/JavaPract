package Searches;
import java.util.*;

public class minmaxValue {

	public static void main(String[] args) {
		new minmaxValue().minlogic();
		new minmaxValue().maxlogic();
	}
	
	public void minlogic()
	{
		int[] a = {2,4,999,12,1,897};
		int temp=a[0];
		Arrays.parallelSort(a);
		System.out.println("Sorted is "+Arrays.toString(a));
		//syso
		for(int i=0;i<a.length;i++)
		{
			
			if(temp>a[i])
			{
				temp=a[i];
			}
		//	temp;
			
		}
		
		System.out.println(temp);
	}

	public void maxlogic()
	{
		int[] a = {211,34,5,2,5,222};
		int temp=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(temp<a[i])
			{
				temp=a[i];
			}
		}
		System.out.println(temp);
	}
}
