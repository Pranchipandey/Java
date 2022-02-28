
import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        sc.close();

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
