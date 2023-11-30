package Array;

import java.util.Arrays;

public class ArrayExample8 {

	static int sumArray(int[] arr, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++)
			sum = sum + arr[i];
		return sum;
	}

	public static void main(String args[]) {

		int intArr[] = { 10, 15, 20, 25, 70, 86, 40 };
		int size = intArr.length;
		System.out.println(sumArray(intArr, size));

	}

}
