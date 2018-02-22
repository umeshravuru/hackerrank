package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Custom_soted_array {

	/*
	 * Complete the function below.
	 */
	static int moves(int[] a) {
		int codes [] = new int [a.length];
		int req [] = new int [a.length];
		int odd = 0;
		for(int i =0;i<a.length;i++)
		{
			codes[i] = a[i]%2;
			if(codes[i]==1)
				odd++;
		}
		System.out.println(odd);
		for(int i = a.length-odd;i<a.length;i++)
			req[i] = 1;
		int changes = 0;
		for(int i =0;i<a.length;i++) {
			if(codes[i] != req[i])
				changes ++;
		}
		disp(codes);
		disp(req);
		
		return changes/2;
	}
	
	public static void disp(int [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = null;
		if (fileName != null) {
			bw = new BufferedWriter(new FileWriter(fileName));
		} else {
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		int res;
		int a_size = 0;
		a_size = Integer.parseInt(in.nextLine().trim());

		int[] a = new int[a_size];
		for (int i = 0; i < a_size; i++) {
			int a_item;
			a_item = Integer.parseInt(in.nextLine().trim());
			a[i] = a_item;
		}

		res = moves(a);
		bw.write(String.valueOf(res));
		bw.newLine();

		bw.close();
	}
}
