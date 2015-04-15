package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fibbonicci {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if(line.equals("")){
				continue;
			}
			String arr[] = line.split(";");
			String str1 = arr[0];
			String str2 = arr[1];
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < str1.length(); i++) {
				String oldseq = new String();
				String subseq = new String();
				int index = 0;
				for (int j = i; j < str1.length(); j++) {
					for (int k = index; k < str2.length(); k++) {
						if(str1.charAt(j) == str2.charAt(k)){
							subseq = subseq+str1.charAt(j);
							index = k+1;
							break;
						}
					}
				}
				list.add(subseq);
			}
			String finalString ="";
			for(String s : list){
				if(finalString.length()< s.length()){
					finalString = s;
				}
			}
			System.out.print(finalString);
		}
	}

}
