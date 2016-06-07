package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class closingtheloop
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
			ArrayList<Integer> sub_string = new ArrayList<Integer>();
			int max = 0;
			char color = data[0].charAt(data[0].length()-1);
			for(int i =0;i<data.length;i++)
			{
				if(color==data[i].charAt(data[i].length()-1))
				{
					int tem = Integer.parseInt(data[i].substring(0, data[i].length()-1));
					if(max<tem)
						max = tem;
				}
				else
				{
					color=data[i].charAt(data[i].length()-1);
					sub_string.add(max);
					max =Integer.parseInt(data[i].substring(0, data[i].length()-1));
				}
			
			}
			sub_string.add(max);
//			System.out.println(sub_string);
			int fial_ans=0;
			for(int i =0;i<sub_string.size();i++)
			{
				fial_ans=fial_ans+sub_string.get(i)-1;
			}
			if(sub_string.size()==1)
				System.out.println("Case #"+(ii+1)+": 0");
			else
				System.out.println("Case #"+(ii+1)+": "+fial_ans);
		}
		
		
	}

}
