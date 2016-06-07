package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class powerful_string_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		int m = Integer.parseInt(s.nextLine());
		ArrayList<Character> data = new ArrayList<Character>();
		for (int i = 0; i < data1.length(); i++)
		{
			data.add(data1.charAt(i));
		}
		int[][] query = new int[m][2];

		for (int i = 0; i < m; i++)
		{
			String tem = s.nextLine();
			String[] tem1 = tem.split(" ");
			query[i][0] = Integer.parseInt(tem1[0]) - 1;
			query[i][1] = Integer.parseInt(tem1[1]) - 1;
		}
		
		
		int [] union = new int [data1.length()];
		for(int i =0;i<data1.length();i++)
		{
			union[i]=i;
		}
		for(int i =0;i<m;i++)
		{
			for(int j=0;j<data1.length();j++)
			{
				if(union[j]==query[i][0])
					union[j]=query[i][1];
			}
		}
//		for(int i =0;i<data1.length();i++)
//		{
//			System.out.println(union[i]);
//		}
		int [] visted = new int [data1.length()];
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(); 
		for(int i=0 ;i<data1.length()-1;i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			int che=0;
			temp.add(i);
				for(int j=i+1;j<data1.length();j++)
				{
					if(union[i]==union[j] && visted[j]==0)
					{
						temp.add(j);
						visted[j]=1;
						che=1;
					}
				}
				
				if(che==1)
					ans.add(temp);
			
		}
		char [] before = data1.toCharArray();
		
		for(int i =0;i<ans.size();i++)
		{
			char [] tem= new char[ans.get(i).size()];
			for(int j=0;j<ans.get(i).size();j++)
			{
				tem[j]=before[ans.get(i).get(j)];
			}
			Arrays.sort(tem);
			for(int j=0;j<ans.get(i).size();j++)
			{
				before[ans.get(i).get(j)]=tem[ans.get(i).size()-1-j];
			}
		}
		
		
		
for(int i =0;i<before.length;i++)
{
	System.out.print(before[i]);
	}
		
		
//		System.out.println(ans);
		
		
	}

}
