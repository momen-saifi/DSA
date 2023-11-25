package string;

public class StringGetCharsExample {
	public static void main(String args[]) {
		String str = new String("hello manoj howare you");
		char[] ch = new char[10];
		try {
			str.getChars(6, 16, ch, 0);
			System.out.println(ch);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}
}