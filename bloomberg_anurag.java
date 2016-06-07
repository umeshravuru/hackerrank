package hack;

public class bloomberg_anurag
{

	public static void main(String[] args)
	{
		
		
		System.out.println(reverse(12345));
		
		
		
		
	}

	
	public static int reverse(int data)
	{
		int ans =0;
		
		while(data!=0)
		{
			ans=ans*10+data%10;
			data=data/10;
			
		}
		
		return ans;
		
		
	}
	
	
}
