package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Password_Cracker_1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException, InterruptedException {

//		 BufferedReader br = new BufferedReader(new
//		  InputStreamReader(System.in));

		BufferedReader br = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/Desktop/testData.txt"));

		int t = Integer.parseInt(br.readLine());

		for (int ii = 0; ii < t; ii++) {
			int n = Integer.parseInt(br.readLine());
			String da = br.readLine();
			String data[] = da.split(" ");
			String key = br.readLine();
			Set<String> dic = new HashSet<>();
			for (int i = 0; i < data.length; i++) {
				dic.add(data[i]);
			}
			Set<String> invalid = new HashSet<String>();
			String ans = helper(key, dic,invalid);
			if (ans.contains("-1"))
				System.out.println("WRONG PASSWORD");
			else
				System.out.println(ans.substring(0,ans.length()-1));
		}

	}

	private static String helper(String data, Set<String> dic, Set<String> invalid) throws InterruptedException {
//		System.out.println(data);
//		Thread.sleep(1000);
		if (data.length() <= 0)
			return "";
		if(invalid.contains(data))
			return "-1";
		List<String> stack = new ArrayList<>();
		for (int i = 0; i < data.length() + 1; i++) {
			if (dic.contains(data.substring(0, i))) {
				stack.add(data.substring(0, i));
			}
		}
		String ans = "";
		for (String now : stack) {
			ans = now + " "
					+ helper(data.substring(now.length(), data.length()), dic,  invalid);
			if (!ans.contains("-1"))
				return ans;
			else
				invalid.add(data.substring(now.length(), data.length()));
		}

		return "-1";
		
	}

}
