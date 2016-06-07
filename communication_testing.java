package hack;

import java.util.Scanner;

public class communication_testing
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int data =s.nextInt();
		String data_bin =Integer.toBinaryString(data);
		System.out.println("data_bin "+data_bin);
		String shift_data_bin = "";
		for(int i =1;i<data_bin.length();i++)
		{
			shift_data_bin=shift_data_bin+data_bin.charAt(i);
		}
		shift_data_bin=shift_data_bin+"0";
		
		System.out.println("shifted "+shift_data_bin);
		
		System.out.println(Integer.parseInt(data_bin,2)^Integer.parseInt(shift_data_bin,2));
		
	}

}
