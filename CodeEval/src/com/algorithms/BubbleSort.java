/**
 * 
 */
package com.algorithms;

/**
 * @author ACER
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {4,1,3,7,9,2};
		BubbleSort sort = new BubbleSort();
		for(int i : sort.bubbleSort(arr)){
			System.out.println(i);
		}
	}
	
	public int[] bubbleSort(int[] unsortedArr){
		for(int i=0; i < unsortedArr.length; i++){
			
			for(int j=i ; j<unsortedArr.length; j++){
				if (unsortedArr[i] > unsortedArr[j]){
					int temp = unsortedArr[i];
					unsortedArr[i] = unsortedArr[j];
					unsortedArr[j] = temp;
				}
			}
		}
		return unsortedArr;
	}

}
