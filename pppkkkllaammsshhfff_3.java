package hack;

public class pppkkkllaammsshhfff_3
{

	public static void main(String[] args)
	{
		
		for(long i =0;i<Math.pow(10, 8);i++)
		{
			System.out.println(same_length(i));
		}
			
	}
	
	public static String same_length(long data)
	{
		String tem = String.valueOf(data);
		for(int i =0;i<8-tem.length()+1;i++)
		{
			tem = "0"+tem;
					
		}
		
	return tem;
			
	}	

}
