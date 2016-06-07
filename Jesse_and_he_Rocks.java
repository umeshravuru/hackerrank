package hack;

import java.util.Scanner;

public class Jesse_and_he_Rocks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t=s.nextInt();
		long n = s.nextLong();
		long [] data = new long [t];
		for(int i=0;i<t;i++)
		{
			data[i]=s.nextLong();
		}
		long ans=0;
		int check=0;
		for(int i=0;i<t;i++)
		{
			if(data[i]>n && check==0)
			{
				check=1;
				ans++;
			}
			else if(data[i]<=n)
			{
				ans++;
			}
			else
				break;
			
		}
		System.out.println(ans);

	}

}
