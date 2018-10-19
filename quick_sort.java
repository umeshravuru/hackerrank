public class quick_sort {

  public static void main(String args[]) {
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n = arr.length;

    sort(arr, 0, n - 1);

    disp(arr);
  }

  ///////////////////////---sort(arr, first_index, last_index)--////////////////////////////////////////

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
  static void disp(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
