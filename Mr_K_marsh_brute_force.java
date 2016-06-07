package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Mr_K_marsh_brute_force
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int m =s.nextInt();
		String breaker= s.nextLine();
		int [][] data = new int [n][m];
		ArrayList<Integer> x_position = new ArrayList<Integer>();
		ArrayList<Integer> y_position = new ArrayList<Integer>();
		for(int i =0;i<n;i++)
		{
			String tem = s.nextLine();
			for(int j=0;j<m;j++)
			{
				if(tem.charAt(j)=='x')
				{
					data[i][j]=-1;
					x_position.add(i);
					y_position.add(j);
					
				}
			}
		}
		System.out.println(x_position);
		System.out.println(y_position);
		int ans=0;
		int tem=0;
		
		for(int i1=0;i1<n-1;i1++)
		{
			for(int i2=0;i2<m-1;i2++)
			{
				for(int i3=i1+1;i3<n;i3++)
				{
					for(int i4=i2+1;i4<m;i4++)
					{
						int check=0;
						System.out.println(i1+" "+i2+" "+i3+" "+i4+" area "+2*(i3-i1+i4-i2));
						//System.out.println("i3"+i3);
						for(int i=0;i<x_position.size();i++)
						{
							if(x_position.get(i)==i3 || x_position.get(i)==i1)
							{
								check=1;
								break;
							}
							else
							{
								if(y_position.get(i)==i4 || y_position.get(i)==i2)
								{
									check=1;
									break;
								}
								else
								{
									tem=2*(i3-i1+i4-i2);
								}
							}
						}
						if(check!=1)
						{
						if(ans<tem)
						{
							ans=tem;
							System.out.println(" ------------- "+i1+" "+i2+" "+i3+" "+i4+" area "+2*(i3-i1+i4-i2));
							
						}
						}
					}
				}
				
				
			}
		}
		System.out.println(ans);
		
		

	}

}
