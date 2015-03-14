package School;

public class Person {
	// fields
	private String Name;
	private String Address;
	private long PhoneNumber;
	private String EmailAddress;

	// constructor
	public Person(String name, String address, long phoneNumber,
			String emailAddress) {
		this.Name = name;
		this.Address = address;
		this.PhoneNumber = phoneNumber;
		this.EmailAddress = emailAddress;
	}

	// Setters and Getters

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	// toString() Method
	public String toString() {
		return (getClass() + this.getName() + ".");
	}

}
