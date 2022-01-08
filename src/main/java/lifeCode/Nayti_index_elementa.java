package lifeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nayti_index_elementa<T> {
    public static void main(String[] args) {
        Nayti_index_elementa nayti_index_elementa = new Nayti_index_elementa();
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 9, 10, 17, 20));
//        System.out.println(nayti_index_elementa.numberIndex(list, 17));
        System.out.println(nayti_index_elementa.find(list, 20));
    }

    public int numberIndex(List<Integer> list, int element) {
        return list.indexOf(element);
    }

    public static <T> int find(List<T> a, int elem) {
//        List<Object> list = Arrays.asList(a);
//        return list.indexOf(elem);
        return Arrays.asList(a).indexOf(elem);

//            public static <T> int indexOf(T[] arr, T val) {
//                return Arrays.asList(arr).indexOf(val);
//
//            }
    }
}
