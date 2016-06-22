package oops;

public class Java_oops_constructor_example
{

	public static void main(String[] args)
	{
		
		A temp = new A(10);
		
		System.out.println(temp.i);
		System.out.println(temp.f);
	}

}

class A
{
	int i;
	float f;
	
	public A()
	{
		i = 10;
		f = (float)5.5;
		System.out.println("here");
		
	}
	
	public A(int a)
	{
		i = a;
		f = (float)a;
		System.out.println("not here");
	}
	
	
	
}
