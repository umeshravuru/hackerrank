package hack;

import java.util.Scanner;

public class Bear_and_Tower_of_Cubes
{

	public static void main(String[] args) throws InterruptedException
	{
		Scanner s = new Scanner(System.in);
		long m = s.nextLong();
		int data = (int) Math.cbrt(m);

		long n = data * data * data;

		long final_Ans = 0;

		for (long i = m; i > n; i--)
		{
			long tem_ans = 0;
			long tem = i;
			int tem_sqrt = (int) Math.cbrt(tem);
			while (tem > 0)
			{
				tem = tem - (tem/(tem_sqrt * tem_sqrt * tem_sqrt))*tem_sqrt * tem_sqrt * tem_sqrt;
				tem_ans = tem_ans + (tem/(tem_sqrt * tem_sqrt * tem_sqrt));
				System.out.println(tem +" "+ tem_ans+" "+((int)tem/(tem_sqrt * tem_sqrt * tem_sqrt)) );
				tem_sqrt--;
				Thread.sleep(100);
				
			}
			if(final_Ans<tem_ans)
				final_Ans = tem_ans;
			System.out.println(tem_ans);

		}
System.out.println(final_Ans);
	}

}
