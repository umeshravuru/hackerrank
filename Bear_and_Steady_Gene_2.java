package hack;

import java.util.Scanner;

public class Bear_and_Steady_Gene_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in );
		int n = Integer.parseInt(s.nextLine());
//		int n =8;
		String data = s.nextLine();
//		String data = "GAAATAAA";
		int main_freq[] = freq_func(data);
//		disp(main_freq);
		int first_length = 0;
		int to_remove[] = new int[4];
		for (int i = 0; i < 4; i++)
		{
			if (main_freq[i] > n / 4)
			{
				first_length = first_length + main_freq[i] - n / 4;
				to_remove[i] = main_freq[i] - n / 4;
			}
		}
//		disp(to_remove);
		int tem_freq[] = freq_func(data.substring(0, first_length));
//		disp(tem_freq);
		int final_ans = 0;
		int bre =0;
		if(check(tem_freq, to_remove))
		{
			final_ans = first_length;
			bre=1;
		}
		for (int i = first_length; i < n; i++)
		{
//			System.out.println("fb");
			if(bre==1)
				break;
			int tem_freq1[] =  new int[4];
			tem_freq1[0]= tem_freq[0];
			tem_freq1[1]= tem_freq[1];
			tem_freq1[2]= tem_freq[2];
			tem_freq1[3]= tem_freq[3];
			for (int j = 0; j < n-i; j++)
			{
//				System.out.println(j);
//				System.out.println(j+i);
				if (data.charAt(j+i) == 'A')
					tem_freq1[0]++;
				else if (data.charAt(j+i) == 'C')
					tem_freq1[1]++;
				else if (data.charAt(j+i) == 'T')
					tem_freq1[2]++;
				else if (data.charAt(j+i) == 'G')
					tem_freq1[3]++;
//				disp(tem_freq1);
				if (data.charAt(j) == 'A')
					tem_freq1[0]--;
				else if (data.charAt(j) == 'C')
					tem_freq1[1]--;
				else if (data.charAt(j) == 'T')
					tem_freq1[2]--;
				else if (data.charAt(j) == 'G')
					tem_freq1[3]--;
				
//				disp(tem_freq1);
				if(check(tem_freq1, to_remove))
				{
//					System.out.println("gg");
//					disp(tem_freq1);
					final_ans= i;
					bre=1;
					break;
				}
				
			}
			
//			System.out.println((i));
			if (data.charAt(i) == 'A')
				tem_freq[0]++;
			else if (data.charAt(i) == 'C')
				tem_freq[1]++;
			else if (data.charAt(i) == 'T')
				tem_freq[2]++;
			else if (data.charAt(i) == 'G')
				tem_freq[3]++;
//			disp(tem_freq);
			
		}
		
		
		System.out.println(final_ans);

	}

	public static int[] freq_func(String data)
	{
		int ans[] = new int[4];

		for (int i = 0; i < data.length(); i++)
		{
			if (data.charAt(i) == 'A')
				ans[0]++;
			else if (data.charAt(i) == 'C')
				ans[1]++;
			else if (data.charAt(i) == 'T')
				ans[2]++;
			else if (data.charAt(i) == 'G')
				ans[3]++;
		}

		return ans;
	}

	public static boolean check(int[] data1, int[] data2) ////// data2 is
															////// to_Remove
	{
		
		if(data2[0]<=data1[0] && data2[1]<=data1[1] && data2[2]<=data1[2] && data2[3]<=data1[3] )
			return true;
		else
			return false;
		

	}
	
	
	public static void disp(int data[])
	{
		System.out.print("display"+" ");
		for(int i =0;i<4;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
		
	}

}
