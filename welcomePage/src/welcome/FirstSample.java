package welcome; // is a container just to organize our work 

public class FirstSample {    // any block will start and ends with braces 
	
	/** @some basic facts
	 * from this simple program we can learn 
	 * - a. Java is case sensitive - let us play of on some of the key words  
	 * 		Public - Syntax error on token "Public", public expected
	 * 		static - Syntax error on token "Static", static expected
	 * 		Void   - his method must return a result of type Void
	 * 		Main   - may not complain but won't run "Error: Main method not found in class"
	 * 		string - string cannot be resolved to a type
	 * 		Class  - Syntax error on token "Class", class expected
	 * 		Package- Multiple markers at this line
					- The declared package "" does not match the expected package 
	 					"welcome"
					- Syntax error on token "Package", package expected 'The public type firstSample must be defined in its own file'
	  - b. public - is called access modifier 
	  				Illegal modifier for the class FirstSample; only public, abstract & final are permitted
	  - c. class  - every Java code resides in a class. Class is a key word 
	  				class name need to start with a letter and any combination of digits and letters 
	  				we can't use java keywords as our class name 
	  				it better be a noun and first letter uppercase (camel case)
	  				class name and file_name.java(sours code)  need to be identical including the case 
	  				if every thing goes well when we compile Java will create a bytecode with .class extension 
	 - d. main   - for java to start running need a main method  
	 				main method always need to be public 
	 * 
	 */     
	/**   @Java applications and applets
-Applications are just like a Java programs that can be execute independently without using the web browser. 
-Applets are small Java programs that are designed to be included with the HTML web document. 
 They require a Java-enabled web browser for execution. ... 
 Applet does not require a main function for its execution
	 */
	{
		// I just open and closed a block 
		System.out.println("Selam le hulachum yihun ");
	}
	
	

	public static void main(String[] args) {    // any block will start and ends with braces 
		
		// any method whether it took no parameter of not needs to have the parenthesis ()
		// main(), println()
		
		System.out.println("We are not using the famous \" Hello World \" for today");
		
		
		{
			// I just open and closed a block 
			System.out.println("Selam le hulachum yihun ");
		}
	}  // any block will start and ends with braces 

}   // any block will start and ends with braces 

