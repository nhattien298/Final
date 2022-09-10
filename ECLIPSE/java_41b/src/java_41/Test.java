package java_41;

public class Test {
public static void main(String[] args) {
	System.out.println("dog ------------------");
	Dog dog = new Dog();
	dog.eat();
	dog.bark();
	
	System.out.println("cat ----------------");
	Cat cat = new Cat();
	cat.eat();
	cat.meo();
	
	System.out.println("chim --------------");
	Bird chimBird = new Bird();
	chimBird.eat();
	chimBird.fly();
	
}
}
