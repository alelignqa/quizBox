package welcome;

import java.io.Console;
import java.sql.Date;

public class Calculator {

	public static void main(String[] args) {

		int a = 7;
		int b = 7; 
		int c = 2 * ++a;
		int d = 2 * b++; // this method is not advisable and may cause a confusion 
		System.out.println("prefix: " + c + " postfix: " + d);
		
		int m = 7;
		int n = 7;
		int x = 2 * ++m; // now a is 16, m is 8
		int y = 2 * n++; // now b is 14, n is 8  not use as it can get confused expected result should have been 15
		System.out.println("prefix: " + x + " postfix: " + y);
		
		System.out.printf("%,.2f", 1000.0/3.3); // 
		System.out.printf("\nThis is trying to print a mumber" + "%,.2f", 10000.0 / 3.0);

		
		double w = 10000.0 / 3.0;
		System.out.println(w);
		
		System.out.printf("%,8.3f", w);
		System.out.printf("\n%,8.5f", w);
		
		System.out.printf("\n%tc", new Date(x));
		System.out.printf("\n%1$s %2$tB %2$te, %2$tY", "Due date:", new Date(n));
//		
//	String c = "abc".substring(0,2);
//	System.out.println(c);
//	this is to use for user and password encrypted 
//	Console cons = System.console();
//	String username = cons.readLine("User name: ");
//	char[] passwd = cons.readPassword("Password: ");
	}
	
	public void testStatic() {
	//	static int i; //Illegal modifier for parameter i; only final is permitted
		final int i;
		
		
	}
}
