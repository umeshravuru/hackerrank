package coding;

import java.util.Scanner;

public class weight_equal_to_K {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for(int ii =0;ii<t;ii++){
			int k = Integer.parseInt(s.nextLine());
			String data1 = s.nextLine();
			int []data = new int [data1.length()];
			for(int i =0;i<data1.length();i++){
				data[i] = (int)data1.charAt(i)-96;
			}
//			disp(data);
			int ans = 0;
//			for(int i =0;i<data.length;i++){
//				for(int j =i;j<data.length;j++){
//					int sum = summer(data,i,j);
//					System.out.println(data1.substring(i,j+1)+" "+sum);
//					
//					if(sum == k)
//						ans++;
//				}
//			}
			for(int i =0;i<data.length;i++){
				int now = data[i];
				if(now == k)
					ans++;
				for(int j =i+1;j<data.length;j++){
//					System.out.println(data1.substring(i,j+1));
					now = now + data[j];
//					System.out.println(now);
					if(now ==k)
						ans++;
				}
			}
			
				
			System.out.println(ans);
//			System.out.println("asfda" +" "+ans);
		}
		
		
	}
	
	public static int summer(int[]data,int i,int j){
		int sum = 0;
		for(int ii=i;ii<=j;ii++ ){
			sum = sum + data[ii];
		}
		return sum;
	}
	public static void disp(int [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}


}
