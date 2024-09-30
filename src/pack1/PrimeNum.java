package pack1;

import java.util.Scanner;

public class PrimeNum 
{
	Scanner sc=new Scanner(System.in);
	public void meth1()
	{
		System.out.println("enter num");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
			
		}
		if(count==2)
		{
			System.out.println(num+" is prime num");
		}
		else
			System.out.println(num+" is not prime num");
	}
	
	public void meth3()
	{
		System.out.println("enter num");
		int num=sc.nextInt();
	    boolean prime = true;
	    
        if (num<2)
	       {
	          prime = false;
	       }
	     else
	       {
	          for (int i=2;i<num;i++)
	          {
	        	  if (num%i==0)
		             {
	        		  prime = false;
		               break;
		              } 
	           }
	       }

	     String result = prime ? "Prime" : "not Prime";
	     System.out.println ("The number " + num + " is : " + result);
	}
	public static void main(String[] args) 
	{
		PrimeNum obj=new PrimeNum();
		//obj.meth1();
		System.out.println("---------");
		obj.meth3();
	}

}
