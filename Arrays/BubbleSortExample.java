package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortExample {

	BubbleSortExample(int arr[], int size) {
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");

		int size = sc.nextInt();
		int array[] = new int[size];

		System.out.println("Enter array element");

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("array befour sorting: " + Arrays.toString(array));

		new BubbleSortExample(array, size);

		System.out.println("array after sorting: " + Arrays.toString(array));
	}

}
