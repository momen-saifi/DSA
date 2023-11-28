package Array;

import java.util.*;

class StudentA {
	public int roll_no;
	public String name;

	StudentA(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}

}

public class ArrayExample1 {
	public static void main(String args[]) {

		StudentA[] arr = new StudentA[5];
		arr[0] = new StudentA(101, "Manoj");
		arr[1] = new StudentA(102, "Umang");
		arr[2] = new StudentA(103, "Momen");
		arr[3] = new StudentA(104, "Pranjul");
		arr[4] = new StudentA(105, "Archit");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at " + i + " : " + arr[i].roll_no + " " + arr[i].name);
		}

	}

}
