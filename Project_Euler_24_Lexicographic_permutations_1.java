package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_Euler_24_Lexicographic_permutations_1
{

	public static void main(String[] args) throws InterruptedException
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int length = 13;
		long fac[] = new long[length + 1];
		fac[0] = 1;
		fac[1] = 1;
		for (int i = 2; i < length + 1; i++)
		{
			fac[i] = fac[i - 1] * i;
		}

		for (int ii = 0; ii < t; ii++)
		{
			long data = s.nextLong();
			ArrayList<Character> alph = new ArrayList<>();
			for (int i = 0; i < length; i++)
			{
				alph.add((char) (97 + i));
			}
//			System.out.println(alph);
			String ans = "";
			long main_Data = data;
			while (data > 0 && alph.size()>0)
			{
				int tem = 0;
				for (int i = 0; i < alph.size(); i++)
				{
					if (data > fac[alph.size() - 1])
					{
						tem++;
						data = data - fac[alph.size()-1];
					} else
						break;
				}
				ans = ans + alph.get(tem);
				alph.remove(tem);
				Thread.sleep(100);
//				System.out.println(data + " " + ans + " " + alph);

			}
			System.out.println(ans);

		}

	}

}
