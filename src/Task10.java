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
        if(s.charAt(0) == 'a' & s.charAt(1) == 'b' & s.charAt(2) == 'c') {
           s = s.replace("abc", "www");
        } else {
            s += "zzz";
        }
        System.out.println(s);
    }
}
