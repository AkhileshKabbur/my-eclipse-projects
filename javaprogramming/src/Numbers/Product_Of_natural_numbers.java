package Numbers;

public class Product_Of_natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, Product = 1 ,i;
		for(i=1;i<=n;i++) {
			System.out.println(i);
			Product *= i;
		}
		System.out.println("---------------");
		System.out.println(Product);

	}

}
