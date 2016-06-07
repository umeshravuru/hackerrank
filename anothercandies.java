package hack;

import java.math.BigInteger;
import java.util.Scanner;

public class anothercandies
{

	public static void main(String[] args)
	{
		BigInteger total, tota_students,now,inc,ans,chec;
		inc = new BigInteger("1");
		chec = new BigInteger("0");
		total = new BigInteger("0");
		tota_students = new BigInteger("0");
		Scanner s = new Scanner(System.in);
		int t =Integer.parseInt(s.nextLine());
		for(int i =0;i<t;i++)
		{
			String tem = s.nextLine();
			int n = Integer.parseInt(s.nextLine());
			for(int j = 0;j<n;j++)
			{
				now = new BigInteger(s.nextLine());
				total = total.add(now);
				tota_students = tota_students.add(inc);
			}
			ans = total.mod(tota_students);
			if(ans.equals(chec))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}

}
