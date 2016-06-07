package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Stacy_numbers
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		String dte = s.nextLine();
		String data = s.nextLine();
		int[] length_of_subbtring_array = new int[data.length() + 1];

		ArrayList<Integer> zero_char_position = new ArrayList<Integer>();

		for (int i = 0; i < data.length(); i++)
		{
			if (data.charAt(i) == '0')
				zero_char_position.add(i);
		}
		length_of_subbtring_array[1] = data.length();

		for (int i = 2; i <= data.length(); i++)
		{
			int useless_substring_count = 0;
			for (int j = 0; j < zero_char_position.size(); j++)
			{
				if (data.length() - i >= zero_char_position.get(j))
				{
					useless_substring_count++;
				}
			}
			length_of_subbtring_array[i]=data.length()+1-i-useless_substring_count;

		}

		
		
		for (int i = 1; i <length_of_subbtring_array.length; i++)
		{
//			System.out.print(length_of_subbtring_array[i]+" ");
		}
		
//		System.out.println("");
		
		for (int i = 0; i < m; i++)
		{
			long q = Long.parseLong(s.nextLine());
			long check_sum=0;
			int length_of_sub_string_we_need=1;
			while(check_sum<q)
			{
				check_sum=check_sum+length_of_subbtring_array[length_of_sub_string_we_need];
				length_of_sub_string_we_need++;
			}
			length_of_sub_string_we_need--;
			check_sum=check_sum-length_of_subbtring_array[length_of_sub_string_we_need];
//			System.out.println(length_of_sub_string_we_need + "current shit" + check_sum);
		
		////////// alphabatic sorting  //////////
			ArrayList<String> array_const_length_we_need = new ArrayList<String>();
			if(length_of_sub_string_we_need!=1)
			{
			for(int j=0;j<data.length()-length_of_sub_string_we_need+1;j++)
			{	
				String adder =  data.substring(j,j+length_of_sub_string_we_need);
				if(adder.charAt(0)!='0')
					array_const_length_we_need.add(adder);
				
			}
			}
			else
			{
				for(int j=0;j<data.length()-length_of_sub_string_we_need+1;j++)
				{	
					
						array_const_length_we_need.add(String.valueOf(data.charAt(j)));
					
				}
			}
			
//			System.out.println(array_const_length_we_need);
			
			for(int j=0;j<array_const_length_we_need.size();j++)
			{
				for(int k=0;k<array_const_length_we_need.size();k++)
				{
					if(compare_two_strings(array_const_length_we_need.get(j), array_const_length_we_need.get(k))!=1)
					{
						String temp_to_swap = array_const_length_we_need.get(j);
						array_const_length_we_need.set(j, array_const_length_we_need.get(k));
						array_const_length_we_need.set(k, temp_to_swap);
					}
					
				}
				
			}
			
//			System.out.println(array_const_length_we_need);
			System.out.println(array_const_length_we_need.get((int) (q-check_sum-1)));
		
			
			
			
			
			
		
		
		}

		
		
		
		

	}
	
	
	public static int compare_two_strings(String a,String b){
		
		for(int i=0;i<a.length();i++)
		{
			if((int)a.charAt(i)!=(int)b.charAt(i))
			{
				if((int)a.charAt(i)>(int)b.charAt(i))
					return 1;
				else
					return 0;
			}
		}
		
		
		return 1;
	}

}
