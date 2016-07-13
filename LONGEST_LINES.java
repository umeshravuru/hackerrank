package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LONGEST_LINES
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line= br.readLine();
		int n = Integer.parseInt(line);
		ArrayList<String> data = new ArrayList<>();
        while ((line = br.readLine()) != null) 
        {	
        	int che =0;
        	for(int i=0;i<data.size();i++)
        	{
        		if(line.length()>data.get(i).length())
        		{
        			data.add(i,line);
        			che=1;
        			break;
        		}
        	}
        	
        	if(che==0)
        		data.add(line);
        	
        	
        }
        
        for(int i =0;i<n;i++)
        {
        	System.out.println(data.get(i));
        }
        
  
        
        
        
        
        }

}
