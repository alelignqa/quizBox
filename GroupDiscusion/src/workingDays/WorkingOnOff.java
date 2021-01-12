package workingDays;

import java.util.Scanner;

public class WorkingOnOff {
	
	public void tellMe() {
		
		System.out.print("Please enter any week day: ");
		Scanner input = new Scanner(System.in);
		String day = input.next();
			
		if (day.equalsIgnoreCase("Saturday") || (day.equalsIgnoreCase("Sunday"))) {
			System.out.println("It is your weekend please enjoy!!");
		} else {
			System.out.println("It is your working day and you might be busy ");
		}
		input.close();
	}
		   
		
}
