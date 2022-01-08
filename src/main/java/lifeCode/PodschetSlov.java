package lifeCode;

import java.util.HashMap;
import java.util.stream.Stream;

public class PodschetSlov {
    public static void main(String[] args) {
/**
 * Подсчет количества слов в предложении через put
 */
//        HashMap<String, Integer> map = new HashMap<>();
//        String str = "stiil were toro were name famele were stiil gere";
//        String[] words = str.split("\\s");
//        for (int i = 0; i < words.length; i++) {
//            if (map.containsKey(words[i])) {
//                map.put(words[i], map.get(words[i]) + 1);
//            } else {
//                map.put(words[i], 1);
//            }
//        }
//        System.out.println(map);

/**
 * Подсчет количества слов в предложении через merge
 */
        HashMap<String, Integer> map = new HashMap<>();
        String str = "stiil were toro were name famele were stiil gere";
        String[] words = str.split("\\s");
        for (int i = 0; i < words.length; i++) {
            map.merge(words[i], 1, (v1, v2) -> v1 + v2);
        }
        System.out.println(map);

/**
 * Перевод символов в верхний регистр
 */
        Stream.of(1L).map(x -> {
            throw new RuntimeException();
        });

        Stream.of("a", "b", "c")
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .anyMatch("C"::equals);


        String str1 = "beautiful beach";
        char[] carray1 = str.toCharArray();
        System.out.println("The string is:" + str1);
        System.out.println("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray1[i] == carray1[j]) {
                    System.out.print(carray1[j] + " ");
                    break;
                }
            }
        }
    }
}
