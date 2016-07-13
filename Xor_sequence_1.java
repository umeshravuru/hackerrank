package Hackerrank;

public class Xor_sequence_1
{

	public static void main(String[] args)
	{
		int data[]= new int [100];
		
		data[0]=4;
		for(int i=8;i<100;i=i+4)
		{
			int tem = data[i-1]^i;
			data[i]= tem;
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
