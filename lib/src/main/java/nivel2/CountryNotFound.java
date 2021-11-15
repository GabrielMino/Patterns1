package nivel2;
//create an error to throw when the country is not available yet or there is an error in the name entered
public class CountryNotFound extends Exception{
	
	 // Parameterless Constructor
	      public CountryNotFound() {}

	      // Constructor that accepts a message
	      public CountryNotFound(String message)
	      {
	         super(message);
	      }
}
