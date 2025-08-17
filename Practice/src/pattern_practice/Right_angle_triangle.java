package pattern_practice;

public class Right_angle_triangle {
	static void Rt(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
		
		
//		for(i=1;i<=n;i++) {
//			for(j=1;j<=n-i+1;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
		
		
//		for(i=n;i>=1;i--) {
//			for(j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rt(5);

	}

}
