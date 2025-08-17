package a_pattern;

public class Diamond_Number {
	public static void main(String[] args) {
		int row = 5, i, j;
		for(i=1;i<=row;i++) {
			for(j=1;j<=row-i;j++) {
				System.out.print(" "+" ");
			}
		
		for(j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		
		for(j=1;j<=i-1;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
		for(i=1;i<row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" "+" ");
			}
//		
		for(j=1;j<=row-i;j++) {
			System.out.print(j+" ");
		}
		for(j=1;j<=row-i-1;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	}

}
