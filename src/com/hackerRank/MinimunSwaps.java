package com.hackerRank;

import java.util.Arrays;

public class MinimunSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {4 ,3,1,2};
		int arr[] = {1,3,5,2,4,6, 7};
		int res = minimumSwaps(arr);
		System.out.println("total swap:" +res);
	}

	private static int minimumSwaps(int[] arr) {
		// TODO Auto-generated method stub
		
		int min = arr[0];
		int min_index_pos = 0;
		int temp =0;
		int swap =0;
		for(int i = 1; i< arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				min_index_pos= i;
			}
		}
		System.out.println("min: " +min);
		System.out.println("index_pos:" +min_index_pos);
		
		
		if(min_index_pos !=0 ) {
			temp = arr[0];
			arr[0] = arr[min_index_pos];
			arr[min_index_pos] = temp;
			swap++;
		}
		System.out.println("Arr:" +Arrays.toString(arr));
		for(int i = 0; i < arr.length-1; i++) {
			if( (arr[i] +1) != arr[i+1]) {
				int val = arr[i] + 1;
				for(int j = i+1; j< arr.length; j++ ) {
					if( arr[j] == val) {
						temp = arr[j];
						arr[j] = arr[i +1];
						arr[i+1] = temp;
						swap++;
						break;
					}else {
						continue;
					}
				}
				
			}
			else {
				continue;
			}
		}
		System.out.println("Arr:" +Arrays.toString(arr));
		return swap;
	}

}
