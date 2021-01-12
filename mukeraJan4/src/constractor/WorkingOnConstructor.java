package constractor;

public class WorkingOnConstructor {
	
	/* what is a constructor?  
	 * 		a constructor in Java is a special method that is used to initialize objects
	 * 		the syntax is className(){} this is a default constructor with a default access 
	 * 		we can have as many as we want in a class based on signature pattern 
	 * what is a signature and pattern 
	 * 		signature in java is methodName and its parameter 
	 * 		pattern in this case is the type and number of parameter we include 
	 * what is is use ?
	 * how we use it?
	 * 
	 */
	String nameOfStudent;
	String subject;
	int courseFee;
	int numberOfWeeks; 
	char grade;
	boolean pass;
	
//	WorkingOnConstructor(){ 
//		System.out.println("Welcome to the world of no access modifier constructor !! ");	
//	} // --> we can have a constructor without an access modifier but we can not duplicate it
//	
	public WorkingOnConstructor() { 
		System.out.println("Welcome to the world of public constructor !! ");
	}
	
	public WorkingOnConstructor(int coursFee ) { //let use this keyword - it is used to clear confusion between constructor and method use
		int coursFeeS = this.courseFee = coursFee;
		System.out.print("We are paying " + coursFeeS + " for this course " );
		System.out.print(" and my name is "+(nameOfStudent = "Negash"));
		System.out.print(", I am taking "+(subject = "Selenium"));
		System.out.print(" for the next "+(numberOfWeeks = 12)+ " weeks");
		System.out.println(", hoping I will finish with "+(grade = 'A'));
	
	}
	

	public WorkingOnConstructor(String nameOfStudent, String subject, int courseFee, int numberOfWeeks, char grade, boolean pass) {
		String name=this.nameOfStudent = nameOfStudent;
		String subj=this.subject = subject;
		int courseCost=this.courseFee = courseFee;
		int Weeks =this.numberOfWeeks = numberOfWeeks;
		char result = this.grade = grade;
		boolean passOrFail = this.pass = pass;
		
		System.out.println("My name is " + name + " taking " + subj + ". I am expecting to finish in " + Weeks + " weeks with final grade " + result + ". will I get their  " + passOrFail);
		
	}
	
	public WorkingOnConstructor(boolean pass, String nameOfStudent, String subject, int courseFee, int numberOfWeeks, char grade) {
		String name=this.nameOfStudent = nameOfStudent;
		String subj=this.subject = subject;
		int courseCost=this.courseFee = courseFee;
		int Weeks =this.numberOfWeeks = numberOfWeeks;
		char result = this.grade = grade;
		boolean passOrFail = this.pass = pass;
		
		System.out.println("My name is " + name + " taking " + subj + ". I am expecting to finish in " + Weeks + " weeks with final grade " + result + ". will I get their  " + passOrFail);
		
	}
	
	public static void main(String[] args) {
		
		WorkingOnConstructor con1 = new WorkingOnConstructor();
		System.out.println(con1.nameOfStudent = "Nebil");// no value 
		
		WorkingOnConstructor con2 = new WorkingOnConstructor(5000);
		
		WorkingOnConstructor con3 = new WorkingOnConstructor("Maria","Selenuim", 5000,12,'A',true);
		
		WorkingOnConstructor con4 = new WorkingOnConstructor(true, "Maria","Selenuim", 5000,12,'A');
	}
	
	
}
