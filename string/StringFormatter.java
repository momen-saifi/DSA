package string;

public class StringFormatter {
	public static String reverseString(String s) {
		
		StringBuilder sb=new StringBuilder(s);
		
		sb.reverse();
		return sb.toString();
	}
	
	public static void main(String args[]) {
		String s="My name is momen";
		System.out.println(StringFormatter.reverseString(s));
	}

}
