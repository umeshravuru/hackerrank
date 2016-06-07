package hack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LCPsolnFroDistinctSubString
{

	public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter Desired String ");
	    String string = br.readLine();
	    int length = string.length();
	    String[] arrayString = new String[length];
	    for (int i = 0; i < length; ++i) {
	      arrayString[i] = string.substring(length - 1 - i, length);
	    }

	    Arrays.sort(arrayString);
	    for (int i = 0; i < length; ++i)
	      System.out.println(arrayString[i]);

	    long num_substring = arrayString[0].length();

	    for (int i = 0; i < length - 1; ++i) {
	      int j = 0;
	      for (; j < arrayString[i].length(); ++j) {
	        if (!((arrayString[i].substring(0, j + 1)).equals((arrayString)[i + 1]
	            .substring(0, j + 1)))) {
	          break;
	        }
	      }
	      num_substring += arrayString[i + 1].length() - j;
	    }
	    System.out.println("unique substrings = " + num_substring);
	  }

	}
