package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_Euler_16_Power_digit_sum
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		ArrayList<ArrayList<Integer> > data = new ArrayList<ArrayList<Integer> > ();
		ArrayList<Integer>  temp = new ArrayList<Integer> ();
		temp.add(1);
		data.add(temp);
		int []final_data_array = new int [10001];
		final_data_array[0]=1;
		for(int i =1;i<=10000;i++)
		{
			int summer=0;
			ArrayList<Integer>  temp1 = new ArrayList<Integer> ();
			int carry =0;
			for(int j=data.get(i-1).size()-1;j>=0;j--)
			{
				temp1.add(0, ((data.get(i-1).get(j)*2+carry)%10));
				summer =summer+temp1.get(0);
				carry =(data.get(i-1).get(j)*2)/10;
			}
			if(carry!=0)
			{
			temp1.add(0,carry);
			summer =summer+temp1.get(0);
			}
			data.add(temp1);
			final_data_array[i]=summer;
		}
		int t=s.nextInt();
		for(int i =0;i<t;i++)
		{
			int m =s.nextInt();
			System.out.println(final_data_array[m]);
		}
	}

}
