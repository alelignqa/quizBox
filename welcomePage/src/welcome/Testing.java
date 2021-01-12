package welcome;// a package and its name 


public class Testing { // the begging  of the class

	/**
	 in every java we need to have 
	 a. a package name : package name should identical to the package
	 b. java is case sensitive any case change may fail to compile
	 c. we need to have a class_name after a java keyword class 
	    and the class_name has to be identical to the java file name 
	    with the .java extension (class_name.java)
	    based on java naming convention class_name should start with
	    capital letter and can follow digits or letters and if we 
	    need to use multiple words need to concatenate using camel case
	    (NameOfStudents)
	 d. a class needs to have a begging and ending braces
	 e. public is called an access modifier 
	  	which means it will let us call from any where 
	  	but access may have different form other than public 
	 */
	int m = 10;
	int n = 30;
			
	static int x =10;
	static int y = 20;
	static String name = "Jhone Stuart";
	
	
	public static void addNumbers() {
		int x =10;
		int y = 20;
		System.out.println("When we add " + x + " and " + y + " the sum will be " + x + y);
		double num = -10.23;
		int num1 = 0;
		System.out.println("When we divide " + num + " by " + num1 + " the result will be " + num/num1 );
	}
	
	public static strictfp void main(String[] args) {
		System.out.println(x + 20 + name);
		x=5;
		y=15;
		double a = 9;
		double b = 2;
		double c = a/b;
		System.out.println(c);
		addNumbers();
		
		
	}
	
}// the end of the class 


