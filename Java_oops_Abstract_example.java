package oops;

public class Java_oops_Abstract_example
{

	public static void main(String[] args)
	{
		mahesh now = new suresh();
		
		now.call();
		now.cook();
		
		
	}

}

abstract class mahesh
{
	public void call()
	{
		System.out.println("Calling..");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}


abstract class ramesh extends mahesh
{
	public void move()
	{
		System.out.println("Moving..");
	}
}

class suresh extends ramesh
{
	public void dance()
	{
		System.out.println("Dancing..");
	}
	
	public void cook()
	{
		System.out.println("Cooking..");
	}
}