package job4j.streamAPI.lesson_1_4_2.lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.util.Collections.unmodifiableList;

/**
 * https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CopyOnWriteArrayList.html
 */
public class TestCopy {

    public static void main(String[] args) {

////        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(5, 7, 9));
//        List<Integer> list = new ArrayList<>(Arrays.asList(5, 7, 9));
////        list.remove(0);
//        list.set(0, 10);
////        list.add(11);
//        System.out.println(list);
//
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            Integer iterator1 = iterator.next();
//            list.add(11);
//        }
//        System.out.println(list);

//        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list1.set(0, 7);
        list1.add(12);
        System.out.println(list1);

        List<Integer> list2 = Collections.unmodifiableList(list1);
        System.out.println(list2);

//        Thread first = new Thread(
//                () -> list.set(0, 3)
//        );
//        first.start();
//        try {
//            first.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(list);
//        System.out.println();

//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(7);
//        list.add(9);
////        list.remove(0);
//        System.out.println(list);
//        Thread first = new Thread(
//                () -> list.add(0, 3)
//        );
//        first.start();
//        try {
//            first.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(list);
    }
}
