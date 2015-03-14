package School;

public class Staff extends Employee {
	private String Title;

	public Staff(String name, String address, long phoneNumber,
			String emailAddress, String office, int salary, MyDate dateHired,
			String title) {

		// super class parameters
		super(name, address, phoneNumber, emailAddress, office, salary,
				dateHired);

		title = this.Title;
	}

	// Getters and Setters
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	// ToString() Method
	@Override
	public String toString() {
		return (getClass() + this.getName() + ".");
	}

}
