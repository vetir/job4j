package job4j.streamAPI.lesson_1_4_2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MasivToList {

    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
/**
 * Преобразуем через стрим двумерный массив в список:
 */
        System.out.println(
                matrix.stream().flatMap(e -> e.stream()).collect(Collectors.toList())
        );
/**
 * Лямбду можно заменить ссылкой на метод, тогда этот код можно будет записать так:
 */
        System.out.println(
                matrix.stream().flatMap(List::stream).collect(Collectors.toList())
        );

/**
 * Задание.
 *
 * 1. Создайте матрицу Integer[][].
 *
 * 2. Напишите преобразование этой матрицы в список чисел.
 *
 * 3. При решении этой задачи нужно использовать методы flatMap(), collect(), Stream.of().
 *
 * 4. Реализуйте описанную выше логику в методе, который на вход принимает двумерный массив Integer[][].
 * На реализованный метод напишите тесты.
 *
 * 5. Загрузите код в репозиторий, оставьте ссылку на коммит.
 *
 * 6. Переведите ответственного на Петра Арсентьева.
 */

//        Integer[][] multiplex = new Integer[5][7];
        Integer[][] multiplex = new Integer[][]{{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10, 12, 14}};

/**
 * Стрим, который преобразует двумерный массив в список:
 */
        System.out.println(Arrays.stream(multiplex).flatMap(e -> Arrays.stream(e)).collect(Collectors.toList()));
/**
* Лямбду можно заменить ссылкой на метод, тогда этот код можно будет записать так:
*/
        MasivToList masivToList = new MasivToList();
        System.out.println(masivToList.convert(multiplex));
    }
        public List<Integer> convert(Integer[][] multiplex) {
                return Stream.of(multiplex).flatMap(Arrays::stream).collect(Collectors.toList());
        }
}
