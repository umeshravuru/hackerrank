package hack;

import java.util.Scanner;

public class different
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext())
		{
			String data = s.nextLine();
			long a = Long.parseLong(data.split(" ")[0]);
			long b = Long.parseLong(data.split(" ")[1]);
			System.out.println(Math.abs(a-b));
		}
		
	}

}
