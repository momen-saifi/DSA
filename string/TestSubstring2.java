package string;

import java.util.Arrays;

public class TestSubstring2 {

	public static void main(String args[]) {
		String text = new String("Hello, My name is momen");
		/* Splits the sentence by the delimeter passed as an argument */
		String[] sentences = text.split("\\.");
		/*
		 * for (String str : sentences) { System.out.println(str); }
		 */
		System.out.println(Arrays.toString(sentences));
	}
}