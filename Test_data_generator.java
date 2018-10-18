package webScrap.org.webScrap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test_data_generator {

	public static void main(String[] args) {
		
		int t = 1;
		int n = 20;
		System.out.println(n);
//		System.out.println(n);
		int data[] = new int[n];
		for(int i =0;i<n;i++){
			data[i] = ((int)(Math.random()*10) )+1; 
//			System.out.print(((int)(Math.random()*10) )+" ");
		}
		Arrays.sort(data);
		disp(data);
		
		
	}
	public static void disp(int [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}


}
