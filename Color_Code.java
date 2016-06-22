package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Color_Code
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{

			int data[] = new int[3];
			data[0] = s.nextInt();
			data[1] = s.nextInt();
			data[2] = s.nextInt();
			String ans = "";

			for (int j = 0; j < 3; j++)
			{
				ArrayList<Integer> tem = conv(data[j], 16);
				String temp ="";
				for (int i = 0; i < tem.size(); i++)
				{
					
					if (tem.get(i) < 10)
					{
						temp = temp + String.valueOf(tem.get(i));
					} else
					{
						if (tem.get(i) == 10)
							temp = temp + "U";
						else if (tem.get(i) == 11)
							temp = temp + "V";
						else if (tem.get(i) == 12)
							temp = temp + "W";
						else if (tem.get(i) == 13)
							temp = temp + "X";
						else if (tem.get(i) == 14)
							temp = temp + "Y";
						else if (tem.get(i) == 15)
							temp = temp + "Z";
					}
				}
				if(temp.length()==1)
					temp = "0"+temp;
				ans = ans+" " +temp;
			}

			System.out.println("Case "+(ii+1)+":"+ans);
			
		}

	}

	public static ArrayList<Integer> conv(long data, int base)
	{

		ArrayList<Integer> ans = new ArrayList<Integer>();
		int pow = 0;
		for (int i = 0; i < 1000; i++)
		{
			if (data >= Math.pow(base, i) && data < Math.pow(base, i + 1))
			{
				pow = i;
				break;
			}
		}
		while (pow >= 0)
		{
			if (data >= Math.pow(base, pow))

			{
				ans.add((int) (data / Math.pow(base, pow)));

				data = (long) (data - (int) (data / Math.pow(base, pow))
						* Math.pow(base, pow));
			} else
				ans.add(0);

			pow--;

		}
		return ans;
	}

}
