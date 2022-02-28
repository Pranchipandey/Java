
import java.util.Scanner;

public class CountNoOfChar {
    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;

            }

        }
        System.out.println("The no of characters in given string : " + count);
    }

}
