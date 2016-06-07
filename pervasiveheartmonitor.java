package hack;


import java.util.Scanner;

public class pervasiveheartmonitor
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		while(s.hasNext())
		{
			String data1 = s.nextLine();
			String [] data = data1.split(" ");
			float sum =0;
			String name ="";
			int sum_total = 0;
			for(int i =0;i<data.length;i++)
			{
				if(isnumber(data[i]))
				{
					sum=sum+Float.parseFloat(data[i]);
					sum_total++;
				}
				else
				{
					name = name + " "+data[i];
				}
			}
			name = name.substring(1,name.length());
			float ans = (float)(sum/sum_total);
//			System.out.println(ans);
			ans = Math.round(ans*100);
			System.out.println(ans/100+" "+name);
			
		}
		
		
	}
	
	/// 48 57
	public static boolean isnumber(String data)
	{
		for(int i =0;i<data.length();i++)
		{
			if((int)data.charAt(i)>=48 && (int)data.charAt(i)<=57)
				return true;
			else
				return false;
		}
		return false;
		
		
	}
	

}
