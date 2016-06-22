package beer_night;

import java.util.ArrayList;
import java.util.Scanner;

public class kiran_50th_3_powers
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		ArrayList<Integer> powers = new ArrayList<>();
		int [] data = new int [n+1];
		for(int i =0;i<=n;i++)
		{
			data[i]= i;
		}
		
		
		long total_number = (int)( Math.pow(2, data.length));
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(); 
		for(int i=1;i<total_number;i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			String binary_string = Integer.toBinaryString(i);
			for(int j=binary_string.length()-1;j>=0;j--)
			{
				if(binary_string.charAt(j)=='1')
				{
					temp.add(data[binary_string.length()-1-j]);
				}
			}
			ans.add(temp);
			int tem =  0;
			for(int k=0;k<temp.size();k++)
			{
				tem = (int) (tem + Math.pow(3, temp.get(k)));
			}
			powers.add(tem);
		}
		
		System.out.println(ans);
		System.out.println(powers);
		System.out.println(powers.get(49));
		
		
		
		
		
		
		
		
		
	}

}
