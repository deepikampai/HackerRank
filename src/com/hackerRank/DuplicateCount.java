package com.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DuplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {10,20,20,10,10,30,50,10,20};
		int n = 9;
//		List<Integer> arr = new ArrayList<>();
//		for(int i: input) {
//			arr.add(i);
//		}
//		System.out.println(arr);
		
		List<Integer> arr2 = Arrays.stream(input).boxed().collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(arr2);
		
		int result = findDuplicateCount(n, arr2);
		System.out.println("result:" +result);
	}

	private static int findDuplicateCount(int n, List<Integer> arr2) {
		// TODO Auto-generated method stub
		int[] num = arr2.stream().mapToInt(Integer::intValue).toArray();
//		System.out.println(Arrays.toString(num));
		
//		int[] num2 = new int[n];
//		for(int i=0; i< arr2.size();i++)
//		 {
//			num2[i] = arr2.get(i);
//		}
//		System.out.println(Arrays.toString(num2));
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		int k = num[0];
		int count = 1;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 1; i< num.length; i++) {
			if(num[i] == k) {
				count++;
			}else {
				k = num[i];
				count =1;
			}
			hm.put(k, count);
		}
		
		for(Entry<Integer,Integer> info : hm.entrySet()) {
			System.out.println("key:" + info.getKey());
			System.out.println("value:" + info.getValue());
		}
		
		Collection<Integer> counts = hm.values();
		ArrayList<Integer> countArrayList = new ArrayList<>(counts);
		int duplicate =0;
		int value =0;
		
		for(int i = 0 ; i < countArrayList.size(); i++) {
			System.out.println(countArrayList.get(i));
			if(countArrayList.get(i) >= 2) {
				if((countArrayList.get(i) % 2) != 0	 || (countArrayList.get(i) % 2) == 0) {
				 value = countArrayList.get(i)/2;
				 System.out.println(value);
				}
			}else {
				continue;
			}
			duplicate = duplicate + value;
			System.out.println("duplicate" +duplicate);
		}
		
		return duplicate;
	}

}

//else if((countArrayList.get(i) % 2) == 0){
//	value = countArrayList.get(i)/2;
//	System.out.println(value);
//}
