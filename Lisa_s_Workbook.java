package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Lisa_s_Workbook
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m =s.nextInt();
		int [] data = new int [n];
		long total=0;
		String total_string="";
		for(int i =0;i<n;i++)
		{
			data[i]=s.nextInt();
			
		}
		
		int fianl_ans =0;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(); 
		for(int i =0;i<n;i++)
		{
			ArrayList<Integer> tem = new ArrayList<Integer>();
			int problem = 1;

			
			while(tem.size()<=m || problem<data[i])
			{
				tem.add(problem);
				problem++;
			}
			
			
			ans.add(tem);
		}
		
		
		
		
		
	System.out.println(ans);	
	}

}
