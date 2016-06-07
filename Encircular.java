package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Encircular
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		
		System.out.println(check(data));
				
		
		
		
	}
	
	
	
	public static String check(String commands)
	{
		
		
		
		String data =commands;
		int x=0;
		int y=1;
		int xx=0;
		int yy=0;
		for(int i =0;i<commands.length();i++)
		{
			if(data.charAt(i)=='G')
			{
				xx=xx+x;
				yy=yy+y;
				String temmm = String.valueOf(xx)+","+String.valueOf(yy); 
				
			}
			if(data.charAt(i)=='L')
			{
				if(y==1 && x==0)
				{
					x=-1;
					y=0;
							
				}
				else if(y==0 && x==-1)
				{
					x=0;y=-1;
				}
				else if(x==0 && y==-1)
				{
					x=1;
					y=0;
				}
				else if(x==1 && y==0)
				{
					x=0;
					y=1;
				}
				
			}
			if(data.charAt(i)=='R')
			{
				if(y==1 && x==0)
				{
					x=1;
					y=0;
							
				}
				else if(y==0 && x==1)
				{
					x=0;y=-1;
				}
				else if(x==0 && y==-1)
				{
					x=-1;
					y=0;
				}
				else if(x==-1 && y==0)
				{
					x=0;
					y=1;
				}
				
			}
		}
		
if((x==0 && y==1)&&(xx*xx)+(yy*yy)>0)
	return "NO";
else
	return "YES";
		
		
//		return commands;
	}

}
