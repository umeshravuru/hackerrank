package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SUM_OF_INTEGERS_FROM_FILE
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		long ans =0;
        while ((line = br.readLine()) != null) {
        	ans = ans + Integer.parseInt(line);
        }        	
		System.out.println(ans); 
		
		
	}

}
