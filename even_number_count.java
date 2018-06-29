package coding;

import java.util.logging.Logger;

public class even_number_count {

	public static void main(String[] args) {
		
		int x [] = {-1,-2,-43};
		System.out.println(tot_of_positive_nums(x));
	}
	
	public static int tot_of_positive_nums (int[] x)
	{
		int tot = 0;
		for(int i =0;i < x.length; i++){
			if(x[i] >= 0)
			{
				tot++;
			}
		}
		return tot;
	}

}
