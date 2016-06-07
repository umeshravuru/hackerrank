package hack;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Towers_of_Powers_2_Power_Harder_2
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int casee = 0;
		while(s.hasNext())
		{
			casee++;
		int n = Integer.parseInt(s.nextLine());
		String[] data1 = new String[n];
		String[] data2 = new String[n];
		
		for(int ii =0;ii<n;ii++)
		{
			data1[ii]=s.nextLine();
//			data1[ii]=data1[ii].replace('^', ' ');
//			System.out.println(data1[ii]);
			String [] data1_arr = data1[ii].split("\\^");
//			System.out.println(data1_arr.length);
			if(data1_arr.length==1)
			{
				data2[ii]=data1[ii];
			}
			else
			{
				String tem ="1";
				for(int i =0;i<data1_arr.length;i++)
				{
					tem = power(data1_arr[data1_arr.length-1-i],tem);
				}
				data2[ii]=tem;
			}
//			data1[ii]=data1[ii].replace(' ', '^');
		}
		
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(data2[j].equals(data2[j+1]))
				{
					
				}
				else if(big(data2[j],data2[j+1]))
				{
					String temmm = data2[j];
					data2[j]=data2[j+1];
					data2[j+1]=temmm;
					
					temmm = data1[j];
					data1[j]=data1[j+1];
					data1[j+1]=temmm;
				}
			}
		}
		System.out.println("Case "+casee+":");
		for(int i =0;i<data1.length;i++)
		{
			System.out.println(data1[i]);
		}
//		disp(data1);
//		disp(data2);
		}
		
		
		
		
	}
	public static String power(String a,String b)
	{
//		System.out.println(a+" "+b);
		String tem =a;
		for(int i =1;i<Integer.parseInt(b);i++)
		{
			tem = Mult_pandy(tem, a);
		}
		
		return tem;
	}
	
	
	public static String Add_pandy(String a, String b)
	{
//		System.out.println(a + " " + b);
		String ans = "";
		if (a.length() != b.length())
		{
			int len1 = a.length();
			int len2 = b.length();
			int lenght_max = Math.max(len1, len2);

			for (int i = 0; i < lenght_max - len1; i++)
			{
				a = "0" + a;
			}
			for (int i = 0; i < lenght_max - len2; i++)
			{
				b = "0" + b;
			}
		}

		int carry = 0;
		int tem = 0;
		for (int i = a.length() - 1; i >= 0; i--)
		{
			tem = Integer.parseInt(String.valueOf(a.charAt(i)))
					+ Integer.parseInt(String.valueOf(b.charAt(i))) + carry;
			if (tem >= 10)
				carry = 1;
			else
				carry = 0;
			ans = String.valueOf(tem % 10) + ans;
		}
		if (carry == 1)
			ans = String.valueOf(carry) + ans;

		// System.out.println(a);
		// System.out.println(b);

		return ans;
	}
	
	
	public static String Mult_pandy(String a, String b)
	{
		if (b.length() > a.length())
		{
			String tem1 = a;
			a = b;
			b = tem1;
		}
		String bb = "0";
		int len1 = a.length();
		int len2 = b.length();
		for (int i = len2 - 1; i >= 0; i--)
		{
			String aa = "";
			int carry = 0;
			int tem = 0;
			for (int j = len1 - 1; j >= 0; j--)
			{
				tem = Integer.parseInt(String.valueOf(a.charAt(j)))
						* Integer.parseInt(String.valueOf(b.charAt(i))) + carry;
				if (tem >= 10)
					carry = tem / 10;
				else
					carry = 0;
				aa = String.valueOf(tem % 10) + aa;
			}
			if (carry >= 1)
				aa = String.valueOf(carry) + aa;
			for (int j = 0; j < len2 - 1 - i; j++)
			{
				aa = aa + "0";
			}
			bb = Add_pandy(aa, bb);

		}

		return bb;
//	System.out.println(bb);
	}
	
	public static void disp(String [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}
	
	public static boolean big(String a, String b)
	{
		if(b.length()>a.length())
			return false;
		else if(b.length()<a.length())
			return true;
		else
		{
			for(int i=0;i<a.length();i++)
			{
				if((int)a.charAt(i)>(int)b.charAt(i))
					return true;
				else if((int)a.charAt(i)<(int)b.charAt(i))
					return false;
				
			}
		}
		
		return true;
	}
	


}
