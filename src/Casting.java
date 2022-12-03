public class Casting {
    public static void main(String[] args) {
        // Implicit casting
        float price = 100.00F;
        int gst = 18;
        float totalprice = price + gst;
        System.out.println(totalprice);
        // Explicit casting
        int Price = 100;
        float Gst = 18.0F;
        int Totalprice = Price + (int) Gst;

        System.out.println(Totalprice);

    }
}
