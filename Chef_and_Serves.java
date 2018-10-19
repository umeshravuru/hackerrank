
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;

public class Chef_and_Serves {

  public static void main(String[] args) throws FileNotFoundException, IOException {

//    BufferedReader br = new BufferedReader(new FileReader(
//        "/Users/UXR08UQ/Desktop/testData.txt"));

		 BufferedReader br = new BufferedReader(new
		  InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    for (int ii = 0; ii < t; ii++) {
			String now[] = br.readLine().split(" ");
			int a = Integer.parseInt(now[0]);
      int b = Integer.parseInt(now[1]);
      int c = Integer.parseInt(now[2]);

      int sum = a + b;
      int div  = sum / c;
      if(div % 2 ==0 )
        System.out.println("CHEF");
      else
        System.out.println("COOK");

    }


  }

}
