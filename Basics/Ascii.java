public class Ascii {
    public static void main(String[] args) {
        System.out.println("The Ascii characters are:");
        for (char i = 65; i <= 90; i++) {

            System.out.print(i);
        }
        System.out.println(" ");
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
    }
}
