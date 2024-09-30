package pack1;

public class ClassA 
{
	public void meth1()
	{
		System.out.println("meth1() called");
	}
	public void meth2()
	{
		System.out.println("meth2() called");
	}
	public static void main(String[] args) 
	{
		//new ClassA().meth1();
		//new ClassA().meth2();
		ClassA obj=new ClassA();
		obj.meth1();
		obj.meth2();
		
	}

}
