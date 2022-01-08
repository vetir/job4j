package job4j.streamAPI.listToMap;

import job4j.streamAPI.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {



    public static void main(String[] args) {
    List<Student> listStudent = List.of(
                new Student(10, "Surname1"),
                new Student(40, "Surname4"),
                new Student(50, "Surname5"),
                new Student(70, "Surname7"),
                new Student(50, "Surname7"),
                new Student(50, "Surname7"),
                new Student(90, "Surname9")
    );
    Map<String, Student> mapStudent = listStudent.stream()
            .collect(Collectors.toMap(
                    Student::getSurname,
                    x1 -> x1,
                    (x1,x2) -> x1
            ));
        System.out.println(mapStudent);
    }
}
