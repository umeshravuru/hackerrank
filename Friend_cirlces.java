package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Friend_cirlces {

	/*
	 * Complete the function below.
	 */
	static int friendCircles(String[] friends) {
		int data[] = new int [friends.length];
		for(int i =0;i<data.length;i++) {
			data[i] = i;
			
		}
		disp(data);
		for(int i =0;i<friends.length-1;i++) {
			for(int j =i+1;j<friends.length;j++) {
				if(friends[i].charAt(j)=='Y')
				{
					int now = data[i];
					for(int k =0;k<data.length;k++) {
						if(data[k]== now)
							data[k] = j;
					}
					disp(data);
				}
				
			}
		}
		disp(data);
		Map<Integer, Integer> mapper = new HashMap();
		for(int i =0;i<data.length;i++) {
			mapper.put(data[i], 1);
		}
		
		
		return mapper.size();
	}
	public static void disp(int [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = null;
		if (fileName != null) {
			bw = new BufferedWriter(new FileWriter(fileName));
		} else {
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		int res;
		int friends_size = 0;
		friends_size = Integer.parseInt(in.nextLine().trim());

		String[] friends = new String[friends_size];
		for (int i = 0; i < friends_size; i++) {
			String friends_item;
			try {
				friends_item = in.nextLine();
			} catch (Exception e) {
				friends_item = null;
			}
			friends[i] = friends_item;
		}

		res = friendCircles(friends);
		bw.write(String.valueOf(res));
		bw.newLine();

		bw.close();
	}
}
