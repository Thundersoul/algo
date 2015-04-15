package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DuplicateElement {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if(line.length()<= 55){
				System.out.println(line);
			}else{

				String s = line.substring(0,40);
				s = s.trim();
				if(line.charAt(40)!=' '){
					s= s.substring(0,s.lastIndexOf(' '));
				}
				System.out.println(s.trim()+"... <Read More>");
			}
			
			
		}
	}

}
