package pack1;

import java.util.Scanner;

public class LeapYr 
{
	Scanner sc=new Scanner(System.in);
	public void meth1()
	{
		System.out.println("enter year");
		int year=sc.nextInt();
		if(year%400==0||(year%4==0&&year%100!=0))
		{
			System.out.println(year+"is leap year");
		}
		else
			System.out.println(year+"is not leap year");
	}
	public void meth2()
	{
		System.out.println("enter year");
		int year=sc.nextInt();
		String result=(year%400==0||(year%4==0&&year%100!=0))?(year+" is leap year"):(year+"s is not leap year");
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		LeapYr obj=new LeapYr();
		//obj.meth1();
		System.out.println("---------");
		obj.meth2();
		
	}
}
