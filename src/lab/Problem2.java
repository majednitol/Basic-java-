public class Problem2 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static float div(int a, float b) {
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println(sum(5, 8));
        System.out.println(sub(50, 8));
        System.out.println(mul(5, 8));
        System.out.println(div(500, 8.00F));

    }
}

