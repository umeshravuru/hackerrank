package hack;

public class ncr_mod
{

	public static void main(String[] args)
	{
		
		System.out.println(nCr(27,13));
		
	}

 public static long nCr ( int n, int r ) {
	  if( n == r || r == 0 ) 
		    return 1;
		  return nCr( n-1, r-1 ) + nCr( n-1, r );
		}

}
