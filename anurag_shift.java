package hack;

import java.util.Scanner;

public class anurag_shift
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		String tem = data.charAt(data.length()-1)+data.substring(0, data.length()-1);
		System.out.println(tem);
		
	}

}
