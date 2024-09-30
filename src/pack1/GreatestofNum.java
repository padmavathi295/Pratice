package pack1;

import java.util.Scanner;

public class GreatestofNum 
{
	Scanner sc=new Scanner(System.in);
	public void greatestof2num()
	{
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		if(a==b)
		{
			System.out.println("Both are equal");
		}
		else if(a>b)
			System.out.println("a is greater num");
		else
			System.out.println("b is greater num");
	}
	public void greatestof2num1()
	{
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		if(a==b)
		{
			System.out.println("Both are equal");
		}
		else
		{
			String result=(a>b)?"a is greater num":"b is greter num";//System.out.println(Math.max(num1, num2) + " is greater");
			System.out.println(result);
		}
	}
	public void greatestof3num()
	{
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		System.out.println("enter c");
		int c=sc.nextInt();
		if(a>b&&a>c)
			System.out.println("a is greater num");
		else if(b>c)
			System.out.println("b is greater num");
		else
			System.out.println("c is greater num");

	}
	public void greatestof3num1()
	{
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		System.out.println("enter c");
		int c=sc.nextInt();
		int temp=a>b?a:b;
		int result=temp>c?temp:c;
		System.out.println(result+"is greater");
	}
	public static void main(String[] args) 
	{
		GreatestofNum obj=new GreatestofNum();
		//obj.greatestof2num();
		//System.out.println("----------------");
		//obj.greatestof2num1();
		//System.out.println("----------------");
	      //obj.greatestof3num();
	      System.out.println("----------------");
	      obj.greatestof3num1();
	}

}
