package pack1;

import java.util.Scanner;

public class SumFirstnNaturalNum 
{
	Scanner sc=new Scanner(System.in);
	public void meth1()
	{
		System.out.println("enter value");
		int n=sc.nextInt();
		int result=0;
		for(int i=1;i<=n;i++)
		{
		    result=result+i;
		    
		}
		System.out.println(result);
	}
	public void meth2(int n)
	{
		int result=0;
		for(int i=1;i<=n;i++)
		{
		    //result=result+i;
			result+=i;
		    
		}
		System.out.println(result);
	}
	public void meth3()
	{
		int n=6;
		System.out.println((n*(n+1))/2);
	}
	public int getsum(int n)
	{
		if(n==0)
			return n;
		return n+getsum(n-1);
	}
	public static void main(String[] args) 
	{
		SumFirstnNaturalNum obj=new SumFirstnNaturalNum();
		//obj.meth1();
		//System.out.println("------------");
		//obj.meth2(6);
		//System.out.println("------------");
		obj.meth3();
		System.out.println("------------");
		int result=obj.getsum(6);
		System.out.println(result);
	}

}
