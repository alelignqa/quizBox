package beerSong;

public class BeerSong {

	public static void main(String[] args) {

//		int beerNum = 99;
//		String word = "bottles";
//
//		while (beerNum > 0){// the beginning of while loop
//		  if(beerNum == 1){
//			word = "bottle"; // singular, as in ONE bottle
//
//		  		}// end of if beerNum == 1 loop
//		  	System.out.println(beerNum + " " + word + " of beer on the wall" );
//			System.out.println(beerNum + " " + word + " of beer,");
//			System.out.println("Take one down.");
//			System.out.println("Pass it around.");
//			beerNum = beerNum - 1;
//
//			if(beerNum > 0) {
//				System.out.println(beerNum +  " " + word + " of beer on the wall");
//			} // end of if beerNum > 0 loop
//			 else { 
//				System.out.println("No more bottles of beer on the wall");
//			} // end of the if else loop
//
//		}// end of the while loop
//
 		String[] name = {"Abebe","Bekele","Kebede","Daniel","Hamere","Rass","Mahlet"};
		
		int ran = name.length;
		System.out.println(ran);
		int ran1 = (int)(Math.random()*ran);
		System.out.println(ran1);
		System.out.println(name[ran1]);
		
	}

}
