package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class a1paper_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] data = new int[n - 1];
		int[] ans = new int[n - 1];

		for (int i = 0; i < n - 1; i++)
		{
			data[i] = s.nextInt();
		}
		int pow = 1;
		for (int i = 0; i < n - 1; i++)
		{
			if (data[i] < Math.pow(2, pow))
			{
				// if(data[i]%2==0)
				ans[i] = data[i];
				// else
				// ans[i]=data[i]-1;
				pow = (int) (pow + (Math.log(2 - ans[i]) / Math.log(2)));
				// pow= (int) (Math.pow(2, i+1));
			} else
			{
				ans[i] = (int) Math.pow(2, pow);
			}
			System.out.println(pow);

		}

		ArrayList<Integer> data_ans = new ArrayList<Integer>();

		// data.add(0);
		// data.add(0);
		
		try{
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
//System.out.println(e.);
		}
		for (int i = 2; i <= n; i++)
		{
			data_ans.add(ans[i - 2]);
		}

		while (data_ans.get(0) != 2 && data_ans.size() > 1)
		{
			for (int i = data_ans.size() - 1; i > 0; i--)
			{

				data_ans.set(i - 1, data_ans.get(i - 1) + data_ans.get(i) / 2);
				data_ans.remove(i);

			}
		}
		if (data_ans.get(0) >= 2)
		{

			ArrayList<Integer> final_Ans = new ArrayList<Integer>();

			for (int ii = 0; ii < ans.length - 1; ii++)
			{
				
				if (ans[ii] != ans[ii + 1] || ans[ii]==0)
					final_Ans.add(ans[ii]);
				else
				{
					final_Ans.add(ans[ii]);
					break;

				}
			}
			if(ans[ans.length-2]!=ans[ans.length-1])
				final_Ans.add(ans[ans.length-1]);
			System.out.println(final_Ans);
			System.out.println("posssible");

		} else
			System.out.println("impossible");

		for (int i = 0; i < n - 1; i++)
		{
			System.out.print(ans[i] + " ");
		}

	}

}
