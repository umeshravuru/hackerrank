package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIBONACCI_SERIES
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null)
		{
			fiboni_tem_class obj = new fiboni_tem_class();
			System.out.println(obj.fib_num(Integer.parseInt(line)));
		}

	}

}

class fiboni_tem_class
{
	public int fib_num(int n)
	{
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
		{
			int a = 0;
			int b = 1;
			int c = 0;
			for (int i = 2; i <= n; i++)
			{
				c = a + b;
				a = b;
				b = c;
			}
			return c;
		}
	}

}
