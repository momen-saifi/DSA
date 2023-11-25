package string;

public class SplitExample {
	public static void main(String args[]) {
		String s1 = "java_string_split___method_by_javatpoint";
		String[] words = s1.split("_+");// splits the string based on whitespace
		// using java foreach loop to print elements of string array
		for (String w : words) {
			System.out.println(w);
		}String s2="Hello";
		String s3="Hello";
		String s4=s2+s3;
		
		System.out.println(s4);
	}
}