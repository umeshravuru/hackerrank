package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class zanzibar
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i =0;i<t;i++)
		{
			ArrayList<Integer> data = new ArrayList<Integer>();
			int tem = s.nextInt();
			while(tem!=0)
			{
				data.add(tem);
				tem = s.nextInt();
			}
			int ans =0;
			for(int j =0;j<data.size()-1;j++)
			{
				if(data.get(j)*2<data.get(j+1))
					ans=ans+data.get(j+1)-data.get(j)*2;
			}
			
			System.out.println(ans);
		}
				
		
		
	}

}
