package a_pattern;

public class Hallow_triangle {
	static void p4(int n) {
		int i ,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" "+" ");
			}
			for(j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1||i==n) {
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
		p4(5);
  }
}