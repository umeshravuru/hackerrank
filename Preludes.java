package hack;

import java.util.Scanner;

public class Preludes
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String[][] input = new String[5][2];
		input[0][0] = "A#";
		input[0][1] = "Bb";

		input[1][0] = "C#";
		input[1][1] = "Db";

		input[2][0] = "D#";
		input[2][1] = "Eb";

		input[3][0] = "F#";
		input[3][1] = "Gb";

		input[4][0] = "G#";
		input[4][1] = "Ab";
		int ii = 1;
		
		String []chekker = new String[10];
		
		chekker[0]="Ab minor";
		chekker[1]="D# major";
		chekker[2]="A# major";
		chekker[3]="D# minor";
		chekker[4]="A# minor";
		
		chekker[5]="Gb major";
		chekker[6]="C# major";
		chekker[7]="Gb minor";
		chekker[8]="Db minor";
		chekker[9]="G# major";
		
		while (s.hasNext())
		{
			String data1 = s.nextLine();
			String[] data = data1.split(" ");
			int che = 0;
			String final_ans="";
			for (int i = 0; i < 5; i++)
			{
//				System.out.println(data[0]);
				if (data[0].equals(input[i][0]))
				{
					final_ans=input[i][1]+" "+data[1];
//					System.out.print("Case " + ii + ": " + input[i][1]);
					che = 1;
					break;
				}
				if (data[0].equals(input[i][1]))
				{
					final_ans=input[i][0]+" "+data[1];
//					System.out.print("Case " + ii + ": " + input[i][0]);
					che = 1;
					break;
				}

			}	
			if(che==1)
			{
				for(int i =0;i<10;i++)
				{
					if(chekker[i].equals(final_ans))
						che=0;
				}
			}
			

			if (che == 0)
				System.out.println("Case " + ii + ": UNIQUE");
			else
				System.out.println("Case " + ii + ": " +final_ans);

			ii++;
		}

	}

}
