import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(n);
            float n1 = sc.nextFloat();
            System.out.println(n1);
            String name = sc.next();
            System.out.println(name);
            String sentence = sc.nextLine();
            System.out.println(sentence);
        }

    }
}
