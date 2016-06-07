package hack;

public class decimal_round
{

	public static void main(String[] args)
	{
		int r = 1;
		double value = Math.PI*r*r;
		System.out.println((double)Math.round(value * 100000d) / 100000d);
		
		
	}

}
