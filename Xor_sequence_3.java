package hack;

public class Xor_sequence_3
{

	public static void main(String[] args)
	{
		
		int now =0;
		for(int i =0;i<100;i++)
		{
			now = now ^ 4*i;
			if(now!=0)
			System.out.println(now+" - "+ conv(Integer.toBinaryString(now)));
			
		}
	}
	public static String conv(String data)
	{
		String ans ="";
		for(int i =0;i<10-data.length();i++)
		{
			ans = "0"+ ans;
		}
		ans = ans + data;
		return ans;
		
	}

}
