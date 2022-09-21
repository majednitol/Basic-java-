import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        // String name1 = new String("majed");
        // String description = new String("is a student");
        // // concatenation
        // String sentence = name1 + " " +description;
        // System.out.println(sentence);
        // //  ChartAt
        // System.out.println(name1.charAt(0));
        // // length
        // System.out.println(name1.length());
        // //  Replace
        // System.out.println(name1.replace('a', 'b'));
        // // Substring
        // System.out.println(name1.substring(0, 4));
        // System.out.println(name1.);

        Scanner sc = new Scanner(System.in);
        int count = 0;
        String names[] = new String[5];
        String searchName= "DIU";
        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            if (searchName.equals(names[i])) {
                count++;
                break;
            } 

        }
        if (count == 1) {
            System.out.println(" found");
        }
        else {
            System.out.println("not found");
        }
    }
}