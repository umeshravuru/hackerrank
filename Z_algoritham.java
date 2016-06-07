package hack;

import java.util.Scanner;

public class Z_algoritham
{

	public static void main(String[] args)
	{
		Scanner  s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();
				
		for(int i =0;i<z_algo(a, b).length;i++)
		{
			System.out.print(z_algo(a, b)[i]+" ");
		}
	}
	
	public static int[] z_algo(String a , String b){
		
		int [] z = new int [a.length()+b.length()+1];
		String data = b+'%'+a;
		int l =0;
		int r =0;
		z[0]=0;
		for(int i =1;i<z.length;i++)
		{
			System.out.println(l+" "+r);
			if (l==r)
			{
				int tem_ans=0;
				for(int j =0;j<z.length;j++)
				{
					if(i+j<z.length)
					{
					if(data.charAt(j)!=data.charAt(i+j))
						z[i]=tem_ans;
					else
						tem_ans++;
					}
					else
					{
						z[i]=tem_ans;
					}
				}
				
				if(tem_ans>2)
				{
				l=i;
				r = i+tem_ans;
				}
				
			}
			else
			{
				while(i+l<r)
				{
					z[i]=z[i-l-r];
					i++;
				}
				l=r=0;
			}
			
		}
		
		
		
		return z;
		
	}

}
