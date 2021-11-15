package nivel2;

public class UYPhoneNumber extends PhoneNumber {
	private static final String COUNTRY_CODE = "598";
	private static final int NUMBER_LENGTH = 9;
	@Override
	public String getCountryCode() {
		// TODO Auto-generated method stub
		return COUNTRY_CODE;
	}
	
	public void setPhoneNumber(String newNumber) throws NumberNotMatch{
		if (String.valueOf(newNumber).length() == NUMBER_LENGTH){
		super.setPhoneNumber(newNumber); }
		else{ throw new NumberNotMatch();} } 
	}

 