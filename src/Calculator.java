
public class Calculator {

	public static void main(String[] args) {
		//variable for what to calculate
		int inputOperation; 
		
		do { //loop until we have correct input
		//Top border on menu
		drawBorder();
		
		//Welcome message
		printOption("Welcome to Chloe's Calculator", 6, 6);
		
		//Addition option in menu
		printOption("1. Addition", 12, 18);
		
		//Subtraction option in menu
		printOption("2. Subtraction", 12, 15);
		
		//Multiplication option in menu
		printOption("3. Multiplication", 12, 12);
		
		//Division option in menu
		printOption("4. Division", 12, 18);
		
		//Exit option in menu
		printOption("5. Exit", 12, 22);
		
		//Bottom border on menu
		drawBorder();
	
		//instantiate an object of Genie
		Genie myGenie = new Genie();   
		
		//request a number representing which calculation with grantMyFirstWish
		//method in Genie class
		inputOperation = myGenie.grantMyFirstWish();
		
		//print Exit message when user chooses to exit
		if (inputOperation == 5) {
			printMessage("Thank you for using Chloe's Calculator!");
			break;
		}
		
		printMessage("You entered a choice of " + inputOperation + " successfully\n\n");
				
		//read two inputs and store into array
		float [] myFloats = myGenie.grantMySecondWish(inputOperation);
				
		//print user inputs
		printMessage("You entered " + myFloats[0] + " and " + myFloats[1] + " successfully\n\n") ;
				
		//calculate result using grantMyThirdWish method and store in result
		float result = myGenie.grantMyThirdWish(inputOperation, myFloats);
		//print result of calculation	
		printMessage("The result is:  " + result + "\n");
					
		} while ( inputOperation < 5); //exit loop when inputOperation >= 5
	}
	
	//method for message using methods from MissYeti
	private static void printMessage(String message) { 
		MissYeti.goDown();
		MissYeti.pickNewBoulder(message);
		MissYeti.dropBoulder();
	}
	
	//method to draw border for menu
	private static void drawBorder() {
		MissYeti.pickNewBoulder("*");
		MissYeti.dropBoulder(43);
		MissYeti.goDown();
	}
	
	//method to list options with appropriate spacing
	private static void printOption(String option, int startSpace, int endSpace) {
		MissYeti.dropBoulder();
		MissYeti.move(startSpace);
		System.out.print(option);
		MissYeti.move(endSpace);
		MissYeti.dropBoulder();
		MissYeti.goDown();
	}

}
