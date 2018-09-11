package webScrap.org.webScrap;

/**
 * @author UXR08UQ
 *
 */
public class LongestSubPalindrome_of_a_String_middle_out {

	public static void main(String[] args) {

		String data = rand(10);
		System.out.println(data);
		int maxLen = 0;
		String ans = "";
		for (int i = 0; i < data.length(); i++) {
			int j1 = i, j2 = i, che = 0;
			int len = -1;
			while (j1 >= 0 && j2 < data.length()) {
				if (data.charAt(j1) != data.charAt(j2)) {
					che = 1;
					break;
				} else{
					len = len + 2; 
				}
				j1--;
				j2++;
			}
//			System.out.println(len);
			if(len > maxLen){
				maxLen = len;
				ans = data.substring(i-len/2, i + len/2 + 1);
			}
//			System.out.println(ans);
				
		}
		
		for (int i = 0; i < data.length(); i++) {
			int j1 = i, j2 = i+1, che = 0;
			int len = 0;
			while (j1 >= 0 && j2 < data.length()) {
				if (data.charAt(j1) != data.charAt(j2)) {
					che = 1;
					break;
				} else{
					len = len + 2; 
				}
				j1--;
				j2++;
			}
//			System.out.println(len);
//			System.out.println(data.substring(i-len/2+1, i+ len/2+1));
			if(len > maxLen){
				maxLen = len;
				ans = data.substring(i-len/2 +1, i + len/2 + 1);
			}
//			System.out.println(ans);
				
		}
		
		System.out.println(ans);

	}

	public static String rand(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append((char) ((Math.random() * 6) + 1 + 96));
		}
		return sb.toString();
	}

}
