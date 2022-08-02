public class string {
    public static void main(String[] args) {
        String name1 = new String("majed");
        String description = new String("is a good boy");
        // concatenation
        String sentence = name1 + " " +description;
        System.out.println(sentence);
        //  ChartAt
        System.out.println(name1.charAt(0));
        // length
        System.out.println(name1.length());
        //  Replace
        System.out.println(name1.replace('a', 'b'));
        // Substring
        System.out.println(name1.substring(0, 4));

    }
}
