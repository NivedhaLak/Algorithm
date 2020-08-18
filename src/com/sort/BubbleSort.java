package com.sort;

import java.util.Arrays;

public class BubbleSort {
/**
 * create a O(1) spaceComplexity
 * O(n^2) - time complexity
 * @param args
 */
	public static void main(String[] args) {
		
		int[] arr= {1,1,1,1,1,1,9,0,4,7,-19,99,2,1,22000,4,-100};
		int n= arr.length,temp;
		while(n>0) {
			for(int i=0;i<n-1;i++) {
				if(arr[i]> arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp; 
				}
			}
			n--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
