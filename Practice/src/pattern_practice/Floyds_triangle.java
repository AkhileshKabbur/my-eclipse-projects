package pattern_practice;

public class Floyds_triangle {
	static void p4(int n) {
		int i, j,k=1;
		for (i=1;i<=n;i++) {

			for(j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		p4(5);
	}

}
