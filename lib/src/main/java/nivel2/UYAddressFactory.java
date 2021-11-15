package nivel2;

public class UYAddressFactory implements AbstractFactory{
	 
	
	@Override
	public Address createAddress() {
		return new UYAddress ();
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		// TODO Auto-generated method stub
		return new UYPhoneNumber();
	}
	

}
