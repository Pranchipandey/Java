package JavaPrograms;

import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int vowels = 0, consonant = 0;
        s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'u') {
                vowels++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                consonant++;
            }

        }
        System.out.println("No. of vowels : " + vowels);
        System.out.println("No. of consonant : " + consonant);

    }
}
