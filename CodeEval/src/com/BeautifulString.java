package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeautifulString {

	public static void main(String[] args) {
		String line = "Ignore punctuation, please :)";
		line = line.toLowerCase();
		Map<Character,List<Character>> characterCountMap = new HashMap<Character, List<Character>>();
		for(int i=0; i<line.length();i++){
				if(!Character.isAlphabetic(line.charAt(i))){
					continue;
				}
				if(characterCountMap.containsKey(line.charAt(i))){
					characterCountMap.get(line.charAt(i)).add(line.charAt(i));
				}else{
					List<Character> list = new ArrayList<Character>();
					list.add(line.charAt(i));
					characterCountMap.put(line.charAt(i), list);
				}
		}
		List<Integer> size = new ArrayList<Integer>();
		for(List<Character> ls : characterCountMap.values()){
			size.add(ls.size());
		}
		System.out.println(size);
		Collections.sort(size, Collections.reverseOrder());
		int totalSum = 0;
		int start = 26;
		for(Integer e : size){
			totalSum = totalSum + start*e;
			start-- ;
		}
		
		System.out.println(totalSum);
	}

}
