package pack1;

import java.util.Scanner;

public class PostiveorNegative 
{
	Scanner sc=new Scanner(System.in);
	public void meth1()
	{
		System.out.println("enter num:");
		int x=sc.nextInt();
		if(x>0)
		{
			System.out.println("postive num");
		}
		else if(x<0)
		{
			System.out.println("Negative num");
		}
		else
		{
			System.out.println("num is zero");
		}
	}
	public void meth2()
	{
		System.out.println("enter num:");
		int x=sc.nextInt();
		if(x==0)
		{
			System.out.println("num is zero");
		}
		else
		{
			String result=x>0?"num is postive":"num is negative";
			System.out.println(result);
		}
	}
	public static void main(String[] args) 
	{
		PostiveorNegative obj=new PostiveorNegative();
		obj.meth1();
		System.out.println("------------");
		obj.meth2();
		
	}
}
