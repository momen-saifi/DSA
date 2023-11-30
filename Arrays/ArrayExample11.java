package Array;

import java.util.Arrays;

public class ArrayExample11 {
	public static void commonElement(String arr1[], String arr2[]) {
		int size = (arr1.length > arr2.length) ? arr1.length : arr2.length;
		String arr[] = new String[size];
		for (int i = 0; i < size; i++) {
			if (arr1[i].equals(arr2[i])) {
				arr[i] = arr1[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String args[]) {
		String Array1[] = { "Article", "for", "Geeks", "for", "Geeks" };
		String Array2[] = { "Article", "Geeks", "Geeks" };
		commonElement(Array1, Array2);
	}

}
