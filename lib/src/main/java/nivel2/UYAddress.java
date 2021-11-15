package nivel2;

public class UYAddress extends Address {
	
	private static final String  COUNTRY = "URUGUAY";
	
	@Override
	public String getCountry() {
		return COUNTRY;
		}
	
	@Override
	public String toString() {
		return super.toString()+", "+ getCountry();
	}

	
}
