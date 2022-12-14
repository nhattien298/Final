package lab4;

public class Person {
    private String name;
    private int age;

    public Person(String xName, int xAge) {
        this.name = xName;
        this.age = xAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return (name + " " + age);
    }
}

