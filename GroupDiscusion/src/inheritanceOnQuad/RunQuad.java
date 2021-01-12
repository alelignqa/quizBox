package inheritanceOnQuad;

import java.util.Scanner;

public class RunQuad {
	
	enum  OPTION {R,S,P,H,T}// i feel we can use an enumerator but I need to read how to use them wait on chapte 5
	
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		Square sq = new Square();
		Parallelogram pr = new Parallelogram();
		Rhombus rh = new Rhombus();
		Trapezoid tr = new Trapezoid();
		OPTION t = OPTION.H;//  how to use it is a puzzle at this time I hope I will figure it out 
		System.out.println("Select from the following: \n R - Rectangle \n S - Square \n P - Parallelogram \n H - Rhombus \n T - Trapezoid");
		Scanner input = new Scanner(System.in);
		String  x = input.next();
		//while (!(x.equals("R")) && !(x.equals("S"))) {
			
		if(x.equals("R")) {
			System.out.println("A rectangle: ");
			rec.showDescription();
			
		} else if(x.equals("S")) {
			System.out.println("A square: ");
			sq.showDescription();
			
		} else if(x.endsWith("P")) {
			System.out.println("A parallelogram:");
			pr.ShowDescription();
			
		} else if(x.equals("H")) {
			System.out.println("A rhombus:");
			rh.ShowDescription();
			
		} else if(x.equals("T")) {
			System.out.println("A trapezoid:");
			tr.ShowDescription();
		} 		
		
		else System.out.println("Invalid input");
		
		input.close();}
		

	}


