import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements in array : ");
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int n = 3;
        sc.close();
        System.out.println("original array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        System.out.println("right rotated array : ");
        for (int i = 0; i < n; i++) {
            int last;
            last = a[a.length - 1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = last;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
