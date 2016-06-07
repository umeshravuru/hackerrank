package hack;

import java.util.Scanner;

public class zamka
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b =s.nextInt();
		int c = s.nextInt();
		for(int i =a;i<=b;i++)
		{
			if(sum(i,c))
			{
				System.out.println(i);
				break;
			}
		}
		for(int i =b;i>=a;i--)
		{
			if(sum(i,c))
			{
				System.out.println(i);
				break;
			}
		}
		
		
	}
	
	public static boolean sum(int data,int c)
	{
		int tem = 0;
		
		while(data!=0)
		{
			tem = tem +data%10;
			data = data/10;
		}
		if(tem ==c)
			return true;
		else
			return false;
	
	}

}
