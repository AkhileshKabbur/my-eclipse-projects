package pattern_practice;

public class Mirrored_Number_Triangle {
	static void p6(int n) {
		int i, j;
		for(i=1;i<=n;i++) {
//			for(j=1;j<=n-i;j++) {
//				System.out.print(" "+" ");
//			}
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			p6(5);

	}

}
