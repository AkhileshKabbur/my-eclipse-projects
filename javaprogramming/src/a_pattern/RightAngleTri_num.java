package a_pattern;

public class RightAngleTri_num {
	static void p5(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=0;j<i;j++) {
				int k = (i+j)%2;
					System.out.print(k+" ");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p5(5);

	}

}
