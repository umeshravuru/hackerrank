package hack;

import java.util.LinkedList;
import java.util.Scanner;

public class Longest_Palindromic_Subsequence
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		String data = s.nextLine();
		// data="agbdba";
		int[][] matrix = new int[data.length()][data.length()];
		int len = data.length();
		for (int i = 0; i < len; i++)
		{
			matrix[i][i] = 1;
		}
		LinkedList<Character> final_before = new LinkedList<Character>();
		String final_ans = "";
		char odd_even = 'a';
		for (int i = 1; i < len; i++)
		{
			for (int j = 0; j < len - i; j++)
			{
				// System.out.print(data.charAt(i)+" "+data.charAt(i+j)+" ");
				if (data.charAt(j) == data.charAt(i + j))
				{
					matrix[j][j + i] = 2 + matrix[j + 1][j + i - 1];
					// if (final_before.size() == 0) {
					// odd_even = data.charAt(j + 1);
					// // final_before.add(data.charAt(j+1));
					// }
					// final_before.addFirst(data.charAt(j));
					// final_before.addLast(data.charAt(j));
				} else
				{
					matrix[j][j + i] = Math.max(matrix[j + 1][j + i],
							matrix[j][j + i - 1]);
				}

			}
		}

		for (int j = 0; j < len; j++)
		{
			for (int i = 0; i < len; i++)
			{
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println("");
		}
		
		int ii=0;
		int jj=len-1;
		while(final_before.size()<matrix[0][len-1])
		{
			if(ii==jj)
			{
				//System.out.println("vachau");
				final_before.add(final_before.size()/2, data.charAt(ii));
				
			}
			else if(matrix[ii][jj]==matrix[ii+1][jj-1]+2 && (matrix[ii][jj]>matrix[ii+1][jj]) && matrix[ii][jj]>matrix[ii][jj-1])
			{
			final_before.add(final_before.size()/2,data.charAt(ii));
			final_before.add(final_before.size()/2,data.charAt(ii));
			ii++;
			jj--;
			}
			else if(matrix[ii][jj]==matrix[ii+1][jj])
			{
				ii++;
			}
			else if(matrix[ii][jj]==matrix[ii][jj-1])
			{
				jj--;
			}
			
			
			System.out.println(final_before);
		}

		// if (matrix[0][len - 1] % 2 != 0) {
		// final_before.add(final_before.size() / 2, odd_even);
		// }
		// for (int i = 0; i < final_before.size(); i++) {
		// final_ans = final_ans + String.valueOf(final_before.get(i));
		// }

		System.out.println(final_before);
		System.out.println(final_ans);
		System.out.println();
	}

}
