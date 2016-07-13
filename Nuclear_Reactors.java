package Code_chef;

import java.util.Scanner;

public class Nuclear_Reactors
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int N = s.nextInt();
		int K = s.nextInt();
		int data [] = new int [K];
		int now = A;
		int i =0;
		while(now>0 && i<K)
		{
			data[i]= now%(N+1);
			now = now/(N+1);
			i++;
		}
		for(int j =0;j<K;j++)
		{
			System.out.print(data[j]+" ");
		}
	}

}
