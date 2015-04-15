package com.hr;

import java.math.BigInteger;
import java.util.Scanner;

public class FibbonicciModified {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		BigInteger first = new BigInteger(in.next());
		BigInteger second = new BigInteger(in.next());
		int term = in.nextInt();
		System.out.println(fibbonicci(first, second, term));
		in.close();
	}
	
	static BigInteger fibbonicci(BigInteger first,BigInteger second,int term){
		BigInteger value = new BigInteger("0");
		
		for(int i =1;i <=term-2;i++){
			BigInteger square = second.pow(2);
			value = square.add(first);
			first = second;
			second = value;
			
		}
		return value;
	}

}
