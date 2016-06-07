package hack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Super_Stack
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =Integer.parseInt(s.nextLine());
		LinkedList<Long> ans = new 	LinkedList<Long>();
//		ArrayList<Long> ans = new ArrayList<Long>();  
		for(int i =0;i<n;i++)
		{
			String ss =s.nextLine();
			String [] data = ss.split(" ");
			if(data[0].equals("pop"))
			{
				ans.removeLast();
				if(ans.size()==0)
					System.out.println("EMPTY");
				else
				{
					System.out.println(ans.getLast());
				}
			}
			if(data[0].equals("push"))
			{
				ans.addLast(Long.parseLong(data[1]));
				System.out.println(ans.getLast());
			}
			if(data[0].equals("inc"))
			{
				for(int j =0;j<Long.parseLong(data[1]);j++)
				{
					ans.set(j, ans.get(j)+Long.parseLong(data[2]));
				}
				System.out.println(ans.getLast());
					
			}
			
		}
		
		
	}

}
