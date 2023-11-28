package Array;

import java.util.*;

public class ArrayExample3 {
	public static void main(String args[]) {

		int intArr[] = { 10, 20, 15, 25, 40 };

		int key = 15;
		System.out.println("Element is found at index " + Arrays.binarySearch(intArr, 3, 4, key));

	}

}
