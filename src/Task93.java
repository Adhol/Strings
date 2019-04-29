import java.util.Scanner;

public class Task93 {
    public static void main(String[] args) {
        concatString();
    }

    private static void concatString() {
        Scanner in = new Scanner(System.in);
        String s = "";
        try {
            System.out.println("Enter number of strings");
            int k = in.nextInt();
            in.nextLine();
            for (int i = 0; i < k; i++) {
                System.out.println("enter string " + (i + 1));
                s += in.nextLine();
            }
            System.out.println(s);
        } catch (java.util.InputMismatchException e) {
            System.out.println("k must be int, try again");
        }

    }
}
