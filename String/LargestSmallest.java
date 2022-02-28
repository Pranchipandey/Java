import java.util.*;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String s = sc.nextLine();

        String words[] = s.split(" ");
        String smallest = " ";
        String longest = "";
        int smallestLen = Integer.MAX_VALUE;
        int longestLen = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int len = word.length();
            if (len > longestLen) {
                longest = word;
                longestLen = len;
            }
            if (len > smallestLen) {
                smallest = word;
                smallestLen = len;
            }

        }
        System.out.println("Smallest word in a string : " + smallest);
        System.out.println("Longest word in a string : " + longest);
        sc.close();
    }
}
