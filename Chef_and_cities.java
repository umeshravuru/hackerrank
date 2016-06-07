package hack;

import java.util.Scanner;

public class Chef_and_cities
{

	public static void main(String[] args) throws InterruptedException
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}

		int q = s.nextInt();
		for(int ii =0;ii<q;ii++)
		{
			int dec = s.nextInt();
			if(dec == 1)
			{
					int a = s.nextInt();
					int b = s.nextInt();
					data[a-1]=b; 
			}
			else
			{
				int a = s.nextInt();
				String prod = "1";
				for(int i =0;i<n;i=i+a)
				{
					prod = mult(prod,String.valueOf(data[i]));
				}
				
				String tem = mod_func(prod, "1000000007");
//				char ans1 =' ';
//				for(int j = 0 ;j<prod.length();j++)
//				{
//					if(tem.charAt(j)!='0')
//					{
//						ans1 = prod.charAt(j);
//						break;
//					}
//				}
				String ans2 ="";
				for(int j =0;j<tem.length();j++)
				{
					if(tem.charAt(j)!='0')
					{
						for(int k =j;k<tem.length();k++)
						{
							ans2= ans2+tem.charAt(k);
						}
						break;
					}
				}
				
				System.out.println(String.valueOf(prod.charAt(0))+" "+ans2);
				
				
			}
		}

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
	
	public static String mult(String a,String b)
	{
		
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
	}
	
	public static String sub_func(String a, String b)
			throws InterruptedException
	{
//		 System.out.println(a + " " + b);
//		Thread.sleep(100);
		String ans = "";
		int min_len = Math.min(a.length(), b.length());
		int a_len = a.length();
		int b_len = b.length();
		for (int i = 0; i < b_len - min_len; i++)
		{
			a = "0" + a;
		}
		for (int i = 0; i < a_len - min_len; i++)
		{
			b = "0" + b;
		}
		if (a.equals(b))
			return "0";

		int aaa[] = new int[a.length()];
		int bbb[] = new int[b.length()];
		for (int i = 0; i < a.length(); i++)
		{
			aaa[i] = (int) a.charAt(i) - 48;
			bbb[i] = (int) b.charAt(i) - 48;
		}

		for (int i = a.length() - 1; i >= 0; i--)
		{
			if (bbb[i] > aaa[i])
			{
				ans = String.valueOf(aaa[i] - bbb[i] + 10) + ans;
				for (int j = i - 1; j >= 0; j--)
				{
					if (aaa[j] == 0)
					{
						aaa[j] = 9;
					} else
					{
						aaa[j] = aaa[j] - 1;
						break;
					}
				}

			} else
			{
				ans = String.valueOf(aaa[i] - bbb[i]) + ans;
			}
		}

		return ans;
	}
	public static String mod_func(String a, String b) throws InterruptedException
	{

		int min_len = Math.min(a.length(), b.length());
		int a_len = a.length();
		int b_len = b.length();
		for (int i = 0; i < b_len - min_len; i++)
		{
			a = "0" + a;
		}
		for (int i = 0; i < a_len - min_len; i++)
		{
			b = "0" + b;
		}
		
		while(bigg(a,b))
		{
			a= sub_func(a, b);
		}
		
		
		
		return a;
	}
	public static boolean bigg(String a, String b)
	{
		int min_len = Math.min(a.length(), b.length());
		int a_len = a.length();
		int b_len = b.length();
		for (int i = 0; i < b_len - min_len; i++)
		{
			a = "0" + a;
		}
		for (int i = 0; i < a_len - min_len; i++)
		{
			b = "0" + b;
		}
		
		for(int i =0;i<a.length();i++)
		{
			if(a.charAt(i)<b.charAt(i))
				return false;
			else if(a.charAt(i)>b.charAt(i))
				return true;
		}
		
		return true;
	}
	

}


