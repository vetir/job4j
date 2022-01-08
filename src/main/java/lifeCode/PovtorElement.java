package lifeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class PovtorElement {
    //Найти первый не повторяющийся элемент в массиве
    //Найти все неповоторяющиеся элементы в массиве
    //Нахождение дублей

    /**
     * Решение через циклы
     */
    public static void main(String[] args) {
//        Integer[] arr = {9, 4, 9, 6, 7, 4, 5, 1, 2, 3, 3, 3, 2, 1};
//        List<Integer> single = new ArrayList<>();
//        List<Integer> dooble = new ArrayList<>();
//        List<Integer> threeble = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                single.add(arr[i]);
//            }
//            if (count == 2 && !dooble.contains(arr[i])) {
//                dooble.add(arr[i]);
//            }
//            if (count == 3 && !threeble.contains(arr[i])) {
//                threeble.add(arr[i]);
//            }
//        }
//        System.out.println("Первый неповторяющийся элемент: " + single.get(0));
//        System.out.println("Все неповторяющиеся элементы: " + single);
//        System.out.println("Все дубли: " + dooble);
//        System.out.println("Все тридубли: " + threeble);
//    }

/**
 * Решение через циклы №2
 */
//        Integer[] arr = {9, 4, 9, 6, 7, 4, 5, 1, 2, 3, 3, 3, 17, 2, 1};
//        List<Integer> single = new ArrayList<>();
//        List<Integer> dooble = new ArrayList<>();
//        List<Integer> threeble = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i].equals(arr[j])) {
//                    count++;
//                }
//            }
//            if (count == 0 && !dooble.contains(arr[i])) {
//                single.add(arr[i]);
//            }
//            if (count == 1 && !dooble.contains(arr[i])) {
//                dooble.add(arr[i]);
//            }
//            if (count == 2 && !threeble.contains(arr[i])) {
//                threeble.add(arr[i]);
//            }
//        }
//        System.out.println("Первый неповторяющийся элемент: " + single.get(0));
//        System.out.println("Все неповторяющиеся элементы: " + single);
//        System.out.println("Все дубли: " + dooble);
//        System.out.println("Все тридубли: " + threeble);
//    }
/**
 * Решение через мапу
 */
//    public static void main(String[] args) {
//        Integer[] arr = {9, 4, 9, 6, 7, 4, 5, 1, 2, 3, 3, 3, 2, 1, 1, 1};
//
//        Map<Integer, Integer> result = new LinkedHashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//
//            result.merge(arr[i], 1, (oldValue, newValue) -> oldValue + 1);
//        }
//        Iterator<Map.Entry<Integer, Integer>> itr = result.entrySet().iterator();
//        while(itr.hasNext()) {
//            Map.Entry<Integer, Integer> entry = itr.next();
//            if(entry.getValue() == 1) {
//                System.out.println(entry.getKey());
//                break;
//            }
//        }
//        System.out.println(result);
//    }

/**
* Решение через Stream
*/
        Integer[] arr = {9, 4, 9, 6, 7, 4, 5, 1, 2, 3, 3, 3, 2, 1, 1, 1};

        List<Integer> result = Arrays.stream(arr)
                .filter(single -> Collections.frequency(List.of(arr), single) == 1)
                .collect(Collectors.toList());
        System.out.println(result.get(0));
        System.out.println(result);
    }
}
