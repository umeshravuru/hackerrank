package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FIRST_NON_REPEATED_CHARACTER
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
        while ((line = br.readLine()) != null) {
        	Map<Character, Integer> freq = new HashMap<>();
        	for(int i =0;i<line.length();i++)
        	{
        		if(freq.get(line.charAt(i))==null)
        		{
        			freq.put(line.charAt(i), 1);
        		}
        		else
        			freq.put(line.charAt(i), freq.get(line.charAt(i))+1);
        	}
        	
        	for(int i =0;i<line.length();i++)
        	{
        		if(freq.get(line.charAt(i))==1)
        		{
        			System.out.println(line.charAt(i));
        			break;
        		}
        	}
        	
        	
        }
		
		
	}

}
