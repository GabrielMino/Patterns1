package nivel2;
import java.util.*;

public class InsertData {
	/*	static int index = 1;
	public UYAddressFactory questions(){
		
		UYAddressFactory c1;
		System.out.println("Insert your country");
		Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

	    String country = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
	    
	    if (country == "URUGUAY") {
	     // UYAddressFactory c1  = new UYAddressFactory();
	    }
	    else {
	    	 //UYAddressFactory c1  = new UYAddressFactory(); 
	    }
	    
	    
		
		return c1;
}}}
*/

	public Map<Address,PhoneNumber> newAddress() throws CountryNotFound{
		
	
	System.out.println("Insert your country");
	Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

	String country = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
	System.out.println(country); 
	entradaEscaner.close();
	
	    if (country.equalsIgnoreCase("URUGUAY")) {	
 
	System.out.println("Creating Uruguay Address");
	
	UYAddressFactory uyAddressFactory = new UYAddressFactory();
	Address uyAddress = uyAddressFactory.createAddress();
	PhoneNumber uyPhone = uyAddressFactory.createPhoneNumber();
	
	
	//Creating Address
	//The address should be added through Scanner ,but for simplicity it will be added on the next lines.
	
	uyAddress.setStreet("General Aguilar 1263");
	uyAddress.setCity("Montevideo");
	uyAddress.setRegion("Montevideo");
	uyAddress.setPostalCode("11800");
	//Print Address
	System.out.println(uyAddress.toString());
	
	// set the phone
	//The Phone should be added through Scanner ,but for simplicity it will be added on the next lines.
	try {
		uyPhone.setPhoneNumber("099515524");
		System.out.println("The phone number is: "+uyPhone.toString());
	}catch(NumberNotMatch e) {
		System.out.println("The amount of digits entered doesn´t match with the amount that corresponds to the country");
		
	}
	
	Map<Address,PhoneNumber> result = new HashMap<>();
	result.put(uyAddress, uyPhone);Map<Address,PhoneNumber> result1 = new HashMap<>();
	result1.put(uyAddress, uyPhone);
	
	return result1;
	} else if (country.equalsIgnoreCase("ESPAÑA")||country.equalsIgnoreCase("SPAIN")) {
		System.out.println("Creating Spain Address");
		
		ESAddressFactory esAddressFactory = new ESAddressFactory();
		Address esAddress = esAddressFactory.createAddress();
		PhoneNumber esPhone = esAddressFactory.createPhoneNumber();
		
		//Creating Address
		//The address should be added through Scanner ,but for simplicity it will be added on the next lines.
		esAddress.setStreet("Balmes 217");
		esAddress.setCity("Barcelona");
		esAddress.setRegion("Catalunia");
		esAddress.setPostalCode("08006");
		
		System.out.println(esAddress.toString());
		
		
		Map<Address,PhoneNumber> result1 = new HashMap<>();
		result1.put(esAddress, esPhone);
		
		// set the phone
		//The Phone should be added through Scanner ,but for simplicity it will be added on the next lines.
		try {
			esPhone.setPhoneNumber("8691289971");	
			System.out.println("The phone number is: "+esPhone.toString());
		}catch(NumberNotMatch e) {
			System.out.println("The amount of digits entered doesn´t match with the amount that corresponds to the country");
			
		}
		
		return result1;
		
	} else {
		throw new  CountryNotFound();
	}
	}
	    
	 
	    
	    

	    

	
}
