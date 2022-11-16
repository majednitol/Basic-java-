package lab7;

import java.util.Scanner;

class PhoneBook {
    private String name;
    private String phone;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public static void search(PhoneBook ph[], String name, String phone, String email) {
        for (int i = 0; i < ph.length; i++) {
            if (ph[i].name.equals(name) && ph[i].phone.equals(phone) && ph[i].email.equals(email)) {
                System.out.println("imformation  is found");
                break;

            } else {
                System.out.println("imformation  is not found");
                break;
            }
        }
    }



    public static void displayRecord(PhoneBook ph[]) {

        for (int i = 0; i < ph.length; i++) {
            System.out.println("name: " + ph[i].name + " phone: " + ph[i].phone +
                    " email: " + ph[i].email);
        }

    }
}

public class MyClass {

   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    PhoneBook[] ph = new PhoneBook[n];
    for (int i = 0; i < ph.length; i++) {
        String sname = input.next();
        String sphone = input.next();
        String semail = input.next();
        ph[i] = new PhoneBook();
        ph[i].setName(sname);
        ph[i].setPhone(sphone);
        ph[i].setEmail(semail);

    }

    PhoneBook.displayRecord(ph);
    String name = input.next();
    String phone = input.next();
    String email = input.next();
    PhoneBook.search(ph, name, phone, email);
   }

}