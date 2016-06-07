package hack;

import java.util.Scanner;

public class Sam_and_sub_strings
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String ss =s.nextLine();
		long [][] data = new long [2][ss.length()];
		
		for(int i =0;i<ss.length();i++)
		{
			data[0][i]=Integer.parseInt(String.valueOf(ss.charAt(i)));
		}
		
		data[1][0]=data[0][0];
		for(int i=1;i<ss.length();i++)
		{
			data[1][i]=data[1][i-1];
			for(int j =0;j<=i;j++)
			{
				data[1][i]=data[1][i]+(Long.parseLong(ss.substring(j,i+1))%(long)(Math.pow(10, 9)+7));
			}
			data[1][i]=data[1][i]%(long)(Math.pow(10, 9)+7);
		}
		
		
		System.out.println(data[1][ss.length()-1]);

	}

}
