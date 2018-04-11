package Hackerrank;

import java.util.Scanner;

class Xor_sequence_2
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);

		int data[] = new int [1000];
		for(int i =1;i<100;i++)
		{
			int tem = data[i-1]^i;
			data[i]= tem;
//			System.out.println(tem);
			System.out.println(make_Same_length(String.valueOf(tem)) +" -- "+ make_Same_length(Integer.toBinaryString(tem)));
		}




	}

	public static String make_Same_length(String data)
	{
		int len = data.length();
		for(int i =0;i<6-len;i++)
		{
			data= "0"+data;
		}

		return data;

	}


}
