package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class classy
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		int  t =Integer.parseInt(s.nextLine());
		for(int i =0;i<t;i++)
		{
			int  n =Integer.parseInt(s.nextLine());
			ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
			for(int j =0;j<n;j++)
			{
				ArrayList<String> temp = new ArrayList<String>();
				String ss= s.nextLine();
				String [] sss = ss.split(" ");
				String class_string ="";
				String [] class_array = sss[1].split("-");
				for(int k =0;k<class_array.length;k++)
				{
					if(class_array[k].equals("upper"))
						class_string=class_string+"3";
					else if(class_array[k].equals("middle"))
						class_string=class_string+"2";
					else if(class_array[k].equals("lower"))
						class_string=class_string+"1";
						
				}
				int che=0;
				for(int k=0;k<data.size();k++)
				{
					if(data.get(k).get(0).equals(class_string))
					{
						data.get(k).add(sss[0].substring(0, sss[0].length()-1));
						che=1;
						break;
					}
				}
				if(che==0)
				{
					temp.add(class_string);
					temp.add(sss[0].substring(0, sss[0].length()-1));
					data.add(temp);
				}
				
			}
			int max=0;
			for(int j =0;j<data.size();j++)
			{
				if(data.get(j).get(0).length()>max)
					max=data.get(j).get(0).length();
			}
			for(int j =0;j<data.size();j++)
			{
				if(data.get(j).get(0).length()<max)
				{
					long temppp = (long) (Long.parseLong(data.get(j).get(0))*Math.pow(10, max-data.get(j).get(0).length()));
					data.get(j).set(0, String.valueOf(temppp));
				}
			}
			
//			System.out.println(data);
			for(int j =0;j<data.size()-1;j++)
			{
				for(int k=j+1;k<data.size();k++)
				{
					if(Long.parseLong(data.get(j).get(0))<Long.parseLong(data.get(k).get(0)))
					{
						ArrayList<String> temp = data.get(k);
						data.set(k, data.get(j));
						data.set(j, temp);
					}
				}
			}
			
			for(int j=0;j<data.size();j++)
			{
				if(data.get(j).size()==2)
				{
					System.out.println(data.get(j).get(1));
				}
				else
				{
					String [] tem_data = new String[data.get(j).size()-1];
					for(int k=1;k<data.get(j).size();k++)
					{
						tem_data[k-1]=data.get(j).get(k);
					}
					Arrays.sort(tem_data);
					for(int k=1;k<data.get(j).size();k++)
					{
						System.out.println(tem_data[k-1]);
					}

				}

			}
			for(int j=0;j<30;j++)
			{
				System.out.print("=");
			}
			System.out.println();
			
			System.out.println(data);
		}
		
		
		
	}

}
