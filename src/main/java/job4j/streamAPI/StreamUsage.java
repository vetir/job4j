package job4j.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", spent=" + spent +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);

        List<String> names = tasks.stream().map(
                task -> task.name
        ).collect(Collectors.toList());
        names.forEach(System.out::println);

        Long total = tasks.stream().map(
                        task -> task.spent)
                .reduce(0L, Long::sum);
        System.out.println(total);

/**
 * 1. Создайте ArrayList. Заполните его числами Integer.
 * 2. Получите из ArrayList поток данных. Отфильтруйте поток так, чтобы в нем остались только положительные числа.
 * 3. Отфильтрованный поток запишите в List.
 */
        List<Integer> integers = new ArrayList<>(Arrays.asList(-5, 7, 9, 0, -12, -3, 9));
        List<Integer> polChisla = integers.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());

        System.out.println(polChisla);

    List<Task> tasks1 = List.of(
            new Task("Bug #1", 10),
            new Task("Task #2", 20),
            new Task("Bug #3", 40)
    );
        tasks1.stream()
                .filter(task1 ->task1.name.contains("Bug"))
                .filter(task1 ->task1.spent ==40)
                .map(task1 ->task1.name + " - " +task1.spent)
                .forEach(System.out::println);
    }
}