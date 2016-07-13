package Hackerrank;
import java.util.Scanner;
public class String_reverse_eff
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		char[] data1 = data.toCharArray();
		for (int i = 0; i < data1.length / 2; i++)
		{
			char tem = data1[i];
			data1[i] = data1[data1.length - 1 - i];
			data1[data1.length - 1 - i] = tem;
		}
		String ans = new String(data1);
		System.out.println(ans);
	}
}
