package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class thought
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{
			// ArrayList<String> data = new ArrayList<String>();
			int n =s.nextInt();
			int chec=0;
			for (int i1 = 0; i1 < 4; i1++)
			{
				for (int i2 = 0; i2 < 4; i2++)
				{
					for (int i3 = 0; i3 < 4; i3++)
					{
						ArrayList<String> tem = new ArrayList<String>();
						if (i1 == 0)
							tem.add("/");
						if (i1 == 1)
							tem.add("*");
						if (i1 == 2)
							tem.add("+");
						if (i1 == 3)
							tem.add("-");

						if (i2 == 0)
							tem.add("/");
						if (i2 == 1)
							tem.add("*");
						if (i2 == 2)
							tem.add("+");
						if (i2 == 3)
							tem.add("-");

						if (i3 == 0)
							tem.add("/");
						if (i3 == 1)
							tem.add("*");
						if (i3 == 2)
							tem.add("+");
						if (i3 == 3)
							tem.add("-");

						ArrayList<Integer> data = new ArrayList<Integer>();
						data.add(4);
						data.add(4);
						data.add(4);
						data.add(4);
						String output=tem.get(0)+tem.get(1)+tem.get(2);
//						System.out.println(tem);
							 for(int j=0;j<tem.size();j++ )
							 {
								 if(tem.get(j).equals("/"))
								 {
									 data.set(j, data.get(j)/data.get(j+1));
									 data.remove(j+1);
									 tem.remove(j);
									 j--;
								 }
							 }
							 
							 for(int j=0;j<tem.size();j++ )
							 {
								 if(tem.get(j).equals("*"))
								 {
									 data.set(j, data.get(j)*data.get(j+1));
									 data.remove(j+1);
									 tem.remove(j);
									 j--;
								 }
							 }
							 
							 for(int j=0;j<tem.size();j++ )
							 {
								 if(tem.get(j).equals("+"))
								 {
									 data.set(j, data.get(j)+data.get(j+1));
									 data.remove(j+1);
									 tem.remove(j);
									 j--;
								 }
							 }
							 
							 
							 for(int j=0;j<tem.size();j++ )
							 {
								 if(tem.get(j).equals("-"))
								 {
									 data.set(j, data.get(j)-data.get(j+1));
									 data.remove(j+1);
									 tem.remove(j);
									 j--;
								 }
							 }
						
//							 System.out.println(data);
							 

						// data.add(tem);
							 
							 
							 if(n==data.get(0))
							 {
								 String ans="4";
//								 System.out.println("--------------------------"+output);
								 ans=ans+" "+output.charAt(0);
								 ans=ans+" 4";
								 ans=ans+" "+output.charAt(1);
								 ans=ans+" 4";
								 ans=ans+" "+output.charAt(2);
								 ans=ans+" 4";
								 ans=ans+" = ";
								 ans=ans+String.valueOf(n);
								 System.out.println(ans);
								 
								 chec=1;
								 break;
							 }
					}
					if(chec==1)
						break;
				}
				if(chec==1)
					break;
			}
if(chec==0)
	System.out.println("no solution");
			// System.out.println(data);
		}

	}

}
