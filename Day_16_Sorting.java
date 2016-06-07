package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day_16_Sorting {

	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		long [] data = new long[n];
		for(int i=0;i<n;i++)
		{
			data[i]=s.nextLong();
		}
		
		Arrays.sort(data);
		ArrayList<Long> ans_final= new ArrayList<Long>();
		long ans=Math.abs(data[0]-data[1]);
		ans_final.add(data[0]);
		ans_final.add(data[1]);
		for(int i=1;i<n-1;i++)
		{
			if(ans>Math.abs(data[i]-data[i+1]))
			{
				ans=Math.abs(data[i]-data[i+1]);
				ans_final.removeAll(ans_final);
				ans_final.add(data[i]);
				ans_final.add(data[i+1]);
				
			}
			else if(ans==Math.abs(data[i]-data[i+1]))
			{
				ans_final.add(data[i]);
				ans_final.add(data[i+1]);
			}
			
		}
		for(int i=0;i<ans_final.size();i++)
		{
			System.out.print(ans_final.get(i)+" ");
		}
//System.out.println(ans_final);
	}

}
