package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MULTIPLES_OF_A_NUMBER
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while((line = br.readLine())!=null)
		{
			String data [] = line.split(",");
			int a = Integer.parseInt(data[0]);
			int b = Integer.parseInt(data[1]);
			int now = b;
			while(now<a)
			{
				now = now+b;
			}
			
			System.out.println(now);
			
			
		}
		
	}

}
