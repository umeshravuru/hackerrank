package hack;

import java.util.Scanner;

public class sub_string_testing
{

	public static void main(String[] args)
	{
		String tem = "abcdefghij";
		
		System.out.println(tem);
		
		tem = tem.substring(0,4)+"0"+tem.substring(5,tem.length());

		System.out.println(tem);
		
		
	}

}
