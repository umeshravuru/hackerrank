package practice;

import java.util.Scanner;

public class String_Builders {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		StringBuilder sb = new StringBuilder();
		String data1[] = data.split(" ");
		for(int i =0;i<data1.length;i++)
		{
			sb.append(data1[data1.length-1-i]+" ");
		}
		
		
		System.out.println(sb);
		
	}

}
