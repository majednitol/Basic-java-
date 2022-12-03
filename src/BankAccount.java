import java.util.Scanner;

class AccountDetails {
    public String name;
    public int AcNumber;
    public int phone;
    public String address;
    public double balance;

    AccountDetails(String name, int AcNumber, int phone, String address, double balance) {
        this.name = name;
        this.AcNumber = AcNumber;
        this.phone = phone;
        this.address = address;
        this.balance = balance;
    }

    public void display() {
        System.out.println("name: " + name + " acNumber: " + AcNumber + " phone: " + phone + " address: " + address + " balance: " + balance);
    }

 public  static void searchAccount(AccountDetails ac[], int acountnumber){
    for (int i = 0; i < ac.length; i++) {
        if (ac[i].AcNumber==acountnumber) {
            System.out.println("Account found");
            break;
        }
        else {
            System.out.println("account not found");
            break;
        }
    }
 }
}

public class BankAccount {
  

public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      AccountDetails[] accountdetails = new AccountDetails[n];
      for (int i = 0; i < accountdetails.length; i++) {
          String sname = input.next();
          int sacNumber = input.nextInt();
          int sphone = input.nextInt();
          String saddress = input.next();

          double sbalance = input.nextDouble();

          accountdetails[i] = new AccountDetails(sname, sacNumber, sphone, saddress, sbalance);
         
      }

      for (int i = 0; i < accountdetails.length; i++) {
          accountdetails[i].display();

      }
      System.out.println("plz type account number for search");
      int acNumber = input.nextInt();
      AccountDetails.searchAccount(accountdetails, acNumber);
      
      
  }
}