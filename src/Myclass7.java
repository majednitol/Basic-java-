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
        System.out.println("Attack by fire");
    }

    public void display() {
        System.out.println("Name is" + name + "Power is" + power);
    }
}

class StoneMonstar extends Monstar {
    private String power;

    public StoneMonstar(String name, String power) {
        super(name);
        this.power = power;
    }

    public void attack() {
        System.out.println("Attack by stone");
    }

    public void display() {
        System.out.println("Name is" + name + "Power is" + power);
    }
}

class WaterMonstar extends Monstar {
    private String power;

    public WaterMonstar(String name, String power) {
        super(name);
        this.power = power;
    }

    public void attack() {
        System.out.println("Attack by water\n");
    }

    public void display() {
        System.out.println("Name is" + name + "\nPower is" + power);
    }
}

public class Myclass7 {
    public static void main(String[] args) {
        FireMonstar fire = new FireMonstar("Aag", "Aag laga dunga");
        fire.attack();
        fire.display();

        StoneMonstar stone = new StoneMonstar("patthar", "pattar marunga");
        stone.attack();
        stone.display();

        WaterMonstar water = new WaterMonstar("Pani", "Viga dunga");
        water.attack();
        water.display();

    }
}