
import java.util.Scanner;

public class CountPunctuation {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == ';' || str.charAt(i) == ',' || str.charAt(i) == '.' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == '?' || str.charAt(i) == ':') {
                count++;
            }
        }
        System.out.println("The number of punctuation are : " + count);
    }
}
