package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class PrefixExpressonEval {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] arr = line.split(" ");
			Stack<String> stack = new Stack<String>();
			for(int i=arr.length-1;i>=0;i--){
				final String key = arr[i];
				if(key.equals("*")){
					int op1 = Integer.parseInt(stack.pop());
					int op2 = Integer.parseInt(stack.pop());
					Long result = (long)op1*op2;
					stack.push(result.toString());
				}else if(key.equals("/")){
					int op1 = Integer.parseInt(stack.pop());
					int op2 = Integer.parseInt(stack.pop());
					Long result = (long)op1/op2;
					stack.push(result.toString());
				}else if(key.equals("+")){
					int op1 = Integer.parseInt(stack.pop());
					int op2 = Integer.parseInt(stack.pop());
					Long result = (long)op1+op2;
					stack.push(result.toString());
				}else{
					stack.push(arr[i]);
				}
			}
			System.out.println(stack.pop());
		}
	}

}
