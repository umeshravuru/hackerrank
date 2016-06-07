package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int [] data = new int [t];
		 ArrayList<Integer> arrlist=new ArrayList<Integer>();
		for(int i =0;i<t;i++)
		{
//			data[i]=s.nextInt();
			arrlist.add(s.nextInt());
					
		}
		
		
		
	}
	
	
	public static int[] mergeSort(int [] list) {
        if (list.length <= 1) {
            return list;
        }
        
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
        
        // Sort each half
        mergeSort(first);
        mergeSort(second);
        
        // Merge the halves together, overwriting the original array
        merge(first, second, list);
        return list;
    }
	
	
	
	
	private static void merge(int[] first, int[] second, int [] result) {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
                } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }

}
