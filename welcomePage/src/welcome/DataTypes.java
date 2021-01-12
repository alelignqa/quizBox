package welcome;

public class DataTypes {
	
	byte a; short b; int c; long d;// this are integer data type declaration 
	
	char e = 'a';  char f ='\u03C0'; static char g ='\u2122'; static char h = '\u005B';
	
	
	public static final double CM_PER_INCH = 2.54;
	
	public static strictfp void main(String[] args) {
		System.out.println(DataTypes.h + " " + DataTypes.g);
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: "
		+ paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
		
		int a = 7;
		int b = 7; 
		int c = 4 * ++a;
		int d = 4 * b++;
		System.out.println("prefix: " + c + " postfix: " + d);
		
		int m = 7;
		int n = 7;
		int x = 2 * ++m; // now a is 16, m is 8
		int y = 2 * n++; // now b is 14, n is 8
		System.out.println("prefix: " + x + " postfix: " + y);
		
		String sub = "Hello all the beautiful ladies of the world"; // Beautiful 
		System.out.println(sub.substring(0, 10) + sub.substring(24, 30)); // Hello all ladies
	}
	
	/** @ reading from the book
	Java is strongly typed language?
		- it means every variables in java has to have a data type 
	Data types in Java are divided as [abstract data types]?
	a. Primitive 
		We have eight primitive data types 
			- Four integer type 
				 byte 1 byte –128 to 127
				 short 2 bytes –32,768 to 32,767 
				 int 4 bytes –2,147,483,648 to 2,147,483, 647 (just over 2 billion) 
				 long 8 bytes –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
				 - int is widely used since it can store over 2 billion 
				 - byte and short are not common but helpful to store large array when space is at stake
				 - in Java the range of integer is not depend on the machine that will give flexibility for programmers 
				 - long will be identified by the letter l after the integer 898697l (suffix l)
		
			- Two float type : this are reserved for fractional numbers 
				float 4 bytes approximately ±3.40282347E+38F (6–7 significant decimal digits)
				double 8 bytes approximately ±1.79769313486231570E+308 (15 significant decimal digits)
				- double refers two it is twice precise than float and it is mostly used and recommended than float
				- when we use float we need to end the fraction witn f (suffix f) 555.669569565f
					to denote overflow and error 
					positive infinity 
					negative infinity 
					Nan (not a number) 
			
			- One character type and
			 	char is to store a single constant character 'A' is different from a string "A"
			- a boolean type
			 	boolean has a two state true or false and it is to evaluate logical conditions 
	b. Non-primitive
	
	 */
	
	{/*  @variables 
		  Variables always presided by a data type and ended with a semicolon ;
		  	double salary;
			int vacationDays;
			long earthPopulation;
			boolean done 
		variable name starts with letter and can have digits and numbers 
		variables can be declared on a single line but not advisable int x,y,n;
		 */}
	
	{ // constants 
	 /*
	  java use a keyword final to declare a constant variable 
	  constant variables will be assigned only once 
	  it is customary to use all caps for a constant variable  
	  */
		
	}
	
	{// Operators 
		/*
		 ** Java's usual arithmetic operators are +,-,* and /[addition, subtraction, multiplication, and division
		  a division / operator will assume a float point unless both arguments are integers 
		  we have % a modulator operator to calculate a remainder 
		  a division by zero 0 will produce negative or positive infinity or NaN(not a number}
		  due to a confusion of different machines some on 64bites or 80bites java gave the option of using 
		  strictfp (strict float point) in the main method 
		  	public static strictfp void main(String arg[])
		  	 the only difference between default and strict mode is that strict computations may overflow
		  	 when default computations don’t.
		**  increment or decrement ++ and -- is used to increase or decrease by 1 
		  it can be used prefix or postfix 
		  	n=4; m=4; z= 2*++n; y = 2*m++; but 4++ or ++4 is an invalid 
		** relational and boolean operations ==, !=, <,>,<=,>=, &&, ||
			when we use && ||, the first expression will determine the result "short circuit "
			&& - if the 1st expression is false the second won't be evaluated "Only 1st true will evaluate 2nd"
			|| - unless the 1st expression is evaluated false the second won't be evaluated 
			we have also a ternary operator denoted by ? not sure how it works need to read more but I believe 
			 evaluate the first condition is true otherwise the second 
			  condition ? expression1 : expression2
		  	bitwise operator >>,<<, >>>,[!<<<], |, & [& (“and”) | (“or”) ^ (“xor”) ~ (“not”)]
		 ** mathematical function and constant 
		 	- using a Math class like Math.sqrt
		 	- the Math class give a pow, sin,cos,tan, atan,atan2,exp, log,pi and e
		 ** conversion between numeric type - double >> float >> long >> int (based on the operands)
		 ** cast  double x = 9.9; int y = (int)x; but this will discard the decimal the value of the int will be 9
		 	what is better would be if we can round it to the next int number to do this we need to use the 
		 	Math class so int y = (int)Math.round(x); on this line of sentence if we omit the explicit casting of int
		 	   the result will be in long
		 	casting between boolean and numbers is not permitted in rare case may use condition - need further reading 
		 ** parenthesis and operators hierarchy this will check precedence and processing direction 
		 		&& has a precedence on ||
		 		a += b += c will be evaluated from right to left  (b += C ) and the new value of be will be on a 
		 ** enumerated types - will help to clear confusion and limit the option 
		 		enum Size {SMALL, MEDIUM, LARGE,EXTRA_LARGE}  the when we need we an call >> Size s = Size.SMALL;

		 */
		
	}
	
	{// strings 
	/* in Java string if a sequence of unicode characters "hello world" is h,e,l,l,...,d 
	 * java doesn't have a build in string type but has a String class
	 * using substring - substring(0, 10) 0 is inclusive but not 10
	 * concatenation - using a + sign we can concatenate two strings , 
	 * if a string and a value is concatenated, value will be converted to string 
	 * String is immutable if we want to change 
	 * 	String h = "hello" to help we need to use substring 
	 *  h.substring(0,3)+"p" - this will copy the first 3 characters and concate with p
	 *  to test string equality use equals method do not use ==, == will check only the location  
	 */
	}

}
