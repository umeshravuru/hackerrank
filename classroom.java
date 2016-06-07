package hack;

import java.util.Scanner;

public class classroom
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		int m = Integer.parseInt(s.nextLine());
		
		System.out.println(sollu(data,m));
		
		
	}
	
	
	public static int sollu(String data, int m){
		int final_ans=0;
		String check="";
		for(int i =0;i<m;i++){
			check=check+"G";
		}
		if(data.contains(check) || data.replace('X', 'G').contains(check))
		{
			return 0;
		}
		
		else	
		{	
			data=data.replace('X', 'G');
//			System.out.println("ds");
//			System.out.println(max_co(data,check));
			return max_co(data, check);
			
			
		}
		
		
		
		
//		return final_ans;
	}
	
	public static int max_co(String data, String check)
	{
		String ans ="";
		int max =check.length();
		for(int i =0;i<data.length()-check.length();i++)
		{
			int tem =0;
			for(int j =0;j<check.length();j++)
			{
				System.out.println(data.substring(i,check.length()+i));
				if(check.charAt(j)!=data.substring(i,check.length()).charAt(j))
					tem++;
			}
			if(tem<max)
			{
				max = tem;
				ans =data.substring(i,check.length());
			}
		}
		
		
		return max;
//		return ans+String.valueOf(max);
	}

}