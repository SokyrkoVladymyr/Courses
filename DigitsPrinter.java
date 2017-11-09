public class DigitsPrinter {

    public static void main(String[] args) {
        int n = 13579;  // Input: any positive number

        System.out.println(n%10);
        n=n/10;
        System.out.println(n%10);
        n=n/10;
        System.out.println(n%10);
        n=n/10;
        System.out.println(n%10);
        n=n/10;
        System.out.println(n%10); // Your code
    }

}
