package hack;

import java.util.Scanner;

public class K_good_Words
{

	public static void main(String[] args)
	{
		Scanner s  =new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for(int ii =0;ii<t;ii++)
		{
			String data1 = s.nextLine();
			String [] data2 = data1.split(" ");
			String data = data2[0];
			int k = Integer.parseInt(data2[1]);
			int freq[] = new int [26];
			for(int i =0;i<data.length();i++)
			{
				freq[(int)data.charAt(i)-97]++;
			}
			int min = 100001;
			for(int i =0;i<26;i++)
			{
				if(freq[i]<min && freq[i]!=0)
					min= freq[i];
			}
			int final_ans =0;
//			disp(freq);
//			System.out.println(min);
			for(int i=0;i<26;i++)
			{
				if(Math.abs(min-freq[i])>k && freq[i]!=0)
				{
//					System.out.println(final_ans);
					final_ans=final_ans+Math.abs(min-freq[i])-k;
				}
			}
			
			System.out.println(final_ans);
			
			
			
			
			
		}
		
		
	}
	public static void disp(int []data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
			System.out.println();
			
			
	}

}
