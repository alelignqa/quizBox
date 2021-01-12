package mukeraJan4;

public class Calculate {
	
	static int a = 5;    		int c = 10;
	static int b = 10;			int d = 20;	
	static int sum = a + b;		int product = c * d;
	
	public static void main(String[] args) {
		
		System.out.println("The product of the number:  " + sum);
		
		Calculate product = new Calculate();
		System.out.println(product.product);
		
		
		

	}

}
