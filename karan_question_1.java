package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class karan_question_1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		int che = 0;
		String now = data;
		ArrayList<Character> que = new ArrayList<>();
		for (int i = 0; i < now.length(); i++) {
			if (now.charAt(i) == '(' || now.charAt(i) == ')' || now.charAt(i) == '<' || now.charAt(i) == '>'
					|| now.charAt(i) == '{' || now.charAt(i) == '}' || now.charAt(i) == '[' || now.charAt(i) == ']') {
//				System.out.println("sdf");<>
				if (now.charAt(i) == '(' || now.charAt(i) == '[' || now.charAt(i) == '{' || now.charAt(i) == '<') {
					que.add(now.charAt(i));
				} else {
					if (que.size() == 0) {
						che = 1;
						break;
					}
					if (now.charAt(i) == ')') {
						if (que.get(que.size() - 1) != '(') {
							che = 1;
							break;
						} else
							que.remove(que.size() - 1);
					} else if (now.charAt(i) == '}') {
						if (que.get(que.size() - 1) != '{') {
							che = 1;
							break;
						} else
							que.remove(que.size() - 1);
					} else if (now.charAt(i) == ']') {
						if (que.get(que.size() - 1) != '[') {
							che = 1;
							break;
						} else
							que.remove(que.size() - 1);
					} else if (now.charAt(i) == '>') {
						if (que.get(que.size() - 1) != '<') {
							che = 1;
							break;
						} else
							que.remove(que.size() - 1);
					}
				}
			}

		}
//		System.out.println(que);

		if (che == 1)
			System.out.println("0");
		else {
			if (que.size() == 0)
				System.out.println("1");
			else
				System.out.println("0");
		}
	}

}
