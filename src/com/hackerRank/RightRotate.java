package com.hackerRank;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int d = 2;
		int len = arr.length;
		
		int temp = arr[len-1];
		for(int i = (len-1); i>0 ; i--) {
			arr[i] = arr[i-1];
			arr[i-1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
//		int[] temp = new int[d];
//		for(int i =0 ; i <d ;i++) {
//			temp[i] = arr[i + len -d];
//		}
//		System.out.println(Arrays.toString(temp));
//
//		for(int i = (len-1); i > 0; i--) {
//			arr[i] = arr[i-d];
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i = 0 ;i <d ; i++) {
//			arr[i]=temp[i];
//		}
//		System.out.println(Arrays.toString(arr));
		
		 
	}

}
