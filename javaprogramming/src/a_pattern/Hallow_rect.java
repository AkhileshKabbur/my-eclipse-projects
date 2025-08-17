package a_pattern;

public class Hallow_rect {
	static void p1(int n, int m) {
		for(int i= 1;i<=n;i++) {
			for(int j =1;j<=m;j++) {
				if(i==1 || i==n || j==1 || j==m) {
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
		p1(5,6);
	}

}
