package hack;

import java.util.Scanner;

public class Z_algo
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		String a =data.split(" ")[0];
		String b = data.split(" ")[1];
		String c = b + "%" + a;
		char[] d = c.toCharArray();
		String f = rever(b)+"%"+rever(a);
		char[] e = f.toCharArray();

		int[] ans1 = z_algo(d);
		int[] ans2 = z_algo(e);
		int final_Ans =0;
		
//		for (int i = 0; i < ans2.length; i++)
//		{
//			System.out.print(ans2[i] + " ");
//		}
		int final_ans = 0;
		int n = a.length();
		int m = b.length();
		
		for(int i = m + 1, j = 0; i < m + n + 1 && i + m - 1 < m + n + 1; i++,j++){
			int x = ans1[i];
			//System.out.println(m+1+(n-1-(j+m-1)));
			if(m + 1 + (n-1-(j + m - 1)) >= ans2.length)
				break;
			if(m + 1 + (n-1-(j + m - 1)) <= m)
				break;
			//System.out.println(m + (m-1-(j+m-1)));
			int y = ans2[m + 1 + (n-1-(j + m - 1))];
			//System.out.println(i + " " + x + " " + y);
			if(x + y == m - 1)
				final_ans++;
		}
		System.out.println(final_Ans);

	}

	public static int[] z_algo(char pat[])
	{
		int n = pat.length;
		int z[] = new int[n];

		int l = 0, r = 0;
		for (int i = 1; i < n; i++) {
			if (i > r) {
				l = r = i;
				while (r < n && pat[r - l] == pat[r])
					r++;
				z[i] = r - l;
				r--;
			} else {
				int k = i - l;
				if (z[k] < r - i + 1)
					z[i] = z[k];
				else {
					l = i;
					while (r < n && pat[r - l] == pat[r])
						r++;
					z[i] = r - l;
					r--;
				}
			}
		}

		// z[0] = 0 , n;
		return z;
	}
	public static String rever(String a)
	{
		String ans ="";
		for(int i =0;i<a.length();i++)
		{
			ans=ans+a.charAt(a.length()-1-i);
		}
		
		
		return ans;
	}

}
