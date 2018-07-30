package coding;

import java.util.Scanner;

public class Perpendicular_Lines {

	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii =0;ii<t;ii++){
			long x1 = s.nextLong();
			long y1 = s.nextLong();
			
			long x2 = s.nextLong();
			long y2 = s.nextLong();
			
			long x3 = s.nextLong();
			long y3 = s.nextLong();
			
			long x4 = s.nextLong();
			long y4 = s.nextLong();
			
			long diffY = y1 - y2;
			long diffX = x1 - x2;
			
			long diffY1 = y3 - y4;
			long diffX1 = x3 - x4;
			
//			System.out.println(diffY +" "+ diffX );
//			System.out.println(diffY1 +" "+ diffX1 );
			
			if(len(x1,y1,x2,y2) && len(x3,y3,x4,y4)){
			
			if(x1 == x2 && y3 == y4){
				System.out.println("YES");
			}
			else if(x3 == x4 && y1 == y2){
				System.out.println("YES");
			}
			else if(diffX1*diffX == -1*diffY*diffY1){
				System.out.println("YES");
			}
			else
				System.out.println("NO");
			}
			else
				System.out.println("INVALID");
			
		}
		
		
	}
	public static boolean len(Long a,Long b,Long c,Long d){
		if(a == c && b == d)
			return false;
		else
			return true;
	}

}
