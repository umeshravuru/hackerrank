package codeeva;

public class MULTIPLICATION_TABLES
{

	public static void main(String[] args)
	{
		for(int i =1;i<=12;i++)
		{
			for(int j =1;j<=12;j++)
			{
				String now_str = String.valueOf(i*j);
				if(now_str.length()==1)
					now_str = "   "+now_str;
				if(now_str.length()==2)
					now_str = "  "+now_str;
				if(now_str.length()==3)
					now_str = " "+now_str;
				System.out.print(now_str);
			}
			System.out.println();
		}
				
		
		
		
		
	}

}
