package praticeit;

public class Employee {
	private int id, salary;
	private String firstName, lastName;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNamme() {
		return lastName;
	}

	public void setLastNamme(String lastName) {
		this.lastName = lastName;
	}

	public String getFullname() {
		return firstName + lastName;
	}

}
