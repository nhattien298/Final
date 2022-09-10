package praticeit;

public class Student {
	private int id, age, score;
	private String name, address;

	public Student() {

	}

	public Student(int id, String name, int age, String address, int score) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score < 0) {
			score = 0;
		} else if (score > 10) {
			score = 10;
		}

		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
