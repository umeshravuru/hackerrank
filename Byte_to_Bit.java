
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Byte_to_Bit {

  public static void main(String args[]) throws IOException {

//    BufferedReader br = new BufferedReader(new FileReader("/Users/UXR08UQ/Desktop/testData.txt"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    int split[] = {2, 8, 16};

    long ans[][] = new long[1601][3];
    ans[0] = new long[]{0, 0, 1};
    int timenow = 0;
    int timenext = 2;
    int index = 1;
    for (int i = 1; i <= 1600; i++) {
      if (i == timenext) {
        if (ans[i - 1][0] != 0) {
          ans[i][2] = 2 * ans[i - 1][0];
        } else if (ans[i - 1][1] != 0) {
          ans[i][0] = ans[i - 1][1];
        } else {
          ans[i][1] = ans[i - 1][2];
        }
        timenext = timenext + split[index];
        index++;
        if (index == 3) {
          index = 0;
        }
      } else {
        ans[i] = ans[i - 1];
      }

    }

//    disp(ans);

    for (int ii = 0; ii < t; ii++) {
      int n = Integer.parseInt(br.readLine())-1;
      System.out.println(ans[n][2] + " " + ans[n][1] + " " + ans[n][0]);
    }


  }

  private static void disp(long[][] data) {
    int index = 0;
    for (long[] one : data) {
      index++;
      System.out.print(index + " :");
      for (long val : one) {

        System.out.print(val + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

}