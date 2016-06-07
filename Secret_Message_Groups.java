package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Secret_Message_Groups
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int data[] = new int[t];
		Map<Integer, Integer> data_base = new HashMap<Integer, Integer>();
		for (int i = 0; i < t; i++)
		{
			data[i] = s.nextInt();
			data_base.put(data[i], 1);
		}
		ArrayList<ArrayList<Integer>> freq = new ArrayList<ArrayList<Integer>>();
		ArrayList<int[]> freq_array = new ArrayList<int[]>();
		for (Integer key : data_base.keySet())
		{
			int[] tem_tot_freq = total_freq(key);
			int che = 0;
			for (int i = 0; i < freq.size(); i++)
			{
				if (array_check(tem_tot_freq, freq_array.get(i)))
				{
					che = 1;
					freq.get(i).add(key);
					break;
				}

			}
			if (che == 0)
			{
				freq_array.add(tem_tot_freq);
				ArrayList<Integer> tempp_array_list = new ArrayList<Integer>();
				tempp_array_list.add(key);
				freq.add(tempp_array_list);
			}
		}
		System.out.println(freq.size());
		int max = -1;
		for (int i = 0; i < freq.size(); i++)
		{
			if (max < freq.get(i).size())
				max = freq.get(i).size();
		}
		ArrayList<int[]> final_print = new ArrayList<int[]>();

		for (int i = 0; i < freq.size(); i++)
		{
			if (freq.get(i).size() == max)
			{
				int[] sortin_array = new int[max];
				for (int j = 0; j < max; j++)
				{
					sortin_array[j] = freq.get(i).get(j);
				}
//
//				for (int i1 = 0; i1 < max; i1++)
//				{
//					for (int i2 = 0; i2 < max - 1; i2++)
//					{
//						if (bigger(sortin_array[i2 + 1], sortin_array[i2]))
//						{
//							int sort_tem = sortin_array[i2 + 1];
//							sortin_array[i2 + 1] = sortin_array[i2];
//							sortin_array[i2] = sort_tem;
//						}
//					}
//				}
				Arrays.sort(sortin_array);
				int dec_Sorting_array[] =new int [sortin_array.length]; 
				for(int i3 =0;i3<sortin_array.length;i3++)
				{
						dec_Sorting_array[i3]= sortin_array[sortin_array.length-1-i3];
				}

			
				
					int che =0;
					for (int i3 = 0; i3 < final_print.size(); i3++)
					{
						if(!bigger(dec_Sorting_array[0],final_print.get(i3)[0]))
//						if(final_print.get(i3)[0]>sortin_array[0])
						{
							final_print.add(i3, dec_Sorting_array);
							che=1;
							break;
						}
						
					}
					if(che==0)
						final_print.add(dec_Sorting_array);
				

			}
		}
		
		for(int i =0;i<final_print.size();i++)
		{
			for(int j=0;j<final_print.get(i).length;j++)
			{
				System.out.print(final_print.get(i)[j]+" ");
			}
			System.out.println(); 
			
		}
		
//System.out.println(freq);
		// disp(total_freq(12345));
	}

	public static int[] total_freq(int data)
	{
		int[] ans = new int[10];
		while (data != 0)
		{
			ans[data % 10]++;
			data = data / 10;
		}

		return ans;
	}
	public static boolean array_check(int[] data1, int[] data2)
	{
		for (int i = 0; i < data1.length; i++)
		{
			if (data1[i] != data2[i])
				return false;
		}
		return true;
	}
	public static boolean bigger(int a, int b)
	{
		String aa = String.valueOf(a);
		String bb = String.valueOf(b);
		for (int i = 0; i < Math.min(aa.length(), bb.length()); i++)
		{
			if (aa.charAt(i) > bb.charAt(i))
				return true;
			else if(aa.charAt(i)<bb.charAt(i))
				return false;
		}
		if (a > b)
			return true;
		else
			return false;

	}

	public static void disp(int[] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
