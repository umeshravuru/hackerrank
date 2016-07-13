package codeeva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class REMOVE_CHARACTERS
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null)
		{
			String tem[] = line.split(",");
			ArrayList<Character> data = new ArrayList<>();
			for (int i = 0; i < tem[0].length(); i++)
			{
				data.add(tem[0].charAt(i));
			}
			for (int i = 1; i < tem[1].length(); i++)
			{
				for (int j = 0; j < data.size(); j++)
				{
					if (data.get(j) == tem[1].charAt(i))
					{
						data.remove(j);
						j--;
					}
				}
			}

			String ans = "";
			for (int i = 0; i < data.size(); i++)
			{
				ans = ans + String.valueOf(data.get(i));
			}
			System.out.println(ans);

		}

	}

}
