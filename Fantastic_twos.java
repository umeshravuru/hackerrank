import java.util.Scanner;

public class Fantastic_twos {
    public  static void main(String[] args){

        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long base [] = new long[57];
        for(int i =0;i<base.length;i++){
            base[i] = (long)Math.pow(2,i);
//            System.out.println(base[i]);
        }
        long ans =0;
        for(long i =0;i<n;i++){
            long data = s.nextLong();
            int che = 0;
            for(int j =0;j<base.length;j++){
                for(int k =0;k<base.length;k++){
                    if(base[j]+base[k] == data) {
                        ans++;
                        che = 1;
                        break;
                    }
                }
                if(che==1)
                    break;
            }

//            if(che ==1)
//                ans++;

        }

        System.out.println(ans);
    }
}
