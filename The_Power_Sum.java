package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class The_Power_Sum {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		System.out.println();
		
		BufferedReader br = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/testData.txt"));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

//		Scanner s = new Scanner(System.in);
		// int X = s.nextInt();
		// int n = s.nextInt();

		ArrayList<Integer> nn = new ArrayList<Integer>();
		int current = 1;
		while (true) {
			int now = (int)Math.pow(current, n);
			if (now > X)
				break;
			else
				nn.add(now);

			current++;
		}
//		System.out.println(nn);

		int data[][] = new int[nn.size() + 1][X+2];
		
		for (int i = 0; i < nn.size(); i++) {
			data[i+1][0] = nn.get(i);
			data[i+1][1] = 1;
		}
		for (int i = 0; i < data[0].length-1; i++) {
			data[0][i+1] = i;
		}

		
		for (int i = 0; i < data.length-1; i++) {
			for (int j = 0; j < data[0].length-2; j++) {
				// current  = data[i+1][j+2]
//				System.out.println(j+2-data[i+1][0]);
				if(data[i+1][0] == data[0][j+2] || (data[i][j+2]== 1 && data[0][j+2]!= X)){
					data[i+1][j+2] = 1;
				} else if (data[i+1][0] <= j+1 && i >= 1 && data[i][j+2-data[i+1][0]] == 1){
					data[i+1][j+2] = 1;
				}
			}
		}
		
		int ans = 0;
		for (int i = 0; i < nn.size(); i++) {
				if(data[i+1][X+1] == 1)
					ans++;
		}
		System.out.println(ans);
		disp(data);

	}

	public static void disp(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				if(data[i][j] == 0)
					System.out.print("  "+" ");
			else if(data[i][j] <10)
				System.out.print("0"+data[i][j] + " ");
				else
					System.out.print(+data[i][j] + " ");	
			}
			System.out.println();
		}
		System.out.println();
	}

}
