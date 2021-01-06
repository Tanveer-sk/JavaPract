package pract1;

import java.util.Scanner;

public class Ptest {

	static int a=0,b=1,c;
	public static void main(String[] args)
	{

		Ptest p= new Ptest();
		p.columnPrinting();
	}

	public void palindrome()
	{


		String cont;

		/*
		 * for(int i=word2.length()-1;i>=0;i--) { rev=rev+name.charAt(i);
		 * 
		 * }
		 */

		do {

			System.out.println("Welcome to palindrome tester"); 
			Scanner sc = new Scanner(System.in); 
			System.out.println("Please enter the first word"); 
			String word1 = sc.next(); 
			/*
			 * System.out.println("Please enter the second word"); String word2 = sc.next();
			 */


			String rev="";
			String rev2="";

			String name = "Tanveer";
			//String rev;

			for(int i=word1.length()-1;i>=0;i--)
			{
				rev=rev+word1.charAt(i);

			}

			if(word1.equals(rev))
			{
				System.out.println("String is palindrome");
			}
			else
				System.out.println("Not a palindrome");


			System.out.println("Do you want to continue");
			cont=sc.next();

		}

		while(cont.equals("Y")||cont.equals("y"));



	}

	public void primtTest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		int test=0;


		for(int i=2;i<no-1;i++)
		{
			if(no%i==0)
			{
				test=test+1;
			}
		}
		if(test==0)
		{
			System.out.println("Number is prime");
		}
		else
			System.out.println("Number not prime");
	}

	public void prime1100() {

		String s ="";
		int num =0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range start");
		int start=sc.nextInt();

		System.out.println("Enter range end");
		int end=sc.nextInt();

		for(int i=start;i<=end;i++)
		{
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{

					num=num+1;

				}


			}

			if(num==0)
			{
				System.out.print(i+" ");
			}

			else
			{
				num=0;
			}

		}




	}

	public void fibonnaci()
	{
		int a =0,b=1;
		int c;
		System.out.print(a+ " "+b+" ");
		for(int i=0;i<10;i++)

		{

			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}





	}

	public void fiboRecur(int i)

	{
		if(i>=1)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fiboRecur(--i);

		}


	}

	public void Armstrong()
	{

		int no=12;
		int t1=no;
		int leng=0;
		int t2=no;
		int rem;
		int arm=0;
		while(t1!=0)
		{
			t1=t1/10;
			leng=leng+1;


		}
		//System.out.println(leng);

		while(t2!=0)
		{
			rem=t2%10;
			int mul=1;
			for(int i=1;i<=leng;i++)
			{
				//System.out.println(rem);
				mul=mul*rem;
			}

			arm=arm+mul;
			t2=t2/10;
			//	System.out.println(arm);
		}

		System.out.println(arm);
		if(arm==no)
		{
			System.out.println("Its an armstrong number");
		}
		else
			System.out.println("Not armstrong");


	}

	public void rtTriangle()
	{

		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Reverse Triangle");
		for(int i=0;i<4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void swithTest()
	{
		Scanner sc = new Scanner(System.in);
		String dec;
		do {
			
			int x, y, result;
			char s;
			System.out.println("Enter the first digit");
			
			x=sc.nextInt();
			System.out.println("Enter second digit");
			y=sc.nextInt();
			System.out.println("Select Operation");
			s=sc.next().charAt(0);
			switch(s)
			{
			case '+': 
					result=x+y;
					System.out.println("The sum is :"+result);
					break;
			case '-': 
				result=x-y;
				System.out.println("The sub is :"+result);
				break;
			case '/': 
				result=x/y;
				System.out.println("The div is :"+result);
				break;
			case '*': 
				result=x*y;
				System.out.println("The mul is :"+result);
				break;
					
				default:
					break;
							
			}
			System.out.println("Cont?");
			dec=sc.next();
		}
		
		while(dec.equals("Y")||dec.equals("y"));
		
		
		
	}
	
	public void rtwithSpace()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

	public void rtwithspactdouble()
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print("X");
			}
			System.out.println();
			
		}
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=3;k>=i;k--)
			{
				System.out.print("X");
			}
			System.out.println();
			
		}
		
		
	}
	
	public void pyramid()
	{
		for(int i=0;i<6;i++)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print(" X");
			}
			System.out.println();
		}
		
	}

	public void pyramidwithifelse()
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--) {
				
				if(j>i)
				{
					System.out.print(" ");
				}
				
				else
				{
					System.out.print(" X");
				}
			}
			
			System.out.println();
			
			
		}
		
		
		
	}

	public void pyramidwithifelseX()
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++) {
				
				if(j==i)
				{
					System.out.print("X");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
			
			
		}
		
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--) {
				
				if(j>i)
				{
					System.out.print(" ");
				}
				
				else
				{
					System.out.print("X");
				}
			}
			
			System.out.println();
			
			
		}
		
		
	}

	public void pyramidHollow()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print("-");
			}
			
			for(int j=1;j<=(2*i-1);j++)
			{
				if(i==5||j==1||j==(2*i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			
			
			
			
			System.out.println();
		}
		
		
		
		
		
		
	}

	public void hollowSquare()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=2&&j>=2&&i<=4&&j<=4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}
	
	public void rtnumerictriangle()
	{
		int count=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				
				System.out.print(count);
				count=count+1;
			}
			System.out.println();
			//count=0;
		}
		
	}
	
	public void rtnumerictrianglereverse()
	{
		int count=1;
		for(int i=1;i<4;i++)
		{
			for(int j=i;j>=1;j--)
			{
				
				System.out.print(j);
				//count=count+1;
			}
			System.out.println();
			//count=0;
		}
		
	}

	public void rtnumerichybrid()
	{
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=i-1;k>0;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
	
	public void reversenumberpyramidDesc()
	{
		int count =5;
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(j+" ");
				count--;
			}
			System.out.println();
			//count=5;
		}
	}
	public void charPyramid()
	{
		char c=1;
		for(int i=0;i<3;i++)
		{
			System.out.println(c);
			
			/*
			 * for(int j=1;j<i;j++) { System.out.println(c); }
			 */
		}
		
		
	}
	
	public void columnPrinting()
	{
		for(int i=0;i<=6;i++)
		{
			int num=i;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num+6-j;
			}
			System.out.println();
		}
	}
	
		
	}
