package Code_chef;

import java.util.ArrayList;

public class Bytelandian_gold_coins_1
{

	public static void main(String[] args)
	{
//		int data []= new int [1000000000];
		ArrayList<Integer> data = new ArrayList<>();
//		data[0]=0;
//		data[1]=1;
//		data[2]=2;
//		data[3]=3;
//		data[4]=4;
		data.add(0);
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		for(int i =5;i<1000000000;i++)
		{
			int tem = data.get(i/2)+ data.get(i/3)+data.get(i/4);
			
			data.add(Math.max(i, tem));
			
//			System.out.println(i+" "+data.get(i));
			System.out.println(i);
				
		}
		
		System.out.println("sldjk"); 
		
		
	}

}
