package com.basicop;

public class Class2ternary {
	public static void main(String[] args) {
		int a=99;
		int b= 27;
		int c = 57;
//		if (a>b && a>c) {
//		System.out.println(a);
//		}
//		else if (b>c && b>a) {
//			System.out.println(b);
//		}
//		else {
//			System.out.println(c);
//		}
//		
		int max = ((a>b)&&(a>c))? a : ((b>a)&&(b>c))?b : c;
		System.out.println(max);
		
	}

}