package Searches;

public class BinarySearch {

	public static void main(String[] args) {

		new BinarySearch().logic2();

	}
	
	public void logic()
	{
		int[] a = {1,3,5,6,8,9};
		int mi;
		int li=0;
		int hi=a.length-1;
		int flag=0;
		int test=3;
		while(li<=hi)
		{
			mi=(li+hi)/2;
			
			if(test==a[mi])
			{
				System.out.println("Element found at index "+ mi);
				flag=1;
				break;
			}
			
			else if(a[mi]<test)
			{
				li= mi+1;
			}
			
			else
			{
				hi=mi-1;
			}
		}
		
		if(flag==0)
		{
			System.out.println("Element not present");
		}
		
	}

	public void logic2()
	{
		int[] a = {1,3,4,5,6,7};
		int li=0;
		int hi=a.length;
		int flag=0;
		int search=1;
		int mi=0;
		
		for(int i=0;i<a.length;i++)
		{
			 mi =(li+hi)/2;
			if(a[mi]==search)
			{
				flag=1;
			}
			
			else if(a[mi]<search)
			{
				li=li+1;
				
			}
			
			else
			{
				hi=hi-1;
			}
			
		}
		if(flag==0)
		{
			System.out.println("Element Not Presnet");
		}
		else
			System.out.println("Element Present at index :"+mi);
	//	System.out.println);
		
		System.out.println(Integer.MIN_VALUE);
		
	}
}
