//You don't need to know the details of this file
//Don not modify this file for your projects.  Use it as is.
import java.util.Scanner;
import java.util.InputMismatchException;

public class Genie {
	Scanner readInput = new Scanner(System.in);
	// this method will ask the user to enter a number between 1 to 5
	// if they enter outside of this range, it gives a message
	// else if they enter invalid value (for example string instead number)
	// it gives another message
	// it continues until the user enters a valid value
	// otherwise it returns the valid choice
	//
	int grantMyFirstWish() {
		byte inputChar;
		int inputInt;
		do { // Loop until we have correct input
			System.out.print("Enter your choice between 1 and 5 only: ");
			try {
				inputInt = readInput.nextInt(); // waits for user input
				inputChar = readInput.nextByte();
				if (inputInt >= 1 && inputInt <= 5 || inputChar == 'a' ) {
					break; // Got it, done
				} else {
					System.out.println("You have not entered a number between 1 and 5. Try again.");
					continue; // continue looping as it is wrong number
				}
			} catch (final InputMismatchException e) {
						System.out.println("You have entered an invalid choice. Try again.");
				readInput.nextLine(); // discard non-int input
				continue; // keep looping until you found right onee
			}
		} while (true);
		return inputInt;
	}

	/*
	float [] grantMySecondWish(int choice){
		float []myFloats = new float[2];
		do { // Loop until we have correct input
			System.out.print("Enter two floats separated by a space: ");
			try {
				myFloats[0] = readInput.nextFloat(); // waits for user input
				myFloats[1] = readInput.nextFloat(); // waits for user input
				if (choice == 4 && myFloats[1] == 0.0f){
					System.out.println("You can't divide by zero, please re-enter both values");
					myFloats[0] = myFloats[1] = 0.0f;
					continue;
				}
				//if you are here, the floats were good, you are done, breadk out from loop
				break; 

			} catch (final InputMismatchException e) {
						System.out.println("You have entered an invalid input. Try again.");
				readInput.nextLine(); // discard non-float input
				continue; // keep looping until you found right one
			}
		} while (true);
		return myFloats;
	}

	public float grantMyThirdWish(int choice, float [] f){
		float result = 0.00f;
		
		switch (choice){
		case 1: result = f[0]+f[1]; break;
		case 2: result = f[0]-f[1]; break;
		case 3: result = f[0]*f[1]; break;
		case 4: result = f[0]/f[1]; break;
		case 5: System.out.println("You should exit Master, why are you asking for third wish? \n"); break;
		default: System.out.println("Unknown operator Master, something is wrong. \nGenie can only do 1 to 4.  You gave me \n" + choice); break;
		
		}
		return result;
	}
 	*/
 
	public static void main(String[] args) {
		int inputOperation;
		Genie aladin = new Genie();
		
		inputOperation = aladin.grantMyFirstWish();
		System.out.printf("You entered a choice of %d successfully!\n\n", inputOperation);

		//similarly you can write the code to get the valid two floats
		//float [] myFloats = aladin.grantMySecondWish(inputOperation);
		//System.out.printf("You entered %5.2f and %5.2f successfully!\n", myFloats[0], myFloats[1]);
	}
}
