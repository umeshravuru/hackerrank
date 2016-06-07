package hack;

import java.util.Scanner;

public class Larry_s_Array_2
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii =0;ii<t;ii++)
		{
			int n = s.nextInt();
			int data [] = new int [n];
			for(int i =0;i<data.length;i++)
			{
				data[i]=s.nextInt();
			}
			int total =0;
			for(int i =0;i<data.length-1;i++)
			{
				for(int j =i+1;j<data.length;j++)
				{
					if(data[i]>data[j])
						total++;
				}
			}
			
			if(total%2==0)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		
		
	}

}
