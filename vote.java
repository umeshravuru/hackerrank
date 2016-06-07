package hack;

import java.util.Scanner;

public class vote
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i =0;i<t;i++)
		{
			int n = s.nextInt();
			int max =0;
			int total=0;
			int check=0;
			int data []= new int [n];
			int wi=0;
			for(int j=0;j<n;j++ )
			{
				data[j]=s.nextInt();
				if(data[j]==max)
					check=1;
				if(data[j]>max)
				{
					max= data[j];
					wi=j+1;
					check=0;
				}
				
				total=total+data[j];
				
			}
			
			if(check==1)
				System.out.println("no winner");
			else
			{
				if(max>total/2)
					System.out.println("majority winner "+ wi);
				else
					System.out.println("minority winner "+ wi);
			}
		}
		
		
	}

}
