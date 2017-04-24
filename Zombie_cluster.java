package practice;

import java.util.HashSet;
import java.util.Scanner;

public class Zombie_cluster {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String[] data = new String[n];
		for(int i =0;i<n;i++)
		{
			data[i] = s.nextLine();
		}
		System.out.println(sol(data));

	}

	public static int sol(String[] data) {

		int union[] = new int[data.length];
		for (int i = 0; i < union.length; i++) {
			union[i] = i;
		}
		disp(union);
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				System.out.println(data[i].charAt(j)==1);
				if(data[i].charAt(j)=='1')
				{
					int tem = union[j];
					System.out.println(i+" "+j+" "+tem);
					for (int k = 0; k < union.length; k++)
					{
						if(union[k]==tem)
							union[k]=union[i];
					}
					disp(union);
				}
				
			}
		}
		disp(union);
		HashSet<Integer> ans_set = new HashSet<>();
		for (int i = 0; i < union.length; i++)
		{
			if(ans_set.contains(union[i]))
			{
				
			}
			else {
				ans_set.add(union[i]);
			}
		}
		

		return ans_set.size();
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
