package string;

public class CompareToExample {
	public int compareTo(String s1, String s2) {
		char value1[] = s1.toCharArray();
		char value2[] = s2.toCharArray();
		int i = 0, j = 0;
		int n = value1.length;
		int m = value2.length;

		while (i < n && j < m) {
			if (value1[i] != value2[j])
				return value1[i] - value2[j];
			i++;
			j++;
		}
		return n - m;

	}

	public static void main(String args[]) {
		CompareToExample obj = new CompareToExample();
		String s1 = "momen";
		String s2 = "momen saifi";
		System.out.print(obj.compareTo(s1, s2));

	}

}
