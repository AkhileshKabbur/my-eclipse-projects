package a_pattern;

public class Heart_pattern {
	static void p7(int m, int n) {
		int i,j;
		for(i=0;i<=m;i++) {
			for(j=0;j<=n;j++) {
				if((i==1 && j%3==0)||(i==0 && j%3 != 0)||(i-j == 2)||(i+j==8)) {
				System.out.print("*"+" ");
				}
				else if (i == 2 && (j == 2 || j == 4)) {
	                    System.out.print("A ");
	                }
				
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		p7(5,6);
	}

}
