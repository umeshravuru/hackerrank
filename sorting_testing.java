package beer_night;

import java.util.Arrays;
import java.util.Scanner;

public class sorting_testing
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		char data[] = line.toCharArray();
        Arrays.sort(data);
        String tem = new String(data);
        System.err.println(tem);
		
		
	}

}
