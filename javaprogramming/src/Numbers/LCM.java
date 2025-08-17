package Numbers;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =20,b=10,greatest =0,lcm =0;
		if(a<b) {
			greatest = a;
		}
		else {
			greatest = b;
		}
		for(int i=greatest;i<=a*b;i++) {
			if(i%a==0 && i%b==0) {
				lcm = i;
				break;
			}
		}
		System.out.println("LCM="+lcm);

	}

}
