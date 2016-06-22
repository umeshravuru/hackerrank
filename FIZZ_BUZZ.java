package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIZZ_BUZZ
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            String data[] = line.split(" ");
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);
            for(int i =1;i<=Integer.parseInt(data[2]);i++)
            {
            	if(i%x ==0 && i%y==0)
            		System.out.print("FB ");
            	else if (i%x==0)
            		System.out.print("F ");
            	else if(i%y==0)
            		System.out.print("B ");
            	else
            		System.out.print(i+" ");
            }
            System.out.println();
            
        }
		
		
	}

}
