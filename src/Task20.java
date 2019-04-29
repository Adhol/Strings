/**
 * Удалить в строке все лишние пробелы,
 * то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();

        s = s.replaceAll("\\s+", " ");
        s = s.trim();

        System.out.println(s);
    }
}
