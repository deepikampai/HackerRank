package com.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num = {1,44,56,7,3,4};
		List<Integer> arr = Arrays.asList(num);
		int k = 4;
		String result = findNumber(arr,k);
		System.out.println(result);
	}
	public static String findNumber(List<Integer> arr, int k) {
	    // Write your code here
	    // String result;
	    System.out.println(arr);
	    String s = "0";
	    if(arr.size() == 0) {
	    	return "";
	    }else {
	    for(int i = 0; i< arr.size() ;i++){
	       
	        if(arr.get(i)==k){
//	           return "YES";
	        	s = "YES";
	        	break;
	        }else{
//	             return "NO";
	        	s = "NO";
	        }
	    }
	   
	    return s;
	    }
	}
}
