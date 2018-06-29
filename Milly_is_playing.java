package coding;

import java.util.Scanner;

public class Milly_is_playing {

	public static void main(String[] args) {
			
	Scanner s = new Scanner(System.in);
	int t = s.nextInt();
	for(int ii =0;ii<t;ii++){
		int n = s.nextInt();
		int data[] = new int [n];
		int required [] = new int[n];
		for(int i =0;i<n;i++){
			data[i] = s.nextInt();
			if(data[i] > 0)
				data[i] = 1;
			else
				data[i] = -1;
			
			if(i == 0)
				required[i] = -1;
			else
				required[i] = 1;
		}
		int ans  = data.length;
		int now = test(data, required);
		ans  = Math.min(ans, now);
		
		for(int i=1;i<data.length;i++){
			required[i] = -1;
			if(data[i] == -1){
				now--;
			}
			else
				now++;
			ans = Math.min(ans, now);
			
				
		}
//		for(int i=1;i<data.length;i++){
//			int now = test(data, required);
//			if(now <ans)
//			{
//				ans = now;
//				if(ans == 0)
//					break;
//			}
//			required[i] = -1;
//			
//		}
//		disp(required);
		
		System.out.println(ans);
		
		
		
		
	}
		
	}
	
//	public static int first(int a[]){
//		
//	}
	
	public static int test(int a[] , int b[]){
		int ans = 0;
		for(int i =0;i<a.length;i++){
			if(a[i] != b[i])
				ans ++;
		}
		return ans;
	}
	
	public static void disp(int data[]){
		for(int i =0;i<data.length;i++){
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
