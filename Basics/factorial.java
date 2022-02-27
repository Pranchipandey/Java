import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of a given no is: " + fact);
    }
}
