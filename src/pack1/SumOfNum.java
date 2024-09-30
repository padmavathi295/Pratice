package pack1;

import java.util.Scanner;

public class SumOfNum 
{
	Scanner sc=new Scanner(System.in);
	public void meth1()
	{
		System.out.println("enter num1");
		int n1=sc.nextInt();
		System.out.println("enter num2");
		int n2=sc.nextInt();
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
			sum=sum+i;//n2*(n2+1)/2 – n1*(n1+1)/2 + n1.
		}
		System.out.println(sum);
	}
	
	public int getsum(int sum,int n1,int n2 )
	{
		if(n1>n2)
			return sum;
		return n1+getsum(sum,n1+1,n2);
	}
	public static void main(String[] args) 
	{
		SumOfNum obj=new SumOfNum();
		obj.meth1();
		System.out.println("-----------------");
		//int result=obj.getsum(0,12,15);
		//System.out.println(result);
	}

}
