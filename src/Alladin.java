/*
 * Alladin uses two classes.  Genie and MissYeti.
 * MissYeti can:
 *    pickNewBoulder - This allows MissYeti to pick any strings as boulder
 *    dropBoulder    - This allows MissYeti to print the last boulder (string) picked and move right
 *    move           - This allows MissYeti to move one space on right
 *    goDown         - This allows MissYeti to go down one step (line) - to beginning of line
 *    
 * Genie can:
 * 	  grantMyFirstWish - This gives a valid integer between 1 to 5
 *                       1 is used for add, 2 for subtract, 3 for multiply 4 for divide, 5 to exit
 *    grantMySecondWish- This gives two float values in an array
 *                       This needs an input of integer between 1 to 4
 *                       So, that it validates if you are trying to divide
 *                       by zero
 *    grantMyThirdWish - This gives a result of adding, subtracting, multiplying and dividing
 *                       two float values.
 *                       This needs an input of integer between 1 to 4 and array
 *                       of two float values
 *
 * Here is an example of how these classes can be used.  Alladin is using.
 * MissYeti and Genie do some interesting calculations.
 *  
 */


public class Alladin {
	public static void main (String args[]){
		int inputOperation;  //what calculation to be done
		Genie myGenie = new Genie();   //instantiate an object of Genie
		MissYeti myYeti = new MissYeti(); //instantiate an object of MissYeti
		//We want to know what kind of calculation user wants to do 
		//An object of Genie can do that for us when we ask Genie to grant
		//our first wish.  Genie will make sure that the user gives valid
		//integer between 1 and 4 only and nothing else
		//We don't need to worry about that ourselves
		inputOperation = myGenie.grantMyFirstWish(); //ask Genie to get a number representing which calculation
		
		//let us give a feedback to the user what was selected 
		//an object of MissYeti can do that for us. We need to give a 
		//String object to her. We can create an object like the following
		//on the fly
		
		//Also, string can be concatenated with two strings or a number as well
		myYeti.pickNewBoulder("You entered a choice of " + inputOperation + " successfully\n\n");
		myYeti.dropBoulder(); //last boulder is printed
		
		//Now we can ask Genie to gives us two valid floats to do the
		//calculation.  Genie needs the input between 1 to 5 which
		//designates which type of calculation.  Genie needs this because
		//Genie can also check divide by zero issue for us.
		//Once two valid floats are entered by the user, Genie puts that 
		//in a float array.  
		
		float [] myFloats = myGenie.grantMySecondWish(inputOperation);
		
		//Arrays store the multiple values of same data type.
		//Our float array stores two floats.  We can access each one of 
		//one of them, called elements, using index (0 based index, 0 being
		//first and 1 being second)
		
		//We can examine what was entered by printing it.  Again, we can use
		//MissYeti for that.  Here is an example
		myYeti.pickNewBoulder("You entered " + myFloats[0] + " and " + myFloats[1] + " successfully\n\n") ;
		myYeti.dropBoulder();
		
		//We can do some calculation also.  For that we can ask
		//Genie to grant us our third wish.  We need to pass our calculation
		//choice and array of floats.
		
		float result = myGenie.grantMyThirdWish(inputOperation, myFloats);
		//now let see the result
		myYeti.pickNewBoulder("The result is:  " + result + "\n");
		myYeti.dropBoulder();
		
	}
}
