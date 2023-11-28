package Array;

import java.util.*;

public class ArrayExample6 {

	ArrayExample6() {
		int matrix[][] = new int[3][3];

		Vector<Integer> v = new Vector<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Sort 2D array across left Diagonal");

		for (int i = 0; i < 3; i++) {
			v.add(matrix[i][i]);
		}
		Collections.sort(v);
		for (int i = 0; i < 3; i++) {
			matrix[i][i] = v.get(i);
		}
		v.removeAll(v);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String args[]) {
		ArrayExample6 m1 = new ArrayExample6();

	}

}
