package hack;

import java.util.Scanner;

public class Bounding_Robots
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		String data=s.nextLine();
		while(true)
		{
			if(data.equals("0 0"))
			{
				break;
			}
			else
			{
				
				int x = Integer.parseInt(data.split(" ")[0])-1;
				int y = Integer.parseInt(data.split(" ")[1])-1;
				
				int ans_x_org = 0;
				int ans_y_org = 0;
				
				int ans_x_act = 0;
				int ans_y_act = 0;
				int q = Integer.parseInt(s.nextLine());
				
				for(int i =0;i<q;i++)
				{
					String now = s.nextLine();
					int move = Integer.parseInt(now.split(" ")[1]);
					if(now.split(" ")[0].equals("u"))
					{
						if(ans_y_act+move>=y)
						{
							ans_y_act=y;
						}
						else
							ans_y_act=ans_y_act+move;
						
						ans_y_org=ans_y_org+move;
					}
					if(now.split(" ")[0].equals("d"))
					{
						if(ans_y_act-move<=0)
						{
							ans_y_act=0;
						}
						else
							ans_y_act=ans_y_act-move;
						ans_y_org=ans_y_org-move;
					}
					if(now.split(" ")[0].equals("r"))
					{
						if(ans_x_act+move>=x)
						{
							ans_x_act=x;
						}
						else
							ans_x_act=ans_x_act+move;
						ans_x_org=ans_x_org+move;
					}
					if(now.split(" ")[0].equals("l"))
					{
					
						if(ans_x_act-move<=0)
						{
							ans_x_act=0;
						}
						else
							ans_x_act=ans_x_act-move;
						ans_x_org=ans_x_org-move;
					}
				}
				
				System.out.println("Robot thinks "+ans_x_org+" "+ans_y_org);
				System.out.println("Actually at "+ans_x_act+" "+ans_y_act);
				System.out.println("");
			
				
			}
			
			
			data=s.nextLine();
			
		}
		
		
	}

}
