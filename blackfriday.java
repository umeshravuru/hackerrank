package beer_night;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class blackfriday
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] data = new int[t];
		for (int i = 0; i < t; i++)
		{
			data[i] = s.nextInt();
		}

		int[] ans = new int[6];
		for (int i = 0; i < t; i++)
		{

			ans[data[i] - 1]++;
		}
		int max = -1;
		for (int i = 5; i >= 0; i--)
		{
			if (ans[i] == 1)
			{
				max = i;
				break;
			}
		}
		int chek = 0;
		for (int i = 0; i < t; i++)
		{
			if (data[i] == max + 1)
			{
				chek = i + 1;
				break;
			}

		}
		if(max==-1)
			chek=0;
		
		if(chek==0)
			System.out.println("none");
		else
			System.out.println(chek);

	}

}
