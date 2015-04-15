package com.algorithms;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[]{2,6,9,5,4,1,8,7}; 
		BubbleSort sort = new BubbleSort();
		BinarySearch search = new BinarySearch();
		int sortedArr[] = sort.bubbleSort(arr);
		System.out.println(search.binarySearch(10, sortedArr));
		
	}

	public int binarySearch(int element, int[] sortedArr){
		int loc = -1;
		int beg = 0;
		int end = sortedArr.length-1;
		int mid = Math.abs((beg+end)/2);
		
		while(sortedArr[mid] != element && beg<=end){
			if(sortedArr[mid] > element){
				end = mid-1;
			}else{
				beg = mid+1;
			}
			mid = Math.abs((beg+end)/2);
		}
		if(sortedArr[mid] == element){
			loc = mid;
		}
		return loc;
		
	}
}
