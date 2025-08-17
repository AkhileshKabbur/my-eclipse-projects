package core.java;
import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int r,c,i,j;
		System.out.println("Enter Number of Classes:");
		r = sc.nextInt();
		System.out.println("Enter Number of Students in each Class:");
		c=sc.nextInt();
		int a[][]= new int [r][c];
		for(i=0;i<=r-1;i++) {
			System.out.println("Enter marks of Class"+(i+1)+":");
			for(j=0;j<=c-1;j++) {
				a[i][j] = sc.nextInt();
			}	
		}
		System.out.println("Marks of Students are:");
		for(i=0;i<=r-1;i++) {
			for(j=0;j<=c-1;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}	

	}

}
