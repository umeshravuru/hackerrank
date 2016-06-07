package hack;

import java.awt.DisplayMode;
import java.util.Scanner;

public class Bear_and_Steady_Gene
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in );
		int n = Integer.parseInt(s.nextLine());
		String data = s.nextLine();
		
		int [] to_remove = get_freq(data);
		int start_length =0;
		for(int i =0;i<4;i++)
		{
			if(to_remove[i]<=n/4)
				to_remove[i]=0;
			else
				to_remove[i]=to_remove[i]-n/4;
			
			start_length=start_length+to_remove[i];
		}
//		disp_array(to_remove);
//		System.out.println(start_length);
		int [] temp_freq = get_freq(data.substring(0,start_length));
		int  [] temp_cont_freq = get_freq(data.substring(0,start_length));
		 int final_ans =0;
		for(int i =start_length;i<=data.length();i++)
		{
			if(i!=start_length)
			{
//				System.out.println(data.charAt(i-1));
				
				if(data.charAt(i-1)=='A')
					temp_cont_freq[0]++;
				else if(data.charAt(i-1)=='C')
					temp_cont_freq[1]++;
				else if(data.charAt(i-1)=='G')
					temp_cont_freq[2]++;
				else if(data.charAt(i-1)=='T')
					temp_cont_freq[3]++;
				temp_freq=temp_cont_freq;
//			disp_array(temp_cont_freq);
//				temp_freq = get_freq(data.substring(0,i));
			}
//			disp_array(temp_freq);
			int check =0;
			if(compare_array(temp_freq, to_remove))
			{
				check=1;
				final_ans=i;
			}
			for(int j=1;j<data.length()-i;j++)
			{
//				System.out.println("here");
				if(data.charAt(j+i-1)=='A')
					temp_freq[0]++;
				else if(data.charAt(j+i-1)=='C')
					temp_freq[1]++;
				else if(data.charAt(j+i-1)=='G')
					temp_freq[2]++;
				else if(data.charAt(j+i-1)=='T')
					temp_freq[3]++;
				
				if(data.charAt(j-1)=='A')
					temp_freq[0]--;
				else if(data.charAt(j-1)=='C')
					temp_freq[1]--;
				else if(data.charAt(j-1)=='G')
					temp_freq[2]--;
				else if(data.charAt(j-1)=='T')
					temp_freq[3]--;
//				System.out.println(data.charAt(j-1)+" "+data.charAt(j+i));
//				disp_array(temp_freq);
				
				if(compare_array(temp_freq,to_remove))
				{
					check=1;
					final_ans=i;
				}
				
				if(check==1)
					break;
			}
			if(check==1)
				break;
		}
		
		
		
		System.out.println(final_ans);
		
	}
	
	
	public static int[] get_freq (String data)
	{
		int [] ans = new int [4];
		
		for(int i =0;i<data.length();i++)
		{
			if(data.charAt(i)=='A')
				ans[0]++;
			else if(data.charAt(i)=='C')
				ans[1]++;
			else if(data.charAt(i)=='G')
				ans[2]++;
			else if(data.charAt(i)=='T')
				ans[3]++;
		}
		return ans;
		
	}
	
	public static boolean compare_array (int[] data1, int []data2) /// second array is to_delte
	{
		for(int i =0;i<data1.length;i++)
		{
			if(data1[i]<data2[i])
				return false;
		}
		
		return true;
	}
	
	public static void disp_array(int[] data)
	{
		
		System.out.print(data[0]+" ");
		System.out.print(data[1]+" ");
		System.out.print(data[2]+" ");
		System.out.print(data[3]+" ");
		System.out.println();
		
	}
	

}
