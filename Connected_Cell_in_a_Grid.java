package beer_night;

import java.util.ArrayList;
import java.util.Scanner;

public class Connected_Cell_in_a_Grid
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int data[][] = new int [n][m];
		int visted [][] = new int [n][m];
		ArrayList<Integer> x = new ArrayList<>();
 		ArrayList<Integer> y = new ArrayList<>();
 		for(int i =0;i<n;i++)
 		{
 			for(int j =0 ;j<m;j++)
 			{
 				data[i][j]= s.nextInt();
 				if(x.size()==0)
 				{
 					if(data[i][j]==1)
 					{
 						x.add(i);
 						y.add(j);
 					}
 				}
 			}
 		}
 		
 		int final_ans = 0;
 		
 		while(x.size()!=0)
 		{
// 			if(data[x.get(0)][])	
 		}
 		
				
		
		
	}

}
