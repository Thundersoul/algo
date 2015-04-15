package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReverserWords {

	public static void main(String[] args) throws Exception{

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(reverse(line.split(" ")));
        }
	}

	public static String reverse(String[] arr) {
		String s = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i == 0) {
				s = s + arr[i];
			} else {
				s = s + arr[i] + " ";
			}

		}
		return s;
	}

}
