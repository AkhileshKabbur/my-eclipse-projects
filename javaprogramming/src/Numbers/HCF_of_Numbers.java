package Numbers;

public class HCF_of_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =12,b=24,smallest =0,hcf =1;
		if(a<b) {
			smallest = a;
		}
		else {
			smallest = b;
		}
		for(int i=1;i<=smallest;i++) {
			if(a%i==0 && b%i==0) {
				hcf = i;
			}
		}
		
		System.out.println("HCF:"+ hcf);
	}

}
