package lifeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Трансформировать строку "ndotabonbtnntnoaobtno" таким образом, чтобы символы были уникальны
 * и отсортированны по количеству повторений в исходной строке (от большего к меньшему).
 */
public class UnicSimvol {
    public static String str = "ndotabonbtnntnoaobtno";

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map1 = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.merge(String.valueOf(str.charAt(i)), 1, (Integer::sum));
        }

        String result = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue()
                .reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.joining());

        System.out.println(result);

//        map.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer> comparingByValue()
//                .reversed())
//                .forEach(System.out::println);
    }
}
