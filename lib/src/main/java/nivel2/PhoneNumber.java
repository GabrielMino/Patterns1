package nivel2;

public abstract class PhoneNumber {
	
	private String phoneNumber;
	public abstract String getCountryCode();
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) throws NumberNotMatch {
		this.phoneNumber = phoneNumber;
		
		}
	
	
	public String toString() {
		return "+"+ getCountryCode()+ " "+ getPhoneNumber();
		
	}

}
