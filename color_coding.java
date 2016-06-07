package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class color_coding
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n1 =Integer.parseInt(s.nextLine());
		
//		String data1 =s.nextLine();
//		String data2 =s.nextLine();
		String [] data = {"red","blue","orange","purple","green","black","yellow"};
		ArrayList<String> data11 = new ArrayList<String>();
		ArrayList<String> data22 = new ArrayList<String>();
		for(int i =0;i<n1;i++)
		{
			data11.add(s.nextLine());
		}
		int n2 =Integer.parseInt(s.nextLine());
		for(int i =0;i<n2;i++)
		{
			data22.add(s.nextLine());
		}
		
		for(int i =0;i<7;i++)
		{
			for(int j=0;j<data11.size();j++)
			{
			if(data11.get(j).equals(data[i]))
			{
				System.out.print(data[i]+" ");
				data11.remove(j);
				j--;
			}
			
			}
			for(int j=0;j<data22.size();j++)
			{
			if(data22.get(j).equals(data[i]))
			{
				System.out.print(data[i]+" ");
				data22.remove(j);
				j--;
			}
			}
		}
	}

}
