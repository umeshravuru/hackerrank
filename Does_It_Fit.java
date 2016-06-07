package hack;

import java.util.Scanner;

public class Does_It_Fit
{

	public static void main(String[] args)
	{
		Scanner s = new  Scanner(System.in);
		String tem = s.nextLine();
		String temp [] = tem.split(" ");
		int W = Integer.parseInt(temp[0]);
		int H = Integer.parseInt(temp[1]);
		
		int w = Math.max(W, H);
		int h = Math.min(W, H);
		
		int q = Integer.parseInt(s.nextLine());
		for(int i =0;i<q;i++)
		{
			tem = s.nextLine();
			String data [] = tem.split(" ");
			if(data[0].equals("C"))
			{
				if(h>=2*Integer.parseInt(data[1]))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else
			{
				int A = Integer.parseInt(data[1]);
				int B = Integer.parseInt(data[2]);
				
				int a = Math.max(A, B);
				int b = Math.min(A, B);
				
				if(a<=w && b<=h)
					System.out.println("YES");
				else
				{
					float diag =(float) Math.sqrt((w*w)+(h*h));
					diag = diag/(float)2;
					float aa=(float)a/(float)2;
					float bb=(float)b/(float)2;
					System.out.println(diag+" "+aa+" "+bb);
					if(diag-aa-bb<(float)0.000001)
						System.out.println("NO");
					else
						System.out.println("YES");
				
				}
				
			}
			
		}
		
		
		
	}

}
