package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.crypto.CipherInputStream;


public class BFFs
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t  = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n = s.nextInt();
			int data[]= new int [n];
			for(int i=0;i<n;i++ )
			{
				data[i]=s.nextInt();
			}
			int ans =0;
			for(int i =0;i<n;i++)
			{
				Map<Integer, Integer> circle_map = new HashMap<Integer,Integer>();
				ArrayList<Integer> circle_array = new ArrayList<Integer> (); 
				circle_map.put(i+1, 1);
				circle_array.add(i+1);
				while(true)
				{
					int tem = data[circle_array.get(circle_array.size()-1)-1];
					if(circle_map.get(tem)==null)
					{
						circle_map.put(tem,1);
						circle_array.add(tem);
					}
					else if(tem==circle_array.get(0))
					{
						circle_map.put(tem,1);
						circle_array.add(tem);
//						System.out.println(circle_array);
						if(ans<circle_array.size()-1)
						{
							ans = circle_array.size()-1;
						}
						break;
					}
					else if(tem == circle_array.get(circle_array.size()-2))
					{
						for(int j=0;j<n;j++ )
						{
							if(data[j]==circle_array.get(circle_array.size()-1) && (tem!=j+1))
							{
								circle_array.add(j+1);
								break;
							}
						}
//						System.out.println(circle_array+" cse ");
						if(ans<circle_array.size())
							ans = circle_array.size();
						break;
					}
					else
					{
//						System.out.println(circle_array);
//						if(ans<circle_array.size())
//							ans = circle_array.size();
						break;
					}
				}
				if(ans==n)
					break;
			}
			System.out.println("Case #"+(ii+1)+": "+ans);
			
		}
		
		
	}

}
