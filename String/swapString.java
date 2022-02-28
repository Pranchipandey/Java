
import java.util.Scanner;

public class swapString {
    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        System.out.println("String before swapping : " + s1 + " " + s2);
        s1 = s1 + s2;
        s2 = s1.substring(0, (s1.length() - s2.length()));
        s1 = s1.substring(s2.length());

        System.out.println("String before swapping : " + s1 + " " + s2);

    }
}
