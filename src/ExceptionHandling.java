public class ExceptionHandling {
    public static void main(String[] args) {
        int[] arry= {2,5,6,7,8,9};
       try {
        System.out.println(arry[9]);
    } catch (Exception e) {
        System.out.println(e);
    }
        System.out.println(arry[3]);
       }
    }

