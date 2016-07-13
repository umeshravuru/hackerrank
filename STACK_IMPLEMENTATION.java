package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class STACK_IMPLEMENTATION
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
        while ((line = br.readLine()) != null) {
        	String tem [] = line.split(" ");
        	int [] data = new int [tem.length];
        	for(int i =0;i<tem.length;i++)
        	{
        		data[i]= Integer.parseInt(tem[i]);
        	}
        	for(int i =tem.length-1;i>=0;i = i-2)
        	{
        		System.out.print(data[i]+" ");
        	}
        	System.out.println();
        	
        }
		
	}

}
