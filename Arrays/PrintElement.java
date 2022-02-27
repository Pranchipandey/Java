import java.util.Scanner;

public class PrintElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements in array : ");
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        sc.close();
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }

    }

}
