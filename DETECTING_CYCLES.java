package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DETECTING_CYCLES
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
        while ((line = br.readLine()) != null) {
        	String [] tem  = line.split(" ");
        	int data[] = new int [tem.length];
        	for(int i=0;i<data.length;i++)
        	{
        		data[i]= Integer.parseInt(tem[i]);
        	}
        	
        	int len =1;
        	for(len =1;len<data.length;len++)
        	{
        		int che =0;
        		for(int i =0;i<len;i++)
        		{
        			if(i+len==data.length-1)
        				break;
        			if(data[i]==data[i+len])
        			{
        				for(int j=i;j<data.length;j++)
        				{
        					if(j+len==data.length-1)
        						break;
        					if(data[j]!=data[j+len])
        					{
        						che=1;
        						break;
        					}
        				}
        				if(che==0)
        				{
        					break;
        				}
        			}
        		}
        		if(che==0)
        			break;
        	}
        	
        	System.out.println(len);
        	
        	
        	
        	
        	
        	
        }
	}

}
