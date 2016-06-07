package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Different_List_Game
{

	public static void main(String[] args)
	{

		Scanner s  = new Scanner(System.in);
		long data = s.nextLong();
//		System.out.println(data);
		ArrayList<Long> data1 = new ArrayList<Long>(); 
		long present =0;
		while(present!=data)
		{
			present= data;
			if(data%2==0)
			{
//				System.out.println(2);
				data1.add((long)2);
				data=data/2;
			}
			else
			{
			for(int i =3;i<Math.sqrt(data)+2;i=i+2)
			{
				if(data%i==0)
				{
//					System.out.println(i);
					data1.add((long)i);
					data=data/i;
					break;
				}
			}
			}
			
//			System.out.println(data);
		}
		
		System.out.println(data);
		
		
	}

}
