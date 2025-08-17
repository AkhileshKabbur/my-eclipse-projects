package a_pattern;

import java.util.Scanner;

public class E_reverse {
		public static void main(String[] args) {
//			Scanner sc =  new Scanner(System.in);
			int row=5,i,j;
//			System.out.println("Enter number of rows:");
//			row = sc.nextInt();		
			for (i=0;i<=row-1;i++) {
				char c =(char)('e'-i);
				for (j=0;j<=row-i-1;j++) {
					System.out.print(c + " ");	
					c--;
				}
				System.out.println();
				c--;
			}	
	
		}
		
	}