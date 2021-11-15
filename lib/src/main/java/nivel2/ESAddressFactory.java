package nivel2;

public class ESAddressFactory implements AbstractFactory {
	@Override
	public Address createAddress() {
		return new ESAddress ();
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		// TODO Auto-generated method stub
		return new ESPhoneNumber();
	}
}