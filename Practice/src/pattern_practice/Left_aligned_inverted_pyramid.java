package pattern_practice;

public class Left_aligned_inverted_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i-1;j++) {
				System.out.print(" "+" ");
			}
			for(j=1;j<=n-i+1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
