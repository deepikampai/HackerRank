package com.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JumpingOnClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {0,1,0,0,1,1,0};
		List<Integer> c = Arrays.stream(i).boxed().collect(Collectors.toCollection(ArrayList::new)) ;
		int result = countJumps(c);
		System.out.println("result:" +result);
	}

	private static int countJumps(List<Integer> c) {
		// TODO Auto-generated method stub
		int[] in = c.stream().mapToInt(Integer::intValue).toArray();
		int count = 0;
		 
			for(int i = 0; i< in.length-1;) {
				
					if((i+2)<in.length && in[i+2]== 0) {
						i = i+2;
					}else {
						i = i+1;
					}
					count++;
				}
			return count;
		}
		
	

}
