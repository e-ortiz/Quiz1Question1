package School;

public class Faculty extends Employee {
	private String OfficeHours;
	private String Rank;

	public Faculty(String name, String address, long phoneNumber,
			String emailAddress, String office, int salary, MyDate dateHired,
			String officeHours, String rank) {

		super(name, address, phoneNumber, emailAddress, rank, salary, dateHired);
		this.OfficeHours = officeHours;
		this.Rank = rank;

	}

	// Getters and Setters
	public String getOfficeHours() {
		return OfficeHours;
	}

	public void setOfficeHours(String officeHours) {
		OfficeHours = officeHours;
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

	// toString() Method
	public String toString() {
		return (getClass() + this.getName() + ".");
	}

}
