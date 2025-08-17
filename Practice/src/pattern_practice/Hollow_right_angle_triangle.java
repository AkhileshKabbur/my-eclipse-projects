package pattern_practice;

public class Hollow_right_angle_triangle {
	static void p5(int n) {
		int i, j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(j==1||i==j||i==n) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p5(5);

	}

}
