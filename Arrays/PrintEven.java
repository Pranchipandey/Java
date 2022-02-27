import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements : ");
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(" ");
        System.out.println("Even elements are :");
        for (int i = 1; i < a.length; i = i + 2) {
            System.out.print(a[i] + " ");
        }
    }
}
