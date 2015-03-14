package School;

public class Student extends Person {
	private final String CLASS_STATUS;

	// constructor
	public Student(String name, String address, long phoneNumber,
			String emailAddress, final String CLASS_STATUS) {

		// super class parameters
		super(name, address, phoneNumber, emailAddress);
		
		this.CLASS_STATUS = CLASS_STATUS;
	}

	// getters and setters

	public String getClassStatus() {
		return CLASS_STATUS;
	}

	// toString() Method
	public String toString() {
		return (getClass() + this.getName() + ".");
	}
}
