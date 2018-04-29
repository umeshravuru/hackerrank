import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class sum_of_subset_to_K {
//    private static ArrayList<ArrayList> ans  = new ArrayList<>();
    private static Set set1 = new HashSet();
    private static Set set2 = new HashSet();
    private static Set set3 = new HashSet();
    public  static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int data[] = new int [n];
        for(int i =0;i<n;i++){
            data[i] = s.nextInt();
        }
        int k = s.nextInt();

        System.out.println(isPossible(data,n,k));

    }

    public static boolean   isPossible(int []arr,int N,int K){

//        K = 3;

        int sum = 0;
        for (int i = 0; i < N; i++)
            sum += arr[i];
        if (sum % K != 0)
            return false;

        //  the sum of each subset should be subset (= sum / K)
        int subset = sum / K;
        int subsetSum[] = new int [K];
        boolean taken[] = new boolean[N];

        //  Initialize sum of each subset from 0
        for (int i = 0; i < K; i++)
            subsetSum[i] = 0;

        //  mark all elements as not taken
        for (int i = 0; i < N; i++)
            taken[i] = false;

        // initialize first subsubset sum as last element of
        // array and mark that as taken
        subsetSum[0] = arr[N - 1];
        set1.add(N-1);
        taken[N - 1] = true;

        //  call recursive method to check K-substitution condition
        boolean ansss =  isKPartitionPossibleRec(arr, subsetSum, taken,
                subset, K, N, 0, N - 1);

            System.out.println("--------"+ansss);

        System.out.println("1: "+set1);
        System.out.println("2: "+set2);
        System.out.println("3: "+set3);
        return ansss;


    }

    public static  boolean isKPartitionPossibleRec(int arr[], int subsetSum[], boolean taken[],
                                 int subset, int K, int N, int curIdx, int limitIdx)
    {
        System.out.println("safdsd");
        if (subsetSum[curIdx] == subset)
        {
            if (curIdx == K - 2) {
                System.out.println("1: "+set1);
                System.out.println("2: "+set2);
                System.out.println("3: "+set3);
                disp(subsetSum);
                disp1(taken);
                return true;
            }

            return isKPartitionPossibleRec(arr, subsetSum, taken, subset,
                    K, N, curIdx + 1, N - 1);
        }

        for (int i = limitIdx; i >= 0; i--)
        {
            if (taken[i])
                continue;
            int tmp = subsetSum[curIdx] + arr[i];

            if (tmp <= subset)
            {
                taken[i] = true;
                subsetSum[curIdx] += arr[i];
                if(curIdx==0)
                    set1.add(i);
                else if (curIdx==1)
                    set2.add(i);
                else if(curIdx==2)
                    set3.add(i);
                boolean nxt = isKPartitionPossibleRec(arr, subsetSum, taken,
                        subset, K, N, curIdx, i - 1);

                taken[i] = false;
                subsetSum[curIdx] -= arr[i];
                if(curIdx==0)
                    set1.remove(i);
                else if (curIdx==1)
                    set2.remove(i);
                else if(curIdx==2)
                    set3.remove(i);
                if (nxt) {
//                    System.out.println("1: "+set1);
//                    System.out.println("2: "+set2);
//                    System.out.println("3: "+set3);
//                    disp(subsetSum);
//                    disp1(taken);
                    return true;
                }
            }
        }
        disp(subsetSum);
        System.out.println("1: "+set1);
        System.out.println("2: "+set2);
        System.out.println("3: "+set3);

        return false;
    }
    public static void disp(int[]data){
        for(int i =0;i< data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void disp1(boolean[]data){
        for(int i =0;i< data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
