package string;

public class EqualsExample2 {
	public static void main(String[] args) {
		String s1 = "momen";
		String s2 = "Momen";
		String s3 = "momen";
		String s4 = "momen saifi";

		System.out.println(s1.equals(s3)); // True because content is same

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));

	}
}