package hack;

import java.util.Scanner;

public class Chef_and_Coins_Game
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i =0;i<n;i++)
		{
			int data = s.nextInt();
			if(data%6==0)
				System.out.println("Misha");
			else
				System.out.println("Chef");
		}
		
		
	}

}
