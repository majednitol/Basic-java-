public class Variable {
    public static void main(String[] args) {
        // primitive types
        String name = "majed";
        System.out.println(name);
        int age = 30;
        System.out.println(age);
        String fnd = name;
        System.out.println(fnd);
        byte num = 20;
        System.out.println(num);
        short num2 = 30000;
        System.out.println(num2);
        int num3 = 300000000;
        System.out.println(num3);
        long num4 = 300000000L;
        System.out.println(num4);
        float num5 = 1.0F;
        System.out.println(num5);
        double num6 = 3.987F;
        System.out.println(num6);

        // Non-Primitive type
        String nam = new String("majedur");
        System.out.println(nam);
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 100;
        marks[2] = 87;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //  constant keyword - final ....never change variables valuse
        final int x = 100;
        System.out.println(x);


    }
}
