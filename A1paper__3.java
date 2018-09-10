//package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class A1paper__3
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] data = new int [n-1];
		for(int i =0;i<n-1;i++)
		{
			data[i]=s.nextInt();
		}
		

		int present = 2;
		ArrayList<Integer> ans = new ArrayList<Integer>(); 
		int check =0;
		for(int i=0;i<n-1;i++)
		{
			if(present<=data[i])
			{
				ans.add(present);
				check=1;
				break;
			}
			else
			{
				ans.add(data[i]);
			}
			
			present = (present-data[i])*2;
			
		}
		if(check ==1)
		{
			float  fina_Ans = 0;
			for(int i=ans.size()-1;i>0;i--)
			{
				fina_Ans=(fina_Ans+(ans.get(i)/2)*length_of_sheet(i+2));
				ans.set(i-1, ans.get(i-1)+ans.get(i)/2);
			}
			
			System.out.println(length_of_sheet(5)*4+length_of_sheet(4)*2+length_of_sheet(3)+length_of_sheet(2));
			System.out.println(String.format("%.12f",fina_Ans+length_of_sheet(2) ));
//			System.out.println("");
//			for(int i =0;i<10;i++)
//			{
//				System.out.println(i+" - "+length_of_sheet(i));
//			}
//			System.out.println((float)Math.pow(2,(float) (-3)/4));
		}
		else
			System.out.println("impossible");
		
		
		
	}
	public static float length_of_sheet(int dim)
	{
		if(dim%2==0)
			return (float) Float.parseFloat( String.format("%.12f",((float)Math.pow(2, (float)-3/4)/(float)Math.pow(2, (dim/2)-1))));
		else
			return (float)  Float.parseFloat(String.format("%.12f",((float)Math.pow(2, (float)-5/4)/(float)Math.pow(2, ((dim-1)/2)-1))));
	}
	

}
