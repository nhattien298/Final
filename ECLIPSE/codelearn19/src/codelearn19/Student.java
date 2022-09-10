package codelearn19;

public class Student {
	private String name;
	private char gender;

	public Student() {
		name = "unknow";
		gender = 'u';
	}

	public Student(String name) {
		this.name = name;
		this.gender = 'u';
	}

	public Student(char gender) {
		this.name = "unknow";
		this.gender = gender;
	}

	public Student(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
	}

}
