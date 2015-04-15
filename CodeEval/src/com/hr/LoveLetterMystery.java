package com.hr;

import java.util.Scanner;

public class LoveLetterMystery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
			StringBuffer s = new StringBuffer(in.next());
		}
	}
	
	public static int calculateMoves(StringBuffer str){
		for(int i =0 ;i<str.length();i++){
			
			if(str.charAt(i) == str.charAt(str.length() -1 -i) ){
				continue;
			}
			if(str.charAt(i) > str.charAt(str.length() -1 -i) ){
				while(str.charAt(i) != str.charAt(str.length() -1 -i)){
				
				}
			}else{
				
			}
		}
		return 0;
	}
	
	

}
