package core.java;

import java.util.Scanner;

public class Three_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int b,r,c,k,i,j;
		System.out.println("Enter Number of Schools:");
		b = sc.nextInt();
		System.out.println("Enter Number of Classes:");
		r = sc.nextInt();
		System.out.println("Enter Number of Students in each Class:");
		c=sc.nextInt();
		int a[][][]= new int [b][r][c];
		for(k=0;k<b;k++) {
			for(i=0;i<r;i++) {
				System.out.println("Enter marks of School"+(k+1)+"Class"+(i+1)+":");
				for(j=0;j<c;j++) {
					a[k][i][j] = sc.nextInt();
			}	
		}
	}
		System.out.println("Marks of the students are:");
		for(k=0;k<b;k++) {
			for(i=0;i<r;i++) {
				for(j=0;j<c;j++) {
					System.out.print( a[k][i][j]+" ");
			}
				System.out.println();
		}
		System.out.println("----------------");
	}

 }

}
