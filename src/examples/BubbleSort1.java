package examples;

public class BubbleSort1 {

	public static void bubSort(int array[]) {
		int i, j, temp;
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < (array.length - i); j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String args[]) {
		int array[] = { 2, 5, 1, 4, 11, 54, 16, 89, 77 };

		bubSort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
