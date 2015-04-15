package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestLines {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		Map<Integer,String> map = new HashMap<Integer, String>();
		int num = Integer.parseInt(buffer.readLine());
		while ((line = buffer.readLine()) != null) {
			map.put(line.length(), line);

		}
		Set<Integer> set  = map.keySet();
		List<Integer> list = new ArrayList<Integer>(set);
		
		Collections.sort(list);
		
		for(int i =list.size()-1;i>= list.size()-num;i--){
			System.out.println(map.get(list.get(i)));
		}

	}

}
