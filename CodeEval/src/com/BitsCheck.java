package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BitsCheck {

	public static void main(String[] args) throws Exception {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String arr[] = line.split(",");
			Integer num = Integer.parseInt(arr[0]);
			int firstBitIndex = Integer.parseInt(arr[1]);
			int secondBitIndex = Integer.parseInt(arr[2]);
			String binaryNumber = Integer.toBinaryString(num);
			binaryNumber = (new StringBuffer(binaryNumber)).reverse()
					.toString();
			if (binaryNumber.charAt(firstBitIndex - 1) == binaryNumber
					.charAt(secondBitIndex - 1)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}

}
