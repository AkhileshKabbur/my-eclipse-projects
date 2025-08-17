package pattern_practice;

public class Pyramid_practice {
	static void p2(int n) {
		int i, j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" "+" ");
			}
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" "+" ");
			}
			for(j=1;j<=n-i;j++) {
				System.out.print("*"+" ");
			}
			for(j=1;j<=n-i-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2(5);

	}

}
