package java_43;

public class Animal {
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println(" toi dang an : ");
	}
	public void makeSound() {
		System.out.println("dang la len :....");
		
	}
	public void sleep() {
		System.out.println("zzzzzzzzzzzzz");
	}
}
