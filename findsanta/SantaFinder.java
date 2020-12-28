package findsanta;
import java.util.*;

public class SantaFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		SantaSuspects santaSuspects = new SantaSuspects(20);
		santaSuspects.addSuspect("CA.123@gmail.com");
		santaSuspects.addSuspect("tx.223@gmail.com");
		santaSuspects.addSuspect("VA.2323@gmail.com");
		santaSuspects.addSuspect("Fl.1123@gmail.com");
		santaSuspects.addSuspect("NM123@gmail.com");
		santaSuspects.addSuspect("NJ214@gmail.com");
		santaSuspects.addSuspect("NY.123@gmail.com");
		santaSuspects.addSuspect("AZ1123@gmail.com");
		santaSuspects.addSuspect("MD123@gmail.com");
		santaSuspects.addSuspect("CO420@gmail.com");
		santaSuspects.addSuspect("SC2231@gmail.com");
		santaSuspects.addSuspect("NC2314@gmail.com");
		
		
		
		santaSuspects.printSuspects();
		
		
		while(true) {
			
			System.out.print("Provide a name to search for: ");
			Scanner in = new Scanner(System.in);
			String searchFor = in.nextLine();
			
			boolean foundMatch = santaSuspects.foundMatch(searchFor);
			if(foundMatch) {
				System.out.println(searchFor+ " suspect is in the list!");
			}else {
				System.out.println(searchFor+ " is not a santa suspect");
			}
			
			System.out.println("Search again? type anything for yes or no to exit");
			
			String ans = in.nextLine();
			
			if(ans.equalsIgnoreCase("no")) {
				System.out.println("Program Exiting. . .");
				break;
			}
		}

		
	}

}
