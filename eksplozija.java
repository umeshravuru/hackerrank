package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class eksplozija
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		String data2 = s.nextLine();

		ArrayList<Character> data = new ArrayList<Character>();
		for (int i = 0; i < data1.length(); i++)
		{
			data.add(data1.charAt(i));
		}
		
		int len = 0;
		while (len !=data.size())
		{
			len = data.size();
			for (int i = 0; i < data.size()-data2.length(); i++)
			{
				if(data.get(i)==data2.charAt(0))
				{
					int tem = i;
					int che =0;
					for(int j=0;j<data2.length();j++)
					{
						if(data2.charAt(j)!=data.get(tem))
						{
							che=1;
							break;
						}
						tem++;
					}
					if(che==0)
					{
						for(int j=0;j<data2.length();j++ )
						{
							data.remove(i);
						}
					}
				}
			}
		}

	}

}
