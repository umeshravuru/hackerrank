package hack;

import java.util.Scanner;

public class Fair_Rations
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int data [] = new int [n];
		
		for(int i =0;i<n;i++)
		{
			data[i]= s.nextInt();
		}
		int final_Ans = 0;
		for(int i =0;i<n-1;i++)
		{
				
			if(data[i]%2==1)
			{
				if(i>0)
				{
				if(data[i-1]%2==1 )
				{
					final_Ans = final_Ans+2;
					data[i]++;
					data[i-1]++;
					i++;
				}
				else
				{
					data[i+1]++;
					data[i]++;
					final_Ans = final_Ans+2;
				}
				}
				else
				{
					data[i+1]++;
					data[i]++;
					final_Ans = final_Ans+2;
				}
			}
			
		}
		int che =0;
		for(int i =0;i<n;i++)
		{
			System.out.print(data[i]+" " );
			if(data[i]%2==1)
			{
				che=1;
				break;
						
			}
				
		}
		if(che==0)
			System.out.println(final_Ans);
		else
			System.out.println("NO");
		
		
		
		
	}

}

