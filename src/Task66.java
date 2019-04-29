/**
 * Даны две строки.
 * Выделить из каждой строки наибольшей длины подстроки,
 * состоящие только из цифр, и объедините эти подстроки в одну новую строку.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*For example
  str1 qwe000005464qwe10000
  str2 qwe0000000000033fdffd5000
  result must be 0000054640000000000033
*/
public class Task66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first string");
        String[] s1 = in.nextLine().split("\\D");
        System.out.println("Enter second string");
        String[] s2 = in.nextLine().split("\\D");

        ArrayList<String> numbers1 = new ArrayList<>();
        ArrayList<String> numbers2 = new ArrayList<>();

        for (String word : s1) {
            numbers1.add(word);
        }

        for (String word : s2) {
            numbers2.add(word);
        }


        String max = Collections.max(numbers1, Comparator.comparing(s -> s.length())) +
                     Collections.max(numbers2, Comparator.comparing(s -> s.length()));

        System.out.println(max);

    }
}
