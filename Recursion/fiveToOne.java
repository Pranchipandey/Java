public class fiveToOne {
    public static void main(String[] args) {
        func(5);

    }

    public static void func(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        func(n - 1);

    }
}
