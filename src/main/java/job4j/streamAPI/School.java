package job4j.streamAPI;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> rsl;
        return rsl = students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }
}
