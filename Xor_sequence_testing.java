package hack;

public class Xor_sequence_testing
{

	public static void main(String[] args)
	{
		int n =100;
		
		int [] data = new int [n];
		data[0]=0;
		System.out.println("0-"+data[0]+" ");
		for(int i =1;i<n;i++)
		{
			data[i]=data[i-1]^i;
			System.out.println(i+"-"+data[i]+" ");
		}
		System.out.println(601^1^2^602);

	}

}
