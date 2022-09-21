import java.util.Scanner;

class Mobile {
  private  String name;
   private int code;
   private double price;
  private  String brand;

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    Mobile(String name, int code, double price, String brand) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.brand = brand;
    }

    public static void displayRecord(Mobile mb[]) {
        for (int i = 0; i < mb.length; i++) {
            System.out.println("Name: " + mb[i].name + ", Code: " + mb[i].code + ", Price: " + mb[i].price + ", Brand: "
                    + mb[i].brand);
        }

    }


    // public static void displayRecord(Mobile mb[]) {
    //     try{
    //      for (int i = 0; i < mb.length; i++) {
    //          System.out.println("Name: " + mb[i].name + ", Code: " + mb[i].code + ", Price: " + mb[i].price + ", Brand: "
    //                  + mb[i].brand);
    //      }}
    //  catch (Exception e) {
    //  }
 
    //  }

    public static void searchRecoard(Mobile mo[], String name, int code, String brand) {
        for (int i = 0; i < mo.length; i++) {
            if (mo[i].name.equals(name) && mo[i].code == code && mo[i].brand.equals(brand)) {
                System.out.println("Mobile  device is found");
                break;

            } else {
                System.out.println("Mobile device is not found");
            }
        }
    }

    public static void deleteRecoard(Mobile mo[], int code) {
        for (int i = 0; i < mo.length; i++) {
            if (mo[i].code == code) {
                mo[i] = null;
                System.out.println(" phone information is deleted");
                break;

            }
        }
    }
}

public class MyClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of mobile devices: ");
        int n = input.nextInt();
        Mobile[] m = new Mobile[n];

        for (int i = 0; i < n; i++) {
            String name = input.next();
            int code = input.nextInt();
            double price = input.nextDouble();
            String brand = input.next();
            m[i] = new Mobile(name, code, price, brand);

            m[i].setName(name);
            m[i].setCode(code);
            m[i].setPrice(price);
            m[i].setBrand(brand);
        }

        Mobile.displayRecord(m);
        Mobile.searchRecoard(m, "x1", 21, "nokia");
        Mobile.deleteRecoard(m, 22);
        Mobile.displayRecord(m);


    }

}
