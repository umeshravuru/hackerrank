import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bad_Shuffle {

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new FileReader("/Users/UXR08UQ/Desktop/testData.txt"));
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    try {

      int i = 2;
      while (i <= (n / 2)) {
        System.out.print(i+" ");
        i++;
      }
      System.out.print("1 ");
      i = (n / 2) + 2;
      while (i <= n) {
        System.out.print(i+" ");
        i++;
      }
      System.out.print(((n / 2) + 1) + "\n");
      System.out.print(n+" ");
      i = 1;
      while (i < n) {
        System.out.print(i+" ");
        i++;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }


  }
}
