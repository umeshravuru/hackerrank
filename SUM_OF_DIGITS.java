package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SUM_OF_DIGITS
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
        while ((line = br.readLine()) != null) {
        	int ans =0;
        	for(int i =0;i<line.length();i++)
        	{
        		ans = ans + Integer.parseInt(String.valueOf(line.charAt(i)));
        	}
        	System.out.println(ans);
        }
		
		
	}

}
