package hack;

public class number_of_divisors
{

	public static void main(String[] args)
	{
		for(long i =1;i<100000000;i++)
		{
			System.out.println((i*(i+1))/2+" - "+number_of_div((i*(i+1))/2));
		}
		
		
	}
	
	public static long number_of_div(long data)
	{

		long ans = 2;
		if (data == 1)
			ans = 1;
		long present = data;
		for (int i = 2; i < present; i++)
		{
			if (data % i == 0)
			{
				ans = ans + 2;
				if(data/i==i)
					ans--;
				present=data/i;
//				System.out.print(i);
			}
		}

		return (long)ans;
	}

}
