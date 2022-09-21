

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Majedur", 22);
        Person p2 = new Person("Nitol", 22);
        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p1.age);
    }
}
