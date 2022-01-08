package lifeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropChisla {
    public static void main(String[] args) {
        // Раскоментировать для решения через циклы
        //printMissingNumbers(new int[]{2, 3, 6}, 8); // [1,4,5,7,8]
//===============================================
        // Раскоментировать для решения через коллекции
        printMissingNumbers(new Integer[]{2, 3, 6}, 8); // [1,4,5,7,8]
    }

    static void printMissingNumbers(Integer[] numbers, int count) {
        // Раскоментировать для решения через циклы
        //int[] missing = getMissingNumbers(numbers, count);
//===============================================
        // Раскоментировать для решения через коллекции
        Integer[] missing = getMissingNumbers(numbers, count);

        System.out.println(String.format("Пропущенные числа до %d: %s  в массиве %s"
                , count, Arrays.toString(missing), Arrays.toString(numbers)));
    }

    /**
     *
     * Решение через обычные циклы
     *
     */
//    static int[] getMissingNumbers(int[] numbers, int count) {
//        int[] propChisla = new int[count - numbers.length];
//        int counter = 0;
//        int counterMasCount = 0;
//
//        for (int i = 0; i < propChisla.length; i++) {
//            counterMasCount++;
//            for (int j = 0; j < numbers.length; j++) {
//                if (counterMasCount == numbers[j]) {
//                    counter++;
//                }
//                if (j == numbers.length - 1 && counter == 0) {
//                    propChisla[i] = counterMasCount;
//                }
//                if (j == numbers.length - 1 && counter > 0) {
//                    counter = 0;
//                    i--;
//                }
//            }
//        }
//        return propChisla;
//    }

    /**
     * Решение через коллекции
     */
//    static Integer[] getMissingNumbers(Integer[] numbers, int count) {
//        ArrayList<Integer> numbersList = new ArrayList<>(List.of(numbers));
//
//        List<Integer> countList = new ArrayList<>() {
//            {
//                for (int i = 0; i < count; i++) {
//                    add(i + 1);
//                }
//            }
//        };
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < countList.size(); j++) {
//                if (numbersList.get(i).equals(countList.get(j))) {
//                    countList.remove(j);
//                }
//            }
//        }
//        return countList.toArray(new Integer[countList.size()]);
//    }
    /**
     * Элегантное решение через коллекции
     */
    static Integer[] getMissingNumbers(Integer[] numbers, int count) {
        ArrayList<Integer> numbersList = new ArrayList<>(List.of(numbers));

        List<Integer> countList = new ArrayList<>() {
            {
                for (int i = 0; i < count; i++) {
                    add(i + 1);
                }
            }
        };

        countList.removeAll(numbersList);
        return countList.toArray(new Integer[countList.size()]);
    }
}
