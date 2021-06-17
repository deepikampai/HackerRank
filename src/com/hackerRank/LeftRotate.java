package com.hackerRank;

import java.util.Arrays;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int d = 4;
		int len = arr.length;
		
//		int temp = arr[0];
//		for(int i = 1 ; i< len ; i++) {
//			arr[i-1] = arr[i];
//			arr[i] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		int[] temp = new int[d];
		for(int i =0 ; i <d ;i++) {
			temp[i] = arr[i];
		}
		System.out.println(Arrays.toString(temp));
		
		for(int i = 0;i < (len -d); i++) {
			arr[i] = arr[i+d];
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0;i < d; i++) {
			arr[i + len -d] = temp[i];
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
