public class reverse {
    public static void main(String[] args) {
        rev(1234);
        System.out.println(sum);
    }

    static int sum = 0;

    static void rev(int m) {
        if (m == 0) {
            return;
        }
        int rem = m % 10;
        sum = sum * 10 + rem;
        rev(m / 10);
    }
}
