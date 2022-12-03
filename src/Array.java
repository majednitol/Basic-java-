import java.util.Arrays;

public class Array {

    public static int firstsmallest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }

    public static int secsmallest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }

    public static void main(String[] args) {
        int array[] = { 100, 30, 4, 5, 6, 15, 25 };
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 1 && array[i] % 5 == 0) {
                // System.out.println(array[i]);
            }
        }
        int a[] = { 1, 2, 5, 6, 3, 2 };

        System.out.println(firstsmallest(a, 6));
        System.out.println(secsmallest(a, 6));

    }
}
