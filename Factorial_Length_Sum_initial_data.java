package hack;

public class Factorial_Length_Sum_initial_data {

	public static void main(String[] args) {
		long n=(long) Math.pow(10, 6);
		
		long [] data = new long [(int) (n+1)];
		data[0]=0;
		data[1]=0;
		for(int i=2;i<=n;i++)
		{
//			System.out.println(i);
			data[i]=data[i-1];
			long tem=i;
			while(tem%2==0)
			{
				tem=tem/2;
				data[i]++;
			}
			
			
			for(int j=2;j<=Math.sqrt(i)+1;j++)
			{
				if(tem%j==0)
				{
					data[i]=data[i]+1;
					tem=tem/j;
					//break;
				}
			}
			
			
		}
		
		for(int i=0;i<=100;i++)
		{
			System.out.println(data[i]);
		}
		

	}

}
