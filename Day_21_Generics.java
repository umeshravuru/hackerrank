package hack;

import java.lang.reflect.Method;

class Printer
{
   public static < E > void printArray( E[] inputArray )
   {
	      // Display array elements              
	         for ( E element : inputArray ){        
	            System.out.printf( "%s ", element );
	         }
	         System.out.println();
	    }
 
}



public class Day_21_Generics {

	 public static void main( String args[] )
	    {
	        Printer myPrinter=new Printer();
	        Integer[] intArray = { 1, 2, 3 };
	        String[] stringArray = {"Hello","World"};
	        myPrinter.printArray( intArray  );
	        myPrinter.printArray( stringArray );
	        int count=0;
			for (Method method : Printer.class.getDeclaredMethods()) {
	            String name = method.getName();
	            if(name.equals("printArray"))
	              count++;
	        }
	        
	        if(count>1)System.out.println("Method overloading is not allowed!");
	        assert count==1;

	    } 

}
