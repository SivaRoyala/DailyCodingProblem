package com.siva.practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Apr 7, 2022
 * This problem was recently asked by Google. 
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */
public class ProblemSumOfNumber {

	public static void main(String[] args) {
		// [10, 15, 3, 7] k 17
		
		int[] input = {10, 15, 3, 7};
		System.out.println(isSumEqualtoGivenNum1(input, 17));
		

	}
	
	public static boolean isSumEqualtoGivenNum(int[] array, int k) {
		boolean flag = false;
		for(int i=0; i< array.length; i++) {
			for(int j=i+1; j< array.length; j++) {
				if(array[i]+array[j] == k) {
					flag =  true;
					break;
				}
			}
		}
		
		return flag;
	}
	
	
	public static boolean isSumEqualtoGivenNum1(int[] array, int k) {
		
		int left = 0;
		int right = array.length-1;
		Arrays.sort(array);
		
		while(left < right) {
			if(array[left]+array[right] == k) {
				return true;
			}else if(array[left]+array[right] < k) {
				left++;
			}else {
				right--;
			}
		}	
		return false;
	}
	
	
	public static boolean isSumEqualtoGivenNum2(int[] array, int k) {
		
		Set<Integer> set = new HashSet<>();		
		for(int i=0; i< array.length; i++) {
			int temp = k - array[i];
			if(set.contains(temp)) {
				return true;
			}else {
				set.add(array[i]);
			}
		}
	return false;
	}
	
}
