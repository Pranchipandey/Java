public class Sum {
     static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int ans = sum(3);
        System.out.println(ans);
    }
}
