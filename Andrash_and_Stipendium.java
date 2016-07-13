package Code_chef;

import java.util.Scanner;

public class Andrash_and_Stipendium
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t= Integer.parseInt(s.nextLine());
		
		for(int ii=0;ii<t;ii++)
		{
			int n = Integer.parseInt(s.nextLine());
			String data1 = s.nextLine();
			String data2 [] = data1.split(" ");
			int data [] = new int [n];
			int sum =0;
			int che =0;
			int che1=1;
			for(int i =0;i<n;i++)
			{
				data[i]=Integer.parseInt(data2[i]);
				if(data[i]==3)
					sum--;
				if(data[i]==5)
					sum++;
				if(data[i]==2)
				{
					che=1;
					break;
				}
				if(data[i]==5)
					che1=0;
			}
			if(che1==0 && che ==0)
			{
				if(sum>=0)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
			else
				System.out.println("No");
			
			
			
			
			
		}
		
		
		
	}

}
