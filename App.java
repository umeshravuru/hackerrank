package webScrap.org.webScrap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.ws.Response;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {

		OkHttpClient client = new OkHttpClient();

		// 10letterwords
		// 10letterwordspage2
		// 10letterwordspage3
		// 10letterwordspage79
		
		String str = "Hello";
	    BufferedWriter writer = new BufferedWriter(new FileWriter("10LetterWords.txt"));
	    writer.write(str);
	     
	    writer.close();

		for (int i = 1; i <= 1; i++) {
			String pageName = "10letterwords";
			if (i != 1)
				pageName = pageName + "page" + i;

			Request request = new Request.Builder()
					.url("https://www.bestwordlist.com/"+pageName+".htm")
					.get().addHeader("Cache-Control", "no-cache").build();

			com.squareup.okhttp.Response response = client.newCall(request)
					.execute();

			// System.out.println(pageName + " -- " +
			// response.body().string().toString());

			String now = response.body().string().toString();
//			System.out.println(now.length());
			String split[] = now.split("class=mot");
//			disp(split);
			for (int j = 1; j < split.length; j++) {
//				if(split[j].contains("class=f2"))
//					break;
				System.out.println(" 0000000 "+split[j]);
				if (split[j].charAt(0) == '>') {
					now = split[j].substring(1, split[j].length()).trim();
				} else if (split[i].charAt(0) == '2') {
					now = split[j].substring(2, split[j].length()).trim();
				}
				String wordsArray[] = now.split(" ");
				for (int k = 0; k < wordsArray.length; k++) {
					if (k != wordsArray.length - 1){
						System.out.println(wordsArray[k]);
						
						}
					else {
						System.out.println(wordsArray[k].substring(0, 10));
					}
				}
				
				

			}

		}

	}

	public static void disp(String[] data) {
		System.out.print(data.length);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i] + " ");
		}
		System.out.println();
	}
}
