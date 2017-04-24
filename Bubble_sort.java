package practice;

public class Bubble_sort {

	public static void main(String[] args) {

		int data[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println("data before sorting");
		disp(data);
		for (int i = 0; i < data.length; i++) {
			for (int j = 1; j < data.length; j++) {
				if (data[j - 1] > data[j]) {
					int tem = data[j];
					data[j] = data[j - 1];
					data[j - 1] = tem;
				}
			}
		}
		System.out.println("data after before sorting");
		disp(data);

	}

	public static void disp(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("");
	}

}
