package nivel2;

public abstract class Address {
	
	// define the variables of the class
	private String street;
	private String city;
	private String region;
	private String postalCode;
	
	//Generate getters and setters
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	// el método getCountry()

	public abstract String getCountry();
	
	public String toString() {
		return street + ", " + city +", "+ region +", "+ postalCode;
	}
	
	
	
	
	

}
