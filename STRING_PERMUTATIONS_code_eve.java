package beer_night;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class STRING_PERMUTATIONS_code_eve
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            char data[] = line.toCharArray();
            Arrays.sort(data);
//            String tem = new String(data);
            ArrayList<String> ans =sortedPermutations(data);
    		for(int i=0;i<ans.size()-1;i++)
    		{
    			System.out.print(ans.get(i)+",");
    		}
    		
    		System.out.print(ans.get(ans.size()-1));
            System.out.println();
        }
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
