import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] text = str.toCharArray();
        for (int i = text.length-1; i >= 0; i--) {
            System.out.print(text[i]);
        }
    }
}