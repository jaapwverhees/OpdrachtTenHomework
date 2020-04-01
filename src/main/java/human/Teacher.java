package human;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Gender gender) {
        super(name, age, gender);
    }
}
