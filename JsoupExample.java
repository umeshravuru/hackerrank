package webScrap.org.webScrap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.squareup.okhttp.Request;

public class JsoupExample {

	public static void main(String[] args) throws IOException {
			
		BufferedWriter writer = new BufferedWriter(new FileWriter("10LetterWords.txt"));
//	    writer.write(str);
	     

		
		for (int i = 1; i <= 79; i++) {
			String pageName = "10letterwords";
			if (i != 1)
				pageName = pageName + "page" + i;

			
		Document doc = Jsoup.connect("https://www.bestwordlist.com/"+pageName+".htm").get();
		
		Elements newsHeadlines = doc.body().select(".mot2");
		for (Element headline : newsHeadlines) {
			System.out.println(newsHeadlines.html());
			String now  = headline.html();
			for(String word : now.split(" ")){
				writer.write(word);
				writer.write("\n");
			}
			
			
		}
		
		newsHeadlines = doc.body().select(".mot");
		for (Element headline : newsHeadlines) {
			System.out.println(newsHeadlines.html());
			String now  = headline.html();
			for(String word : now.split(" ")){
				writer.write(word);
				writer.write("\n");
			}
			
			
		}
		
		}
		
		
	    writer.close();
	}

}
