package com;


public class Table {

	public static void main(String[] args) throws Exception {
		String line = "507302";
		int selfDescNum = 0;
		for(int i=0;i<line.length();i++){
			int value = Character.getNumericValue(line.charAt(i));
			int digitToMatch = i;
			int count = 0;
			for(int j=0;j<line.length();j++){
				if(digitToMatch == Character.getNumericValue(line.charAt(j))){
					count++; 
				}
			}
			if(count != value){
				selfDescNum = 0;
				break;
			}else{
				selfDescNum = 1;
			}
		}
		System.out.println(selfDescNum);
	}

}
