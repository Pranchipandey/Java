import java.util.Scanner;

public class DivideStringInNequalParts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        System.out.println("enter no of parts of the string");
        int n = sc.nextInt();
        int index = 0;
        int chars = str.length() / n;
        String words[] = new String[n];
        if (str.length() % n != 0) {
            System.out.println("the given string can't be divided in " + n + " equal parts.");

        }
        for (int i = 0; i < str.length(); i = i + chars) {
            String parts = str.substring(i, i + chars);
            words[index] = parts;
            index++;

        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        sc.close();
    }
}
