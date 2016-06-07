package hack;

import java.util.LinkedList;
import java.util.Scanner;

public class Jesse_and_Two_Strings
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());

		for (int ii = 0; ii < t; ii++)
		{
			String a = s.nextLine();
			String b = s.nextLine();
			int len = a.length();
			int[][] matrix = new int[len][len];

			for (int i = 0; i < len; i++)
			{
				matrix[i][i] = 1;
			}
			
			LinkedList<Character> final_before = new LinkedList<Character>();
			String final_ans1 = "";
			char odd_even = 'a';
			for (int i = 1; i < len; i++)
			{
				for (int j = 0; j < len - i; j++)
				{
					if (a.charAt(j) == a.charAt(i + j))
					{
						matrix[j][j + i] = 2 + matrix[j + 1][j + i - 1];
//						if (final_before.size() == 0) {
//							odd_even = a.charAt(j + 1);
//							// final_before.add(data.charAt(j+1));
//						}
//						final_before.addFirst(a.charAt(j));
//						final_before.addLast(a.charAt(j));
					} else
					{
						matrix[j][j + i] = Math.max(matrix[j + 1][j + i],
								matrix[j][j + i - 1]);
					}

				}
			}
			
//			if (matrix[0][len - 1] % 2 != 0) {
//				final_before.add(final_before.size() / 2, odd_even);
//			}
			
			
			int iii=0;
			int jjj=len-1;
			while(final_before.size()<matrix[0][len-1])
			{
				if(iii==jjj)
				{
					//System.out.println("vachau");
					final_before.add(final_before.size()/2, a.charAt(iii));
					
				}
				else if(matrix[iii][jjj]==matrix[iii+1][jjj-1]+2 && (matrix[iii][jjj]>matrix[iii+1][jjj]) && matrix[iii][jjj]>matrix[iii][jjj-1])
				{
				final_before.add(final_before.size()/2,a.charAt(iii));
				final_before.add(final_before.size()/2,a.charAt(iii));
				iii++;
				jjj--;
				}
				else if(matrix[iii][jjj]==matrix[iii+1][jjj])
				{
					iii++;
				}
				else if(matrix[iii][jjj]==matrix[iii][jjj-1])
				{
					jjj--;
				}
				
				
				//System.out.println(final_before);
			}

			
			
			for (int i = 0; i < final_before.size(); i++) {
				final_ans1 = final_ans1 + String.valueOf(final_before.get(i));
			}
//			System.out.println(a.length());
//			System.out.println(final_ans1);
			////////////////////////////////////
			
			len = b.length();
			int[][] matrix1 = new int[len][len];

			for (int i = 0; i < len; i++)
			{
				matrix1[i][i] = 1;
			}
			LinkedList<Character> final_before1 = new LinkedList<Character>();
			String final_ans2 = "";
			char odd_even1 = 'a';
			for (int i = 1; i < len; i++)
			{
				for (int j = 0; j < len - i; j++)
				{
					if (b.charAt(j) == b.charAt(i + j))
					{
						matrix1[j][j + i] = 2 + matrix1[j + 1][j + i - 1];
//						if (final_before1.size() == 0) {
//							odd_even1 = b.charAt(j + 1);
//							// final_before.add(data.charAt(j+1));
//						}
//						final_before1.addFirst(b.charAt(j));
//						final_before1.addLast(b.charAt(j));
					} else
					{
						matrix1[j][j + i] = Math.max(matrix1[j + 1][j + i],
								matrix1[j][j + i - 1]);
					}

				}
			}
//			System.out.println();
			
			
			
			
			
			 iii=0;
			 jjj=len-1;
			while(final_before1.size()<matrix1[0][len-1])
			{
				if(iii==jjj)
				{
					//System.out.println("vachau");
					final_before1.add(final_before1.size()/2, b.charAt(iii));
					
				}
				else if(matrix1[iii][jjj]==matrix1[iii+1][jjj-1]+2 && (matrix1[iii][jjj]>matrix1[iii+1][jjj]) && matrix1[iii][jjj]>matrix1[iii][jjj-1])
				{
				final_before1.add(final_before1.size()/2,b.charAt(iii));
				final_before1.add(final_before1.size()/2,b.charAt(iii));
				iii++;
				jjj--;
				}
				else if(matrix1[iii][jjj]==matrix1[iii+1][jjj])
				{
					iii++;
				}
				else if(matrix1[iii][jjj]==matrix1[iii][jjj-1])
				{
					jjj--;
				}
				
				
				//System.out.println(final_before);
			}
			
			
			
			
			
//			if (matrix1[0][len - 1] % 2 != 0) {
//				final_before1.add(final_before1.size() / 2, odd_even1);
//			}
			for (int i = 0; i < final_before1.size(); i++) {
				final_ans2 = final_ans2 + String.valueOf(final_before1.get(i));
			}
			
			if(final_ans1.length()%2!=0 && final_ans2.length()%2!=0)
//		if(true)
			{
			
			String final_ans=final_ans1+final_ans2;
		
			/////////////////////////////////////////
			System.out.println(final_ans1);
			System.out.println(final_ans2);
			
			LinkedList<Character> final_linked = new LinkedList<Character>();
			final_linked=final_before;
			for(int iiii=0;iiii<final_before1.size();iiii++)
			{
				final_linked.add(final_before1.get(iiii));
			}
			
			len = final_linked.size();
//			System.out.println(final_ans.length());
//			System.out.println(matrix[0][a.length()-1]);
			
			int final_final_ans=0;
			for(int i=0;i<final_linked.size()-1;i++)
			{
				for(int j=i+1;j<final_linked.size();j++)
				{
					if(final_linked.get(i)==final_linked.get(j))
					{
						final_final_ans++;
						final_linked.remove(j);
						final_linked.remove(i);
						i--;
						break;
					}
				}
			}
			
			System.out.println(final_ans1.length()+" "+final_ans2.length());
			if(final_linked.size()==2)
				System.out.println(final_final_ans*2+1);
			else
			System.out.println(final_final_ans*2);
			System.out.println(final_linked);
			System.out.println("next");
			}
			else 
			{
				System.out.println(final_ans1.length()+" "+final_ans2.length());
				System.out.println(final_ans1.length()+final_ans2.length());
				System.out.println("next");
			}

		}

	}

}
