package hack;

import java.util.Scanner;

public class anurag_shift_1
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n =s.nextInt();
		int now = n%10;
		System.out.println(now);
		String tem = String.valueOf(n);
		System.out.println(tem);
		int ans = (int) (now*(Math.pow(10, tem.length()-1))+n/10);
		System.out.println(ans);
		
		
	}

}
