package string;

public class CharAtExample {
	
	public static char charAtExample(int index) {
		String s="My name is momen";
		char c=s.charAt(index);
		
		return c;
		
	}
	public static void main(String args[]) {
		System.out.println("First charactar"+CharAtExample.charAtExample(0));
		
	}


}


