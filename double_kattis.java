package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class double_kattis
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		while(n!=0 && m !=0)
		{
			
			int data1 [] = new int [n];
			int data2 [] = new int [n];
			for(int i =0;i<n;i++)
			{
				data1[i]=i+1;
				data2[i]=i+1;
			}
			int final_ans  =1;
			pri(data2);
			while(true)
			{
				data1 = shuf(data1,m);
				if(eq(data1,data2))
				{
					break;
				}
				else
				{
					final_ans++;
					
				}
				
				pri(data1);
			}
			pri(data2);
			System.out.println(final_ans);
			
			n = s.nextInt();
			m = s.nextInt();
		}
		
		
		
	}
	
	public static boolean eq(int data1[],int data2[])
	{
		for(int i =0;i<data1.length;i++)
		{
			if(data1[i]!=data2[i])
				return false;
		}
		
		return true;
	}
	public static int[] shuf(int data[],int m)
	{
//		pri(data);
		int ans [] = new int [data.length];
		ArrayList<ArrayList<Integer>> data2 = new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<m;i++)
		{
			ArrayList<Integer> tem = new ArrayList<Integer> ();
			tem.add(0);
			data2.add(tem);
		}
		int now =0;
		int inde=0;
		while(now<data.length)
		{
			
			data2.get(inde).add(data[now]);
			inde++;
			if(inde==m)
				inde=0;
			now++;
		}
		 inde = data.length-1;
//		 System.out.println(data2);
		for(int i =m-1;i>=0;i--)
		{
			for(int j =0;j<data2.get(i).size();j++)
			{
				if(data2.get(i).get(j)!=0)
				{
				ans[inde]=data2.get(i).get(j);
						inde--;
				}
			}
		}
		
		
//		pri(ans);
		return ans;
	}
	public static void pri(int data[])
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	

}
