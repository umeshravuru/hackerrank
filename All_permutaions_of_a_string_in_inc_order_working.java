package beer_night;

import java.util.ArrayList;
import java.util.Scanner;

public class All_permutaions_of_a_string_in_inc_order_working
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		char[] data = data1.toCharArray();
		
		ArrayList<String> ans =sortedPermutations(data);
		for(int i=0;i<ans.size()-1;i++)
		{
			System.out.print(ans.get(i)+",");
		}
		
		System.out.print(ans.get(ans.size()-1));
	}
	
	public static ArrayList<String> sortedPermutations(char [] data)
	{
		ArrayList<String> ans = new ArrayList<>();
		while(true)
		{
			String tem = new String(data);
//			System.out.print(tem+",");
			ans.add(tem);
			int now =0;
			for ( now = data.length - 2; now >= 0; --now )
			{
	           if (data[now] < data[now+1])
	           {
	              break;
	           }
			}
			if ( now == -1 )
					break;
			else
	        {
	            int ceilIndex = findCeil( data, data[now], now + 1, data.length - 1 );
	            char temp = data[now];
	            data[now]=data[ceilIndex];
	            data[ceilIndex]= temp;
	            reverse( data, now + 1, data.length - 1 );
	        }
			
		}
		return ans;
	}
	
	public static int findCeil(char[]data, char now, int l, int h)
	{
		int ceilIndex = l;
	    for (int i = l+1; i <= h; i++)
	    {
	      if (data[i] > now && data[i] < data[ceilIndex])
	           ceilIndex = i;
	    }
	    return ceilIndex;
	}
	
	public static void reverse(char data[], int l, int h)
	{
	   while (l < h)
	   {
		   char temp = data[l];
           data[l]=data[h];
           data[h]= temp;
	       l++;
	       h--;
	   }
	}
	 

}
