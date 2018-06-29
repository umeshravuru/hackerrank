package coding;

import java.util.Arrays;
import java.util.Scanner;

public class Find_the_subset {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int data[] = new int [b];
		int data1[] = new int [b];
		for(int i =0;i<b;i++){
			data[i] = s.nextInt();
			data1[i] = data[i];
		}
		
		Arrays.sort(data);
		
		for(int i =0;i<b-a;i++)
		{
			for(int j =0;i<b-a;i++)
			{
				
			}
		}		
		
		
	}
}
