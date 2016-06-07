package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Jack_goes_to_Rapture
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int [] graph = new int[n];
		for(int i=0;i<n;i++)
		{
			graph[i]=i;
		}
		int m=s.nextInt();
		
		int [][] data = new int [m][3];
		for(int i=0;i<m;i++)
		{
			data[i][0]=s.nextInt()-1;
			data[i][1]=s.nextInt()-1;
			data[i][2]=s.nextInt();
		}
		
		
		int present=0;
		int first_present=present;
		
		int [] ans = new int [n];
		int [] visit = new int [n];
		
		for(int i=0;i<n;i++)
		{
			ans[i]=100000000;
//			ans[i]=0;
		}
		
		
		visit[present]=1; //// 1 visited
		ans[present]=0;
		
		
		int total_visited=0;
		//int present =1;
		int check=0;
		while(check==0)
		{
			System.out.print(present+"pre ");
		for(int i=0;i<m;i++)
		{
			
			if(data[i][0]==present)
			{
				int tem_ans=ans[data[i][1]];
				if(ans[data[i][1]]==100000000)
					ans[data[i][1]]=0;
//				ans[data[i][1]]= Math.min(ans[data[i][1]], data[i][2]);
				ans[data[i][1]]= ans[data[i][1]]+Math.max(0,-ans[data[i][1]]+data[i][2]);
				
				
//				ans[data[i][1]]=(ans[data[i][1]]+ Math.max(0, data[i][2]-ans[data[i][1]]));
//				if(ans[data[i][1]]<tem_ans && tem_ans!=10000000)
//					ans[data[i][1]]=tem_ans;
//				System.out.print("1" );
			}
			if(data[i][1]==present)
			{
				int tem_ans=ans[data[i][0]];
				if(ans[data[i][0]]==100000000)
					ans[data[i][0]]=0;
				ans[data[i][0]]= ans[data[i][0]]+Math.max(0,-ans[data[i][0]]+data[i][2]);
//				ans[data[i][0]]= Math.min(ans[data[i][0]], data[i][2]);
//				ans[data[i][0]]= Math.max(ans[data[i][0]], data[i][2]);
//				ans[data[i][0]]=(ans[data[i][0]]+ Math.max(0, data[i][2]-ans[data[i][0]]));
//				if(ans[data[i][0]]<tem_ans && tem_ans!=10000000)
//					ans[data[i][0]]=tem_ans;
//				System.out.print("2");
			}
			
			
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}
		System.out.println(" ");
		int min=1000000;
		int max=0;
		int previous_present =present;
		for(int i=0;i<n;i++)
		{
			if(visit[i]==0)
			{
				if(ans[i]<=min)
				{
					//System.out.println(i+"presnt");
					present=i;
					min=ans[i];
				}
			}
			
		}
//		System.out.println(present+" prese");
	
		visit[present]=1;
		
		if(previous_present==present)
			check=1;
		
		total_visited++;
	
		
		
		
//		System.out.println(" ");
		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}
		


	}

}
