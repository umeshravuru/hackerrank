package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Beautiful_Quadruples_1
{

	public static void main(String[] args)
	{
		
			Scanner s = new Scanner(System.in);
		
		int data []= new int [4];
		data[0] =s.nextInt();
		data[1] =s.nextInt();
		data[2] =s.nextInt();
		data[3] =s.nextInt();
		Map<String, Integer> ans =  new HashMap<>();
		for(int i1 =1;i1<=data[0];i1++)
		{
			for(int i2 =i1;i2<=data[1];i2++)
			{
				for(int i3 =i2;i3<=data[2];i3++)
				{
					for(int i4 =i3;i4<=data[3];i4++)
					{
//						System.out.println(i1+" "+i2+" "+i3+" "+i4);
							if((i1^i2^i3^i4) != 0)
							{
								int tem []= {i1,i2,i3,i4};
								
//								ans.put(sort(tem), 1);
//								System.out.println((i1^i2) +" "+ (i3^i4));
							}
					}
				}
			}
		}
		System.out.println(ans.size());
		
		System.out.println(ans);
		
		
		
		
	}
	
	public static String sort(int[] data)
	{
		String ans="";
		
		for(int i =0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(data[j]>data[j+1])
				{
					int tem = data[j];
					data[j]= data[j+1];
					data[j+1]= tem;
				}
				
			}
		}
		ans = String.valueOf(data[0]);
		ans = ans +","+String.valueOf((data[1]));
		ans = ans +","+String.valueOf((data[2]));
		ans = ans +","+String.valueOf((data[3]));
		
		return ans;
	}

}
