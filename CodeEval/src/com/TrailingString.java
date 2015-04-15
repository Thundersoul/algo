package com;

public class TrailingString {

	public static void main(String[] args) {
		String line = "hello world,world";
		String arr[] = line.split(",");
		arr[0] = arr[0].trim();
		arr[1] = arr[1].trim();
		if (arr[0].length() < arr[1].length()) {
			System.out.println(0);
		} else {
			String tocompare = arr[0].substring(
			arr[0].length() - arr[1].length(), arr[0].length());
			if (tocompare.equals(arr[1])) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}

}
