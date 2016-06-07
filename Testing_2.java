package hack;

public class Testing_2
{

	public static void main(String[] args)
	{

		int[] data1 = new int[10];
		for (int i = 1; i <= 10; i++)
		{
			data1[i - 1] = i;
		}
		int[] data = new int[10];
		data[1]=3;
		data[0]=0;
		for (int i = 2; i < 10; i++)
		{
			data[i]=data[i-1]+4;
		}
		int final_sum = 0;
		int tem =0;
		for(int i =0;i<9;i++)
		{
			for(int j =i+1;j<10;j++)
			{
				final_sum= final_sum+data[i]+data[j];
				tem++;
				System.out.println(final_sum+" - "+tem);
			}
		}
		
		
		System.out.println(final_sum/45);
		
		
		
	}

}
