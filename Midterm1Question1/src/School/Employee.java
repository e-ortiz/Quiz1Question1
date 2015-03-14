package School;

public class Employee extends Person {
	private String Office;
	private int Salary;
	private MyDate DateHired;

	// constructor
	public Employee(String name, String address, long phoneNumber,
			String emailAddress, String office, int salary, MyDate dateHired) {

		// super class parameters
		super(name, address, phoneNumber, emailAddress);

		office = this.Office;
		salary = this.Salary;
		dateHired = this.DateHired;
	}

	// Getters and Setters
	public String getOffice() {
		return Office;
	}

	public void setOffice(String office) {
		Office = office;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public MyDate getDateHired() {
		return DateHired;
	}

	public void setDateHired(MyDate dateHired) {
		DateHired = dateHired;
	}

	// toString() Method
	public String toString() {
		return (getClass() + this.getName() + ".");
	}

}
