package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class closingtheloop_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in );
		int t = Integer.parseInt(s.nextLine());
		for(int ii=0;ii<t;ii++)
		{
			int n = Integer.parseInt(s.nextLine());
			String data1 = s.nextLine();
			String data[] = data1.split(" ");
			ArrayList<Integer> blue = new ArrayList<Integer>();
			ArrayList<Integer> red = new ArrayList<Integer>();
			
			for(int i =0;i<data.length;i++)
			{
				if(data[i].charAt(data[i].length()-1)=='R')
					red.add(Integer.parseInt(data[i].substring(0, data[i].length()-1)));
				else
					blue.add(Integer.parseInt(data[i].substring(0, data[i].length()-1)));
			}
			for(int i =0;i<blue.size();i++)
			{
				for(int j =0;j<blue.size()-1;j++)
				{
					if(blue.get(j)<blue.get(j+1))
					{
						int tem = blue.get(j);
						blue.set(j, blue.get(j+1));
						blue.set(j+1, tem);
					}
				}
			}
			
			for(int i =0;i<red.size();i++)
			{
				for(int j =0;j<red.size()-1;j++)
				{
					if(red.get(j)<red.get(j+1))
					{
						int tem = red.get(j);
						red.set(j, red.get(j+1));
						red.set(j+1, tem);
					}
				}
			}
			
//			int total = 
			int ans =0;
			while(blue.size()>0 && red.size()>0)
			{
				ans = ans+blue.get(0)-1;
				ans = ans+red.get(0)-1;
				blue.remove(0);
				red.remove(0);
			}
			System.out.println("Case #"+(ii+1)+": "+ans);
			
			
			
		}
		
		
	}

}
