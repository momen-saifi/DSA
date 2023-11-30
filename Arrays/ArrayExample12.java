package Array;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class ArrayExample12 {

	ArrayExample12() {
		int matrix[][] = new int[4][4];

		Vector<Integer> v = new Vector<Integer>();

		Scanner sc = new Scanner(System.in);

		// Input Matrix
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		// Display Matrix
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
		// Sorting Matrix
		System.out.println("Enter column number:");
		int col = sc.nextInt();
		for (int i = 0; i < 4; i++) {
			v.add(matrix[i][col + 1]);
		}
		Collections.sort(v);
		for (int i = 0; i < 4; i++) {
			matrix[i][col] = v.get(i);
		}
		v.removeAll(v);

		// After Sorting
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}

	}

	public static void main(String args[]) {
		new ArrayExample12();

	}

}
