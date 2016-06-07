
// Manacher’s algorithm implementation working

package beer_night;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sub_palindrome_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		Map<String, Integer>  final_ans = new HashMap<String, Integer> ();
		int length   = data.length();
		
		int [][] R = new int [2][length+1];
		data = "$"+data+"%";
		
		for(int ii =0;ii<2;ii++)
		{
			
			int radius =0;
			R[ii][0]=0;
			int i =1;
			while(i<=length)
			{
				 while (data.charAt(i-radius-1) == data.charAt(i+ii+radius))
						{
					 		radius+=1;
						}
				 R[ii][i]=radius;
				 int k =1;
				 while(R[ii][i-k]!=radius-k && k<radius)
				 {
					 R[ii][i+k] = Math.min(R[ii][i-k], radius - k);
					 k += 1;
				 }
				 radius = Math.max(radius - k, 0);
				            i += k;
			}
		}
		
		
		
		data = data.substring(1,data.length()-1);
//		if(final_ans.get(data.substring(0,1))==null)
//			final_ans.put(data.substring(0,1), 1);
//		else
//			final_ans.put(data.substring(0,1), final_ans.get(data.substring(0,1))+1);
		final_ans.put(data.substring(0,1), 1);
		for(int i=1;i<data.length();i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k =R[j][i];k>0;k--)
				{
//					if(final_ans.get(data.substring(i - k - 1 , i - k - 1 + 2 * k + j))==null)
//						final_ans.put(data.substring(i - k - 1 , i - k - 1 + 2 * k + j), 1);
//					else
//						final_ans.put(data.substring(i - k - 1 , i - k - 1 + 2 * k + j), final_ans.get(data.substring(i - k - 1 , i - k - 1 + 2 * k + j))+1);
					
					final_ans.put(data.substring(i - k - 1 , i - k - 1 + 2 * k + j), 1);
				}
			}
			if(final_ans.get(data.substring(i,i+1))==null)
				final_ans.put(data.substring(i,i+1), 1);
			else
				final_ans.put(data.substring(i,i+1), final_ans.get(data.substring(i,i+1))+1);
			
//			final_ans.put(data.substring(i,i+1), 1);
		}
		
		
		
		System.out.println(final_ans);
		
		
		
		
	}

}
