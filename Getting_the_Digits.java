package beer_night;

import java.util.Scanner;

public class Getting_the_Digits
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			String data = s.nextLine();
			String data_base[] = new String[10];
			data_base[0] = "ZERO";
			data_base[1] = "ONE";
			data_base[2] = "TWO";
			data_base[3] = "THREE";
			data_base[4] = "FOUR";
			data_base[5] = "FIVE";
			data_base[6] = "SIX";
			data_base[7] = "SEVEN";
			data_base[8] = "EIGHT";
			data_base[9] = "NINE";

			int freq[] = new int[26];
			int freq1[] = new int[26];
			for (int i = 0; i < data.length(); i++)
			{
				freq[data.charAt(i) - 65]++;
				freq1[data.charAt(i) - 65]++;
			}
			
			
			String final_Ans = "";
			for(int k =0;k<10;k++)
			{
				final_Ans="";
//				freq= freq1;
				for(int kk=0;kk<26;kk++)
				{
					freq[kk]= freq1[kk];
				}
				int tem_length = 0;
				int length = data.length();
				while (length > 0)
				{
					tem_length = length;

					for (int i = k; i < 10; i++)
					{
						int che = 0;
						int tem[] = word_freq(data_base[i]);
//						System.out.println(data_base[i]);
						for (int j = 0; j < tem.length; j++)
						{
							if (freq[j] < tem[j])
							{
								che = 1;
								break;
							}
						}
						if (che == 0)
						{
							final_Ans = final_Ans + String.valueOf(i);
							length = length - data_base[i].length();
							for (int j = 0; j < tem.length; j++)
							{
								freq[j] = freq[j] - tem[j];
							}
							i--;
							break;
						}

					}
					System.out.println(final_Ans);
					if (tem_length == length)
						break;
				}
				if(length<=0)
				{
					break;
				}
			}

			System.out.println("Case #" + (ii + 1) + ": " + final_Ans);

		}

	}

	public static int[] word_freq(String data)
	{
		int ans[] = new int[26];
		for (int i = 0; i < data.length(); i++)
		{
			ans[data.charAt(i) - 65]++;
		}
		return ans;
	}

}
