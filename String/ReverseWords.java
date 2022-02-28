import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        ReverseWords rw = new ReverseWords();
        System.out.println("Reverse of a String  is : " + rw.reverse(str));
        sc.close();
    }

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length(); i > 0; i--) {
            r = r + (s.charAt(i - 1));

        }
        return r;

    }
}
