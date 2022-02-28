import java.util.*;

public class DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String s = sc.nextLine();
        int count;
        s = s.toLowerCase();
        String words[] = s.split(" ");
        System.out.println("duplicate words in the given String :");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    // Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
        sc.close();
    }
}
