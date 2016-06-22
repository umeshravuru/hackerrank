package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorted_Subsegments_1
{

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int q = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int [n];
        for(int i =0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        
        ArrayList<Integer> a1 = new ArrayList<>();
        int[] arr1 = new int[q];
        int[] arr2 = new int[q];
        for(int h=0;h<q;h++){
            arr1[h] = s.nextInt();
            arr2[h] = s.nextInt();
        }
        int dd = k;
        int ee = k;
        for(int h=q-1;h>=0;h--){
            if(dd<=arr1[h] && ee>=arr2[h]){
                continue;
            }
            if((arr1[h]<=dd && arr2[h]>=dd) || (arr1[h]<=ee && arr2[h]>=ee)){
                if(arr1[h]<dd){
                    dd = arr1[h];
                }
                if(arr2[h]>ee){
                    ee = arr2[h];
                }
                a1.add(h);
            }
        }
        if(dd==0 && ee == n-1){
            Arrays.sort(arr);
        }
        else{
            for(int h=a1.size()-1;h>=0;h--){
                int ff = a1.get(h);
                Arrays.sort(arr, arr1[ff], arr2[ff]+1);
            }
        }
       System.out.println(arr[k]);
    }
}