import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Bad_Shuffle_1 {

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new FileReader("/Users/UXR08UQ/Desktop/testData.txt"));
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    Map<String, Integer> mapper = new HashMap<>();

    for (int ii = 0; ii < Math.pow(10, 2); ii++) {
      int data[] = new int[n];
      for (int i = 0; i < n; i++) {
        data[i] = i + 1;
      }
      for (int i = 0; i < n; i++) {
        int j = (int) (Math.random() * n);
        System.out.print(j+" ");
        int tem = data[i];
        data[i] = data[j];
        data[j] = tem;
      }
      String now = toString(data);
//      System.out.println(now);
      if (!mapper.containsKey(now)) {
        mapper.put(now, 1);
      } else {
        mapper.put(now, mapper.get(now) + 1);
      }
//      disp(data);
    }

    int freq[] = new int[mapper.size()];
    int index = 0;
    int max = 0;
    for (String key : mapper.keySet()) {
      freq[index] = mapper.get(key);
      index++;
      if(mapper.get(key)> max){
        max = mapper.get(key);
      }
    }
    System.out.println(max);

    final int maxx = max;

    mapper.entrySet().stream().forEach(x ->{
      if(x.getValue() == maxx){
        System.out.println(x.getKey());
      }
    });

//    disp(freq);
//    sort(freq, 0, freq.length - 1);




//    System.out.println(mapper);

  }

  static void disp(int[] data) {
    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println("");
  }

  private static String toString(int[] data) {
    StringBuilder sb = new StringBuilder();
    for (int k : data) {
      sb.append(k);
      sb.append(" ");
    }
    return sb.toString().trim();

  }

  ////////////////////////////////////////////////////////////////////////////////

  static int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = (low - 1); // index of smaller element
    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }

  static void sort(int arr[], int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      sort(arr, low, pi - 1);
      sort(arr, pi + 1, high);
    }
  }

  ////////////////////////////////////////////////////////////////////////////////
}
