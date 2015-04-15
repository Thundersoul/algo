package com.hr;

import java.util.Set;
import java.util.TreeSet;

public class RemoveCharacters {

	public static void main(String[] args) {

		String line = "A slow yellow fox crawls under the proactive dog";
		line = line.toLowerCase();
		String s = "abcdefghijklmnopqrstuvwxyz";
		String result = "";
		Set<Character> characters = new TreeSet<Character>();
		for (int i = 0; i < line.length(); i++) {
			characters.add(line.charAt(i));
		}
		for (int j = 0; j < s.length(); j++) {
			if (!characters.contains(s.charAt(j))) {
				result = result + s.charAt(j);
			}
		}
		if (result.length() == 0) {
			System.out.println("NULL");
		} else {
			System.out.println(result);
		}
	}

}
