package nivel2;

import java.util.Scanner;

public class Main {
	
	/*
	 Create a small international address and phone number manager.
	The application will allow you to add International 
	Addresses and Phone Numbers to your phonebook. 
	Given the different formats in different countries, 
	build the address book and the addresses and phones 
	you add by implementing an Abstract Factory pattern.
	 
	 
	 
	 */

	

	public static void main(String[] args) {
		
		
		/* 
		 In other to test the program, the countries added are Spain
		 (the program will work if you introduce España too) and
		 Uruguay. The address and the Phone were added in the class InsertData for simplicity,
		 but it can be simply asked through the Scanner function.
		 If you enter a country name different than Spain or Uruguay, the program will throw an Exception named 
		 CountryNotFound. In case the number or digits of the phone entered doesn´t match with the amount of digits
		 that should has, the program will throw and Exception named NumberNotMatch
		 
		 */
	
		InsertData c1 = new InsertData();
		
		try
		{
			c1.newAddress();  
		     		}
		catch(CountryNotFound e)
		{
		      // Process message however you would like
			
			System.out.println("The country inserted is not in the list");
		}
		
		// Insert Uruguay or Spain
		
		
	}

}
