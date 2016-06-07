package hack;

import java.util.Arrays;
import java.util.Scanner;

public class permutedarithmeticsequence
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n = s.nextInt();
			int data[] = new int [n];
			int main[] = new int [n];
			for(int i =0;i<n;i++)
			{
				data[i]=s.nextInt();
				main[i]=data[i];
			}
			Arrays.sort(data);
			if(data.length==1)
			{
				System.out.println("arithmetic");
			}
			else
			{
				int diff  = data[1]-data[0];
				int che =0;
				for(int i =2;i<n;i++)
				{
					if(data[i]!=data[i-1]+diff)
					{
						che=1;
						break;
					}
				}
				if(che==1)
					System.out.println("non-arithmetic");
				else
				{
					int che1 =0;
						for(int i =0;i<data.length;i++)
						{
							if(main[i]!=data[i])
							{
								che1=1;
								break;
							}
						}
						
						if(che1==1)
							System.out.println("permuted arithmetic");
						else
							System.out.println("arithmetic");
				}
			}
		}
		
		
	}

}
