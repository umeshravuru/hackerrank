package hack;

import java.util.Scanner;

public class zigzag_checking
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		String data ="aia";
		int ans =0;
		for(int i =0;i<data.length()-1;i++)
		{
			ans= ans+ Math.abs(data.charAt(i)-data.charAt(i+1));
		}
		System.out.println(ans); 
	
		
	}

}
