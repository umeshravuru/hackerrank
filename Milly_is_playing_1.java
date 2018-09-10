package coding;

//import java.util.ç;
import java.util.Scanner;

public class Milly_is_playing_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii =0;ii<t;ii++){
			int n = s.nextInt();
			int data[] = new int [n];
			int ans = 0;
			for(int i =0;i<n;i++){
				data[i] = s.nextInt();
			}		
			if(data[0] >=0)
				ans++;
			if(data[data.length-1] <=0)
				ans++;
			int first = 0;
			int last = 0;
			for(int i=1;i<data.length;i++){
				if(data[i] >=0){
					first = i;
					break;
				}
			}
			for(int i=data.length-2;i>0;i--){
				if(data[i] <=0){
					last = i;
					break;
				}
			}
			 
			System.out.println(first);
			System.out.println(last);
			
			
			
				
	}

	}
}
