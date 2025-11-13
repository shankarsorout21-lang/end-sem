// File: Main.java
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Student extends Person {
    private int rollNo;

    public Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No : " + rollNo);
    }
}

class Teacher extends Person {
    private String subjectCode;

    public Teacher(String name, int age, String subjectCode) {
        super(name, age);
        this.subjectCode = subjectCode;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject Code : " + subjectCode);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("rahul", 20, 23);
        Teacher t = new Teacher("Mr devkant", 45, "CS101");

        System.out.println("=== Student ===");
        s.display();

        System.out.println("\n=== Teacher ===");
        t.display();
    }
}
