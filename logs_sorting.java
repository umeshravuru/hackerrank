package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class logs_sorting {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
	ArrayList<String> data = new ArrayList();
		for (int i = 0; i < t; i++) {
			data.add(s.nextLine());
		}
			
		System.out.println(sol(t,data));
	}

	public static List<String> sol(int n, List<String> data) {
		List<String> ans = new ArrayList();
			
		List<String> a = new ArrayList();
		List<String> b = new ArrayList();
		for(int i =0;i<data.size();i++) {
			String now[] = data.get(i).split(" ");
			if((int)now[1].charAt(0)>=97 && (int)now[1].charAt(0)<=122) {
				a.add(data.get(i));
			}
			else
				b.add(data.get(i));
		}
		
//		System.out.println(a);
		for(int i =0;i<a.size();i++)
		{
			for(int j =0;j<a.size()-1;j++)
			{
				int index1 = a.get(j).indexOf(" ");
				int index2 = a.get(j+1).indexOf(" ");
				String after1 = a.get(j).substring(index1+1, a.get(j).length());
				String after2 = a.get(j+1).substring(index2+1, a.get(j+1).length());
				
				if(bigger(after1, after2)>0) {
					Collections.swap(a, j, j+1);
////						String tem = a.get(j);
//						a.remove(j);
//						a.add(j,a.get(j+1));
//						a.remove(j+1);
//						a.add(j+1,tem);
				}
				else if(bigger(after1, after2)==0) {
					String before1 = a.get(j).substring(0,index1);
					String before2 = a.get(j+1).substring(0,index2);
					if(bigger(before1, before2)>0) {
						Collections.swap(a, j, j+1);
//						String tem = a.get(j);
//						a.remove(j);
//						a.add(j,a.get(j+1));
//						a.remove(j+1);
//						a.add(j+1,tem);
					}
				}
			}
		}
		
		for(int i =0;i<a.size();i++) {
			ans.add(a.get(i));
		}
		for(int i =0;i<b.size();i++) {
			ans.add(b.get(i));
		}
		
//		System.out.println(ans);
		return ans;
	}
	
	public static int bigger(String a, String b) {
		System.out.println("--"+a+"--");
		System.out.println("--"+b+"--");
//		System.out.println(a.compareTo(b));
		return a.compareTo(b);
	}
	
	public static int bigger1(String a, String b) {
		System.out.println("--"+a+"--");
		System.out.println("--"+b+"--");
		for(int i =0;i<Math.min(a.length(), b.length());i++) {
			if((int)a.charAt(i) < (int)b.charAt(i))
				return 1;
		}
		
		return 0;
		
	}
	
	
	

}
