package Array;

public class ArrayExample10 {

	public static void countFreq(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		int newArr[] = new int[max + 1];

		for (int i = 0; i < arr.length; i++) {
			newArr[arr[i]]++;
		}

		for (int i = 0; i < newArr.length; i++) {
			if (newArr[i] > 0)
				System.out.println(i + " " + newArr[i]);
		}

	}

	public static void main(String args[]) {

		int intArr[] = { 10, 15, 20, 15, 8, 10, 25, 25, 70, 86, 40 };
		countFreq(intArr);

	}

}
