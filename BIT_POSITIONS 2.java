package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BIT_POSITIONS
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while((line = br.readLine())!=null)
		{
			String data [] = line.split(",");
			String ans = conv(Integer.parseInt(data[0]),2);
			if(ans.charAt(ans.length()-Integer.parseInt(data[1]))==ans.charAt(ans.length()-Integer.parseInt(data[2])))
				System.out.println("true");
			else
				System.out.println("false");

		}

	}


	public static String conv(long data, int base)
	{

		String ans = "";
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
				ans = ans + String.valueOf((int) (data / Math.pow(base, pow)));;

				data = (long) (data - (int) (data / Math.pow(base, pow))
						* Math.pow(base, pow));
			} else
				ans = ans + "0";

			pow--;

		}
		return ans;
	}

}
