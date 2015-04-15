package com.hr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NonRepeatedCharacter {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			List<Character> duplicates = new ArrayList<Character>();
			for (int i = 0; i < line.length(); i++) {
				boolean duplicate = false;
				for (int j = i + 1; j < line.length(); j++) {
					if (line.charAt(i) == line.charAt(j)) {
						duplicates.add(line.charAt(i));
						duplicate = true;
						break;
					}
				}
				if (!duplicates.contains(line.charAt(i)) && duplicate == false) {
					System.out.println(line.charAt(i));
					break;
				}
			}
		}
	}

}
