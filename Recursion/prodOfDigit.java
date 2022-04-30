public class prodOfDigit {
    public static void main(String[] args) {
        int ans = prod(1342);
        System.out.println(ans);
    }

    static int prod(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n % 10 * prod(n / 10);

    }
}
