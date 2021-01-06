package Searches;

import java.util.Scanner;

import javax.xml.transform.Source;

public class LinearSearch {
	
	public static void main(String[] args)
	{
		new LinearSearch().stringsearch();
			
		}
	
	public void intsearch()
	{
		int[] a = {12,3,45,1,4,5,1};
		int tofind =1;
		int flag=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==tofind)
			{
				System.out.println("Element present at :"+i);
				flag=1;
				//break;
			}
			
			
			}
		
		if(flag==0)
		{
			System.out.println("Element not presnet");
		}
		
	}
		
	public void stringsearch()
	{
		String[] s = {"tan","dan","zan","moss"};
		System.out.println("enter the key");
		Scanner sc = new Scanner(System.in);
		String key = sc.next();
		
		
		//String key="moss";
		int flag=0;
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].contentEquals(key))
			{
				
				System.out.println("Word present at :"+i);
				flag=1;
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("String not found");
		}
		
		
		
	}
		
		
	}


