import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Minimize_Digitsum {

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new FileReader("/Users/UXR08UQ/Desktop/testData.txt"));
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for (int ii = 0; ii < n; ii++) {
      String now [] = br.readLine().split(" ");
      Long a = Long.parseLong(now[0]);
      Long b = Long.parseLong(now[1]);
    }


  }
}
