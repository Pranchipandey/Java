import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter a no to check whether it is palindrome or not:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("The entered no is Palindrome.");
        } else {
            System.out.println("The entered no is not Palindrome.");
        }
    }
}
