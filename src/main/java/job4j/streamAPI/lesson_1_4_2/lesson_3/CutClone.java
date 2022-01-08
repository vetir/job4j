package job4j.streamAPI.lesson_1_4_2.lesson_3;

import java.util.ArrayList;
import java.util.List;

public class CutClone {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Stepan");
        names.add("Petrucho");
        names.add("Ivan");
        names.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
