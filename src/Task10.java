/**
 * Дана строка. Если она начинается на 'abc',
 * то заменить их на 'www',
 * иначе добавить в конец строки 'zzz'.
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();
        if(s.startsWith("abc")) {
           s = s.replaceFirst("abc", "www");
        } else {
            s += "zzz";
        }
        System.out.println(s);
    }
}
