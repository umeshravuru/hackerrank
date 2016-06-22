package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class REVERSE_WORDS
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while((line = br.readLine())!=null)
		{
			String data [] = line.split(" ");
			for(int i =data.length-1;i>=0;i--)
			{
				System.out.print(data[i]+" ");
			}
			System.out.println();
		}
		
	}

}
