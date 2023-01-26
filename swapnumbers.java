public class swapnumbers {
    public static void main(String[] args) {
        int a = 14;
        int b = 25;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}
