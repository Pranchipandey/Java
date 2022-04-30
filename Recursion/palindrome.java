public class palindrome {
    public static void main(String[] args) {
        System.out.println(palin(122));
    }

    static int sum = 0;

    static int rev(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n / 10);
        return sum;
    }

    static boolean palin(int n) {
        return n == rev(n);
    }
}
