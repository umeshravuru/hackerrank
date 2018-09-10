package coding;
import java.util.*;
public class Automata_Amazon {
public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		String data = s.nextLine();
		List<String> remo = new ArrayList();
		for(int i =0;i<3;i++) {
			remo.add(s.nextLine());
		}
	
		System.out.println(sol(data,remo));
		
	}
	
	public static List<String> sol(String data, List<String> remo) {
		data = data.toLowerCase();
		String data1 = "";
		for(int i =0;i<data.length();i++){
			if((int)data.charAt(i) >=97 && (int)data.charAt(i) <= 122)
				data1 = data1 + String.valueOf(data.charAt(i));
			else
				data1 = data1 + " ";
		}
		Map<String, Integer> mapper = new HashMap();
		String datasplit[] = data1.split(" ");
		for(int i =0;i<datasplit.length;i++) {
			if(mapper.get(datasplit[i])==null)
					mapper.put(datasplit[i], 1);
			else
				mapper.put(datasplit[i], mapper.get(datasplit[i])+1);
		}
//		System.out.println(mapper);
		Iterator<String> ite2 = remo.iterator();
		while(ite2.hasNext()) {
			String now = ite2.next();
			mapper.remove(now);
		}
//		System.out.println(mapper);
		List<String> remo1 = new ArrayList<String>();
		for(int i =0;i<remo.size();i++){
			remo1.add(convert(remo.get(i)));
		}
		List ans = new ArrayList<String>();
			
		int max = -1;
		for(String key : mapper.keySet())
		{
			if(mapper.get(key) > max)
				max = mapper.get(key);
		}
//		System.out.println(max);
		

		
		Set<String> tem = new HashSet();
		for(String key : mapper.keySet())
		{
			if(mapper.get(key) == max)
				tem.add(key);
		}
		
//		System.out.println(tem);
		
		Iterator<String> ite = remo.iterator();
		while(ite.hasNext()) {
			String now = ite.next();
		tem.remove(now);
		}
		
		Iterator<String> ite1 = tem.iterator();
		while(ite1.hasNext()) {
			String now1 = ite1.next();
			ans.add(now1);
		}
		
		
		return ans;
	}
	public static String convert(String data){
		if(data == null || data.equals(""))
            return "";
		data = data.toLowerCase();
	     String data1 = "";
			for(int i =0;i<data.length();i++){
				if((int)data.charAt(i) >=97 && (int)data.charAt(i) <= 122)
					data1 = data1 + String.valueOf(data.charAt(i));
				else
					data1 = data1 + " ";
			}
			return data1;
	}

}
