package pattern_practice;

public class Challenge_Number_Right_angle_triangle {
	static void p3(int n) {
		int i, j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" "+" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	p3(5);	
	}

}
