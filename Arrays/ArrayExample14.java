package Array;

import java.util.Scanner;
public class ArrayExample14 {
	public static void main(String args[]) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array element: " + arr[i]);
		}
	}

}