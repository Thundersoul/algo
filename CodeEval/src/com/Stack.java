package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Stack {

	private int stackArray[];
	private int top = -1;
	
	public static void main(String[] args) throws IOException{
		File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	line = line.trim();
        	
        	String[] arr = line.split(" ");
        	Stack stack = new Stack();
        	stack.stackArray = new int[arr.length];
        	for(int i=0;i<arr.length;i++){
        		stack.push(Integer.parseInt(arr[i]));
        	}
        	boolean skip = false;
        	String s="";
        	while(stack.isEmpty() == false){
        		if(skip == false){
        			s = s+stack.pop()+" ";
        			skip = true;
        		}else{
        			stack.pop();
        			skip = false;
        		}
        	}
        	System.out.println(s.trim());
        	
        }

	}
	public  void push(int val){
		stackArray[++top] = val;
	}
	public int pop(){
		return stackArray[top--];
	}
	public boolean isEmpty(){
		return (top == -1);
	}

}
