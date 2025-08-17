package pattern_practice;

public class Hollow_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		int i,j;
		for (i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" "+" ");
			}
			for(j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
				System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		for (i=1;i<=n-1;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" "+" ");
			}
			for(j=1;j<=n-i;j++) {
				if(j==1) {
				System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			for(j=1;j<=n-i-1;j++) {
				if(j==n-i-1) {
				System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}
