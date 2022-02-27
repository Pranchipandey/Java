package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "";
        sc.close();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);

        }
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reverse);
    }
}
