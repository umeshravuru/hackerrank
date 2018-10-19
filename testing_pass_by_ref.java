public class testing_pass_by_ref {

  public static void main(String args[]){

    int data[] = {10,10,01,01,0};
    disp(data);
    test(data);
    disp(data);

  }


  static void test(int data[]){
    for(int i =0;i<data.length;i++){
      data[i] = 0;
    }
  }

  static void disp(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }


}
