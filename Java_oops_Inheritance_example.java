package oops;

public class Java_oops_Inheritance_example
{

	public static void main(String[] args)
	{
		A_Inheritance_main tem  = new A_Inheritance_main();
		
		System.out.println(tem.diff(10, 10));
		
		
	}

}

class A_Inheritance
{

	public int sum(int a, int b)
	{
		return a + b;

	}

	

}

class A_Inheritance_main extends A_Inheritance
{

	public int diff(int a, int b)
	{
		return a - b;

	}

}