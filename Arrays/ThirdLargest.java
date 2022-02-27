import java.util.Scanner;

public class ThirdLargest {
    public static int thirdLargest(int[] a, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[n - 3];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Third Largest: " + thirdLargest(a, 5));
    }
}
