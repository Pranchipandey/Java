import java.util.Scanner;

public class CopyElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements");

        int[] a1 = new int[6];

        int[] a2 = new int[a1.length];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
        System.out.println("elements of original array :");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println(" ");
        System.out.println("elements of copied array :");
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }

    }
}