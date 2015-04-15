package com.hr;

import java.math.BigInteger;
import java.util.Scanner;

public class ConnectingTowns {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int i=0;i<t;i++){
	            int numOfNodes = in.nextInt();
	            BigInteger mulValue = new BigInteger("1");
	            for(int j = 0;j<numOfNodes-1;j++){
	                mulValue = mulValue.multiply(new BigInteger(in.next()));
	            }
	            System.out.println(mulValue);
	        }
	        in.close();
	    }
}
