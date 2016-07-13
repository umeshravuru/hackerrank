package beer_night;

public class fibinnaci_numbers_1 
{

	public static void main(String[] args) // using encapuslation
	{
		fib_num_encap obj  = new fib_num_encap();
		obj.setFib(10);
		obj.fib_num_encap();
	}

}


class fib_num_encap
{
	private int fib;
	public int getFib()
	{
		return fib;
	}

	public void setFib(int fib)
	{
		this.fib = fib;
	
	
	}
	public void fib_num_encap ()
	{
		if (fib == 1)
			System.out.println("0");
			else if (fib == 2)
				System.out.println("1");
				else
		{
			int a = 0;
			int b = 1;
			int c = 0;
			for (int i = 3; i <= fib; i++)
			{
				c = a + b;
				a=b;
				b=c;
				System.out.println(c +" ");
			}
		}
		
	}
	




}