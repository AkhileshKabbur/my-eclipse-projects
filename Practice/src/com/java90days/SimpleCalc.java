package com.java90days;

import java.util.Scanner;

public class SimpleCalc {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		double a = sc.nextDouble();
		
		System.out.println("Enter Second Number:");
		double b = sc.nextDouble();
		
		System.out.println("Select Operation(+, -, /, *):");
		char op = sc.next().charAt(0);
		
		double result = 0;
		
        switch(op) {
        case '+': result = a + b; break;
        case '-': result = a - b; break;
        case '*': result = a * b; break;
        case '/': result = a / b; break;
        default: System.out.println("Invalid operation"); return;    
       }
        
        System.out.println("Result: " + result);
		 
	}

}
