package a_pattern;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5, i, j;
		for(i=1;i<=row;i++) {
			for(j=1;j<=row-i;j++) {
				System.out.print(" "+" ");
			}
		
		for(j=1;j<=i;j++) {
			System.out.print("*"+" ");
		}
		
		for(j=1;j<=i-1;j++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}
}