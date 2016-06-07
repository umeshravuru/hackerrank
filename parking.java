package beer_night;

import java.util.Scanner;

public class parking
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int data[][] = new int [3][2];
		int max = 0;
		int min =101;
		for(int i=0;i<3;i++ )
		{
			data[i][0]=s.nextInt();
			data[i][1]=s.nextInt();
			if(max<data[i][0])
				max = data[i][0];
			if(max<data[i][1])
				max = data[i][1];
			
			if(min>data[i][0])
				min = data[i][0];
			if(min>data[i][1])
				min = data[i][1];
		}
		
		int final_Ans =0;
		for(int i =min;i<=max;i++)
		{
			int count =0;
			if(data[0][0]<=i && i<data[0][1] )
				count++;
			if(data[1][0]<=i && i<data[1][1] )
				count++;
			if(data[2][0]<=i && i<data[2][1] )
				count++;
			if(count==1)
			final_Ans = final_Ans + count*a;
			if(count==2)
				final_Ans = final_Ans + count*b;
			if(count==3)
				final_Ans = final_Ans + count*c;
			
		}
		
		System.out.println(final_Ans);
		
		
		
		
		
	}

}
