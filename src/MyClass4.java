abstract class Monstar {
   protected String name;

    public Monstar(String name) {
        this.name = name;
    }

    public abstract void attack();
}


class FireMonstar extends Monstar {
    private String power;

    public FireMonstar(String name, String power) {
        super(name);
        this.power = power;
    }
   
    public void attack() {
        System.out.println("fire monstar can attack by fire" );
    }
    void display() {
        System.out.println("name: " + name + "\n power: " + power);
    }
    

}


class StoneMonstar extends Monstar {
    private String power;
    
    public StoneMonstar(String name, String power) {
        super(name);
        this.power = power;
    }
    public void attack() {
        System.out.println("fire monstar can attack by stone" );
    }
    void display() {
        System.out.println("name: " + name + " power: " + power);
    }

}

public  class MyClass4 {

    public static void main(String[] args) {
        FireMonstar fire = new FireMonstar("FireMonstar", "fire");
        StoneMonstar stone = new  StoneMonstar("StoneMonstar", "stone");
    fire.display();
    fire.attack();
   stone.display();
    stone.attack();

    }
    
}

