package JavaPrograms;

import java.util.Scanner;
import java.util.Arrays;

public class StringAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        sc.close();
        s1.toLowerCase();
        s2.toLowerCase();
        if (s1.length() != s2.length()) {
            System.out.println("Given Strings are not anagrams");
        } else {
            char[] str1 = s1.toCharArray();
            char[] str2 = s2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            if (Arrays.equals(str1, str2) == true) {
                System.out.println("Given Strings are anagrams");
            } else {
                System.out.println("Given Strings are not anagrams");
            }
        }
    }
}
