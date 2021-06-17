package com.hackerRank;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "UDUDDUDUU";
		int steps = 9;
		int count = 0;
		int valley = 0;
		int altitude = 0;
		
		for(int i = 0 ;i < steps; i++) {
			
			if(str.charAt(i) == 'D') {
				altitude--;
			}else {
				altitude++;
				if(altitude==0) {
					valley++;
				}				
			}
			
		}
		System.out.println("Valley:" +valley);
				
//		for(int i = 0 ;i < steps; i++) {
//			if(str.charAt(i) == 'U') {
//				altitude++;
//				if(altitude==0) {
//					valley++;
//				}
//			}else {
//				altitude--;
//			}
//			
//			
//		}
//		System.out.println("Valley:" +valley);
	}

}
