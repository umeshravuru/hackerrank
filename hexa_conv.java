package hack;

import java.util.Scanner;

public class hexa_conv
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		for(int i =0;i<6;i++)
		{
			String data = s.nextLine();
			String []data1 = data.split(" ");
			for(int j=0;j<8;j++)
				
			{
				int tem =Integer.parseInt(data1[j].substring(0, 3),16);
//				System.out.print(tem+" ");
				System.out.print(Integer.toBinaryString(tem)+" ");
			}
			System.out.println("");
		}
		
		
	}

}
