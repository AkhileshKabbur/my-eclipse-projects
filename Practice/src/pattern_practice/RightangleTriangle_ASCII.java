package pattern_practice;

public class RightangleTriangle_ASCII {
	static void p1(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			char c='e';
			for(j=1;j<=n-i+1;j++) {
				System.out.print(c+" ");
				c--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		p1(5);
	}

}
