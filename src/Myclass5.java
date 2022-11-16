class Human {
    protected String name;
    protected int age;

    public void move() {
        System.out.println("Human can move");
    }

    public void eat() {
        System.out.println("Human can eat");
    }
}

class Boy extends Human {
    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void play() {
        System.out.println("boy can play");
    }

    public void eat() {
        System.out.println("boy can eat");
    }
}

class Girl extends Human {
    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void cook() {
        System.out.println("girl can cook");
    }

    public void eat() {
        System.out.println("girl can eat");
    }
}

public class Myclass5 {

    void display() {
        Boy boy = new Boy("majed", 20);
        Girl girl = new Girl("maisha", 19);
        boy.play();
        boy.eat();
        girl.cook();
        girl.eat();
        System.out.println(boy.name);
        System.out.println(boy.age);
        System.out.println(girl.name);
        System.out.println(girl.age);
    }
    public static void main(String[] args) {
        Myclass5 myclass = new Myclass5();
        myclass.display();
    }
}
