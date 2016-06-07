package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class combinations_test
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int [] data = {1,2,3,4,5};
		
		int r =3;
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0;i<3;i++)
		{
		temp.add(data[i]);
		}
		ans.add(temp);
		System.out.println(ans);
		while(ans.size()<=n_combi_m(data.length, r))
		{
			ans=combi(ans,data,r);
		}
		
		
		System.out.println(ans);
		

	}
	
	
	public static ArrayList<ArrayList<Integer>> combi(ArrayList<ArrayList<Integer>> ans, int [] data, int r)
	{
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		for(int i=r-1;i>=0;i--)
		{
			if(ans.get(ans.size()-1).get(i)+1<=data.length)
			{
				System.out.println("sdfsd");
				temp1=ans.get(ans.size()-1);
				temp1.set(temp1.size()-1, ans.get(ans.size()-1).get(i)+1);
				System.out.println(temp1+" ");
				ans.add(temp1);
				return ans;
			}
			
		}
		
		return ans;
		
	}
	
	public static int n_combi_m(int n,int m)
	{
		
		m=Math.min(m, n-m);
		long num=1;
		for(int i=n;i>n-m;i--)
		{
			num=num*i;
		}
		long den=1;
		for(int i=2;i<=m;i++)
		{
			den=den*i;
		}
		if(den==0)
			return 1;
		else
			return (int) (num/den);
	}

}
