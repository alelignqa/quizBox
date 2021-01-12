package nestedClass;

public class MainNestedClass {

	public static void main(String[] args) {
		// @this point I can access a static without any object 
		/* the only static I have in the TheOuterClass class are 
		  	static String outerName = "Sew mehon";
			static String outerName1;
		 */
//		System.out.println(TheOuterClass.outerName);
//		System.out.println(TheOuterClass.outerName1="Rename sew in main");
		
		// let me create an object of the TheOuterClass
		
		TheOuterClass obj = new TheOuterClass();
		obj.outerMethod();
		
		TheOuterClass.innerOne obj1 = obj.new innerOne();
		obj1.innerOneMethod();
		
		TheOuterClass.innerOne.innerTwo obj2 = obj1.new innerTwo();
		obj2.innerTwoMethod();
		

	}

}
