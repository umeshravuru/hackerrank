package hack;

import java.util.Scanner;

public class Fair_Rations_1
{

	public static void main(String[] args)
	{
		
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int data [] = new int [n];
		long sum =0;
		int che =0;
		for(int i =0;i<n;i++)
		{
			data[i]= s.nextInt();
			sum = sum + data[i];
			if(data[i]%2==1)
				che++;
		}
		
		System.out.println(sum+" "+che);
		
	}

}
