package lifeCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestEpam {
    public static void main(String[] args) {
        int[] arr = {4, 1, 8, 1, 6};
        TestEpam testEpam = new TestEpam();
        System.out.println(Arrays.toString(testEpam.test(arr, 10)));
    }

//    public int[] test(int[] arr, int sum) {
//        int[] result = new int[2];
//        Set<Integer> resultSet = new HashSet<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (!resultSet.contains(sum - arr[i])) {
//                resultSet.add(arr[i]);
//            } else {
//                result[0] = sum - arr[i];
//                result[1] = arr[i];
//                break;
//            }
//        }
//        return result;
//    }

    /**
     * Решение через два цикла
     */
    public int[] test(int[] arr, int sum) {
        for (int i  = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return null;
    }

}
