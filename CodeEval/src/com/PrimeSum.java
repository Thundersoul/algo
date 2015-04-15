package com;

public class PrimeSum {

	public static void main(String[] args) {
		long total = 0L;
		int countPrime = 0;
		int i=1;
		while(countPrime<=1000){
			if (isPrime(i)){
				total = total + i;
				countPrime++;
			}
			i++;
		}
		System.out.println(total-1);
	}
	
	public static boolean isPrime(int n){
		
		for(int i=2;i<n;i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}

}
