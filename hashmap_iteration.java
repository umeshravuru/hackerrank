package beer_night;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap_iteration
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		Map<String, Integer> dic = new HashMap<String, Integer>();
		while (true)
		{
			if (data1.equals("clear"))
				break;
			else
			{

				String[] data = data1.split(" ");
				if (data[0].equals("def"))
				{
					dic.put(data[1], Integer.parseInt(data[2]));
				} else if (data[0].equals("calc"))
				{}

			}

			data1 = s.nextLine();
		}
		
		System.out.println(dic);

		for (String key : dic.keySet()) {
		    System.out.println("Key: " + key + ", Value: " + dic.get(key));
		}
		
		
		
	}

}
