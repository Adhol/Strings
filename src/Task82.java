import java.util.Scanner;

public class Task82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = in.nextLine();

        System.out.println(s.replaceAll("/\\*.*\\*/", " "));
    }
}
