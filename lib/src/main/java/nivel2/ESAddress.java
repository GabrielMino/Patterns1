package nivel2;

public class ESAddress extends Address {
	
private static final String  COUNTRY = "ESPA�A";

	@Override
	public String getCountry() {
		return COUNTRY;
		}
	
	@Override
	public String toString() {
		return super.toString()+", "+ getCountry();
	}


}
