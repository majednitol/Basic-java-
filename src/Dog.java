 class Animal {
    protected String name;
    protected int age;

    public  void move() {
        System.out.println("animal move");
    }
}

public class Dog extends Animal {
    public void move() {
        System.out.println("dog move");
        
    }

    public void printAnimal() {
       
        super.move();
    }

   
    public  void main(String[] args) {
        Dog d1 = new Dog();
        d1.printAnimal();
        super.move();
    }

    
}