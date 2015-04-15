package com.hr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuickestWayUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Integer, Integer> ladders = new HashMap<Integer, Integer>();
		Map<Integer, Integer> snakes = new HashMap<Integer, Integer>();

		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		for (int i = 0; i < t; i++) {
			String[] snakesLadders = in.nextLine().split(",");
			int noOfLadders = Integer.valueOf(snakesLadders[0]);
			int noOfSnakes = Integer.valueOf(snakesLadders[1]);
			String[] laddersValues = in.nextLine().split(" ");
			String[] snakesValues = in.nextLine().split(" ");

			for (String ladderValue : laddersValues) {
				int ladderBottom = Integer.parseInt(ladderValue.split(",")[0]);
				int ladderTop = Integer.parseInt(ladderValue.split(",")[1]);
				ladders.put(ladderBottom, ladderTop);
			}
			for (String snakeValue : snakesValues) {
				int snakeHead = Integer.parseInt(snakeValue.split(",")[0]);
				int snakeTail = Integer.parseInt(snakeValue.split(",")[1]);
				snakes.put(snakeHead, snakeTail);
			}
			/*
			 * ladders.put(32, 62); ladders.put(44, 66); ladders.put(22, 58);
			 * ladders.put(34, 60); ladders.put(2, 90); snakes.put(85, 7);
			 * snakes.put(63, 31); snakes.put(87, 13); snakes.put(75, 11);
			 * snakes.put(89, 33); snakes.put(57, 5); snakes.put(71, 15);
			 * snakes.put(55,25);
			 */
			System.out.println(calculateMoves(snakes, ladders));
		}
		in.close();
	}

	public static int calculateMoves(Map<Integer, Integer> snakes,
			Map<Integer, Integer> ladders) {
		int totalSum = 100;
		int moves = 0;
		int currentSum = 0;

		while (currentSum != totalSum) {
			Map<Integer, Integer> currentLadderMap = new HashMap<Integer, Integer>();
			Map<Integer, Integer> currentSnakesMap = new HashMap<Integer, Integer>();
			for (int i = 1; i <= 6; i++) {
				if (snakes.keySet().contains(currentSum + i)) {
					currentSnakesMap.put(currentSum + i,
							snakes.get(currentSum + i));
				}
				if (ladders.keySet().contains(currentSum + i)) {
					currentLadderMap.put(currentSum + i,
							ladders.get(currentSum + i));
				}

			}

			if (currentLadderMap.size() == 0 && currentSnakesMap.size() == 0) {
				currentSum = currentSum + 6;
				moves = moves + 1;
			}
			
			if(currentLadderMap.size()==0 && (currentSnakesMap.size()>0 && currentSnakesMap.size()<6)){
				int diff = 0;
				for (Integer snakeHead : currentSnakesMap.keySet()) {
					
					if(diff < (snakeHead - currentSum) && diff<6){
						diff = snakeHead - currentSum;
					}
				}
				currentSum = currentSum+diff+1;
				moves = moves + 1;
			}

			if ((currentSnakesMap.size() >= 0 && currentSnakesMap.size() < 6)
					&& currentLadderMap.size() >= 1) {
				if (currentLadderMap.size() == 1) {
					moves = moves + 1;
					currentSum = currentLadderMap.values().iterator().next();
				} else {
					int maxLadder = 0;
					for (Integer ladderSize : currentLadderMap.values()) {
						if (maxLadder < ladderSize) {
							maxLadder = ladderSize;
						}
					}
					currentSum = maxLadder;
					moves = moves + 1;
				}
			}
			if (currentLadderMap.size() == 0 && currentSnakesMap.size() == 6) {
				if (currentLadderMap.size() == 1) {
					moves = moves + 1;
					currentSum = currentLadderMap.get(0);
				} else {
					int minSnake = currentSnakesMap.get(0);
					for (Integer snakeSize : currentSnakesMap.values()) {
						if (minSnake > snakeSize) {
							minSnake = snakeSize;
						}
					}
					currentSum = minSnake;
					moves = moves + 1;
				}
			}
			if (currentSum >= 94) {
				currentSum = 100;
				moves = moves + 1;
			}
		}
		return moves;
	}

}
