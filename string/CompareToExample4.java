package string;

import java.util.*;

class Players {
	
	private String name;

	public Players(String str) {
		name = str;
	}

}

public class CompareToExample4 {

	// main method

	public static void main(String[] args) {

		Players ronaldo = new Players("Ronaldo");
		Players sachin = new Players("Sachin");
		Players messi = new Players("Messi");
		ArrayList<Players> al = new ArrayList<>();

		al.add(ronaldo);
		al.add(sachin);
		al.add(messi);

		for (Players p : al) {
			System.out.println(p);
		}

	}

}