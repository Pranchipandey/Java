import java.util.Scanner;

public class PrintNoOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter elements : ");

        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("No of elements present in array : ");
        System.out.println(a.length);
    }
}
