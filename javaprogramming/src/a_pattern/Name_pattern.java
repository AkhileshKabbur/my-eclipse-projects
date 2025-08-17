package a_pattern;

public class Name_pattern {
	static void p3(int n) {
		for(int i= 1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				if(j==1||i==4||i==j) {
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
	p3(7);
	}

}
