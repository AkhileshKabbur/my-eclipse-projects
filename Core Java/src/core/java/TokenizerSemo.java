package core.java;
import java.util.*;

public class TokenizerSemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1 = sc.next();
		System.out.println("Enter Character(s) where tokenization must take place:");
		String s2 = sc.next();
		StringTokenizer Stk = new StringTokenizer(s1,s2);
		System.out.println("The tokens are:");
		while (Stk.hasMoreTokens()) {
			System.out.println(Stk.nextToken());
		}

	}

}
