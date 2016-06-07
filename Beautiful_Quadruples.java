package hack;

import java.util.Scanner;

public class Beautiful_Quadruples
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int data []= new int [4];
		data[0] =s.nextInt();
		data[1] =s.nextInt();
		data[2] =s.nextInt();
		data[3] =s.nextInt();
		
		for(int i =0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(data[j]>data[j+1])
				{
					int tem = data[j];
					data[j]= data[j+1];
					data[j+1]=tem;
				}
			}
		}
		long final_Ans =0;
		
		
		
		for(int i1 =1;i1<=data[0];i1++)
		{
			for(int i2 =i1;i2<=data[1];i2++)
			{
				for(int i3 =i2;i3<=data[2];i3++)
				{
					for(int i4 =i3;i4<=data[3];i4++)
					{
//						System.out.println(i1);
						if(i1==i2 && i3!=i4)
						{
							final_Ans++;
						}
						else if(i1!=i2)
						{
							final_Ans++;
						}
					}
				}
			}
		}
		
		
		System.out.println(final_Ans);
		
	}

}
