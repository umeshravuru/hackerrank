package webScrap.org.webScrap;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class cookie_setting_to_call_a_site_JSOUP {

	public static void main(String[] args) throws IOException {
		/*
		Document doc = Jsoup.connect(
				"https://www.google.co.in/search?q=umesh").get();
		Elements data = doc.body().select(".gb_7a");
//		System.out.println(data.get(0));
		
		
		Document doc1 = Jsoup.connect(
				"https://www.truecaller.com/search/in/9849006180").get();
		System.out.println(doc1);
		Elements data1 = doc1.body().select(".TopNav");
		System.out.println(data1);
		*/
		
	
		String Url = "http://34.216.132.109:8083/fp/";
		Connection.Response response = Jsoup.connect(Url)
		        .method(Connection.Method.GET)
		        .execute();
		
		int page = 1;
//		Connection.Response response =  null;
		while(page<1002){
//			System.out.println(response.body());
//			System.out.println(response.cookies());
			
//			Document doc = Jsoup.connect(Url).cookie("session", response.cookies().get("session")).get();
			
				
			response = Jsoup.connect(Url).cookies(response.cookies())
			        .method(Connection.Method.GET)
			        .execute();
//			Element next = response.body/();
			String str = response.body().toString();
			int fla = str.indexOf("CodefestCTF");
			int fla1 = str.indexOf("flag");
			if (fla != -1 || fla1 != -1){
				System.out.println("Flag found at page" + page);
				System.out.println(str);
//				break;
			}
			int pos = str.indexOf("/np/");
			String nextUrl = str.substring(pos+4, pos+14);
//			System.out.println(next);
			System.out.println(nextUrl + " "+ page);
			page++;
			
			Url = "http://34.216.132.109:8083/np/" + nextUrl +"/?";
		}
		

	}

}
