package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Matching_Datasets
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =Integer.parseInt(s.nextLine());
		ArrayList<ArrayList<Double>> data1 = new ArrayList<ArrayList<Double>>();
		ArrayList<ArrayList<Double>> data2 = new ArrayList<ArrayList<Double>>(); 
		for(int i =0;i<t;i++)
		{
			String tem = s.nextLine();
			ArrayList<Double> temp = new ArrayList<Double>();
			for(int j =0;j<tem.split(",").length;j++)
			{
				temp.add(Double.parseDouble(tem.split(",")[j]));
			}
			data1.add(temp);
		}
		for(int i =0;i<t;i++)
		{
			String tem = s.nextLine();
			ArrayList<Double> temp = new ArrayList<Double>();
			for(int j =0;j<tem.split(",").length;j++)
			{
				temp.add(Double.parseDouble(tem.split(",")[j]));
			}
			data2.add(temp);
		}
		int [] check = new int [data1.size()];
		for(int i =0;i<t;i++)
		{
			Double min = (double) 1000000000;
			int inde=0;
			for(int j=0;j<data2.size();j++)
			{
				
				Double temm = (double) 0;
				if(check[j]!=1)
				{
				for(int k=0;k<data1.get(0).size();k++)
				{
					
					temm=temm+Math.abs(data1.get(i).get(k)-data2.get(j).get(k));
				}
				
				if(temm<min)
				{
					min=temm;
					inde = j;
				}
				}
				
			}
			
//			data2.remove(inde);
			check[inde]=1;
			System.out.println(i+" "+inde);
		}
		
		
		
	}

}
