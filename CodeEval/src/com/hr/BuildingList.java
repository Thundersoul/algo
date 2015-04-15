package com.hr;

//import java.util.Scanner;

public class BuildingList {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		//System.out.println(in.next());
		//in.close();
		String str = "abc";
		
		for(int i=0;i<str.length();i++){
			int currentIndex = 1;
			String s = ((Character)str.charAt(i)).toString();
			while(currentIndex <= str.length()-1){
				
				for(int j =currentIndex;j<=str.length();j++){
					System.out.println();
				}
				System.out.println(s);
				currentIndex++;
			}
			
		}
		
	}
}
