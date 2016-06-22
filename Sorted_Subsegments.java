package hack;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted_Subsegments
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n 	 =  s.nextInt();
		int q = s.nextInt();
		int k = s.nextInt();
		int data [] =new int [n];
		for(int i =0;i<n;i++)
		{
			data[i]=s.nextInt();
		}
		for(int i =0;i<q;i++)
		{
			int x = s.nextInt();
			int y = s.nextInt();
			int tem1[] = Arrays.copyOfRange(data, x, y+1);
//			System.out.println(tem.length);
			tem1 = mergeSort(tem1)
;			int ii=0;
			int tem0[] = Arrays.copyOfRange(data, 0, x);
			int tem2[] = Arrays.copyOfRange(data, y+1, data.length);
			int[] r = new int[tem0.length + tem1.length+tem2.length];
	        System.arraycopy(tem0, 0, data, 0, tem0.length);
	        System.arraycopy(tem1, 0, data, tem0.length, tem1.length);
	        System.arraycopy(tem2, 0, data, tem1.length, tem2.length);
				
		}
		
		System.out.println(data[k]);
				
		
		
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
