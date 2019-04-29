/**
 * Даны два предложения.
 * Для каждого слова первого предложения определите количество его вхождений во второе предложение.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first string");
        String s1 = in.nextLine().toLowerCase();
        System.out.println("Enter second string");
        String s2 = in.nextLine().toLowerCase();

        String[] words1 = s1.split("\\W");
        String[] words2 = s2.split("\\W");

        Map<String, Integer> result = new HashMap<>();

        for (String str1 : words1) {
            int count = 0;
            for (String str2 : words2) {
                if (str1.equals(str2)) {
                    count++;
                }
            }
            result.put(str1, count);
        }

        for (Map.Entry<String, Integer> pair : result.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
