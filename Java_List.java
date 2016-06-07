package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_List
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int m = Integer.parseInt(s.nextLine());
		ArrayList<Long> data = new ArrayList<Long>(); 
		String tem = s.nextLine();
		String [] tem1 = tem.split(" ");
		for(int i =0;i<m;i++)
		{
			data.add(Long.parseLong(tem1[i]));
		}
		int q = Integer.parseInt(s.nextLine());
		for(int j=0;j<q;j++)
		{
			tem=s.nextLine();
			if(tem.equals("Insert"))
			{
				String[] tem2 = s.nextLine().split(" ");
				
				if(tem2[0].equals("2147483648"))
				{
					data.add(Long.parseLong(tem2[1]));
				}					
				else
					data.add((int) Long.parseLong(tem2[0]),Long.parseLong(tem2[1]));
			}
			else
			{
//				data.re
				String temmm = s.nextLine();
				if(temmm.equals("2147483648"))
				{
					data.remove(data.size());
				}					
				else
				data.remove((int)Long.parseLong(temmm));
			}
		}
		
		for(int i =0;i<data.size();i++)
		{
				System.out.print(data.get(i)+" ");
		}
		
	}

}
