package string;

public class Stringoperation1 {
	public static void main(String ar[]) {
		// String s = "Momen";
		String s = new String("Momen");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);// Momen(no change in original because string class is final)
	}
}