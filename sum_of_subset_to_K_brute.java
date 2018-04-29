import java.util.ArrayList;
import java.util.Scanner;

public class sum_of_subset_to_K_brute {

    public  static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int data[] = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = s.nextInt();
        }
        int k = s.nextInt();

        isPossible(data);
//        System.out.println(isPossible(data));
    }


    public static String isPossible(int data[]){
        disp(data);
        char [] ans = new char[data.length];
        for(int i =0;i<ans.length;i++){
            ans[i] = 'B';
        }
        int total_sum = 0;
        for(int i =0;i<data.length;i++){
            total_sum = total_sum + data[i];
        }
        int temSum = 0;

        if(total_sum%3 != 0)
            return "IMPOSSIBLE";

        temSum = total_sum/3;

        for(int i=0;i<Math.pow(2,data.length);i++){

//            System.out.println(makeFull(Integer.toBinaryString(i),data.length));
            String now = makeFull(Integer.toBinaryString(i),data.length);
            int temSUm = 0;
            for(int j =0;j<now.length();j++){
                if(now.charAt(j)=='1')
                    temSUm = temSUm + data[j];
            }
            if(temSUm == temSum){
                for(int j =0;j<now.length();j++){
                    if(now.charAt(j) == 1)
                        ans[j] = 'R';
                }
                System.out.println(now);
                ArrayList<Integer> remDig = new ArrayList();
                ArrayList<Integer> remDigMapper = new ArrayList();
                for(int j =0;j<now.length();j++){
                    if(now.charAt(j)=='0') {
                        remDig.add(data[j]);
                        remDigMapper.add(j);
                    }
                }

                System.out.println(remDig);
                for(int k=0;k<Math.pow(2,remDig.size());k++){

                    String restNow = makeFull(Integer.toBinaryString(k),remDig.size());
                    System.out.println(restNow);
                    int temSUm1 = 0;
                    for(int j =0;j<restNow.length();j++){
                        if(restNow.charAt(j)=='1')
                            temSUm1 = temSUm1 + remDig.get(j);
                    }
                    if(temSUm1==temSUm)
                    {
                        System.out.println(restNow);
                        for(int j =0;j<now.length();j++){
                            if(now.charAt(j) == '1')
                                ans[j] = 'R';
                        }

                        for(int j= 0;j<restNow.length();j++ ){
                            if(restNow.charAt(j) == '1')
                                ans[remDigMapper.get(j)] = 'G';
                        }


                        System.out.println(new String(ans));
                        return ans.toString();

                    }

                }


            }



        }

        return  ans.toString();

    }
    public static String makeFull(String now,int n){
        int nowL = now.length();
        for(int i =0;i<n-nowL;i++){
            now = "0"+now;
        }
        return now;
    }

//    public static String char_to_String(int[]data){
//
//    }
    public static void disp(int[]data){
        for(int i =0;i< data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

}
