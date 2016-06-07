package hack;

import java.util.ArrayList;

public class Project_Euler_131_Prime_cube_partnership
{

	public static void main(String[] args)
	{
		
		ArrayList<Long> primes = new ArrayList<Long>();
		primes.add((long)2);
		for(long i =3;i<Math.pow(10, 1)*25;i++)
		{
			int che =0;
			for(long j =0;j<primes.size();j++)
			{
				if(i%primes.get((int) j)==0)
				{
					che = 1;
					break;
				}
			}
			if(che==0)
			{
				primes.add(i);
			}
		}
		
		
//		System.out.println(primes);
		
		
		for(int i =0;i<primes.size();i++)
		{
			
			
			
		}
		
		
	}

}
