package nivel2;
//This error will be thrown when the amount of digits of the PhoneNumber entered
//didnt match with the amount that should be.

public class NumberNotMatch extends Exception{
	
	 // Parameterless Constructor
	      public NumberNotMatch() {}

	      // Constructor that accepts a message
	      public NumberNotMatch(String message)
	      {
	         super(message);
	      }
}
