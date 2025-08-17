package a_pattern;
import java.util.Scanner ;
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int m = sc.nextInt();
		System.out.println("Enter the columns");
		int n = sc.nextInt();
		for (int i = 1; i<=m; i++) {
			for (int j =1; j<=n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
