package hack;

import java.util.Scanner;

public class Related_Species {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int [] data1=new int[n];
			int [] data2=new int[n];
			for(int j=0;j<n;j++)
			{
				data1[j]=s.nextInt();
			}
			for(int j=0;j<n;j++)
			{
				data2[j]=s.nextInt();
			}
			int start=-1;
			int [] data3= new int [n];
			int check=0;
			for(int j=0;j<n;j++)
			{
				int min=data1[j];
				if(min>data2[j])
					min=data2[j];
				if(start<min)
				{
					
					start=min;
					
					
				}
				else if(start<data1[j])
					start=data1[j];
				else if(start<data2[j])
					start=data2[j];
				else
				{
					check=1;
					break;
				}
//				data3[j]=start;
			}
//			for(int j=0;j<n;j++)
//			{
//				System.out.println(data3[j]);
//			}
			if(check==1)
				System.out.println("NO");
			else
				System.out.println("YES");
			
		}

	}

}
