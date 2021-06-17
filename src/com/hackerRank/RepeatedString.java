package com.hackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String s = "abcacabcacabcacabcacabcacabcac";
//		String s = "abaabaabaa";
//		int n =10;
//		long result = repeatedString(s,n);
//		System.out.println("result:" +result);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        System.out.println("result:" +result);
        String resultString = String.valueOf(result);
        System.out.println("result2:" +resultString);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
	}
}

class Result{
	public static long repeatedStringInitialTrail(String s, long n) {
		int num = (int) n;

		char toFind = 'a';
		long count = 0;
		System.out.println(s.length());
		
		if(s.length() > 0 && s.length() >= num) {
			String input = s.substring(0, num);
			System.out.println("input:" +input);
			char[] iChar = input.toCharArray();
			
			for(int i = 0; i< iChar.length; i++) {
				if(iChar[i] == toFind) {
					count++;
				}else {
					continue;
				}
			}

		}	
		
		return count;
    }
	
	public static long repeatedString(String s, long n) {
		long finalcount = 0;
		
		long q = n / s.length();
		long r = n % s.length();
		
		int strLength = s.length();
		long partialLength = (r==0)? 0 :r;
		System.out.println("partialLength:" +partialLength);
		System.out.println("getCount(s,s.length()):" +getCount(s,s.length()));
		System.out.println(getCount(s,partialLength));
		
//		getCount(s,s.length());
//		getCount(s,partialLength);
		finalcount = q * getCount(s,s.length()) + getCount(s,partialLength);
	
		return finalcount;
	}
	
	public static long getCount(String s, long length){
		int count = 0;
		for(int i = 0; i<length; i++) {
			if(s.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}
}
