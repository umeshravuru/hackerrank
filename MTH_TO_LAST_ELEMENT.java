package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MTH_TO_LAST_ELEMENT
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
        while ((line = br.readLine()) != null) {
        	String tem [] = line.split(" ");
        	int n = Integer.parseInt(tem[tem.length-1]);
        	if(tem.length-1-n>=0)
        	System.out.println(tem[tem.length-1-n]);
        	
        	
        }
		
	}

}
