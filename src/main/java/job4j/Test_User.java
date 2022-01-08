package job4j;

import com.carrotsearch.sizeof.RamUsageEstimator;

import static com.carrotsearch.sizeof.RamUsageEstimator.sizeOf;

public class Test_User {
    public static void main(String[] args) throws Throwable {
        User user1 = new User(25, "Ivan", 'm', 1000);
        User user2 = new User(27, "Vasya", 'm', 2000);
        User user3 = new User();
        User user4 = new User("Vova", "Ivanov");

//        for (int i = 0; i <= 400000; i++) {
//            System.out.println(new job4j.User(25, "Ivan", 'm', 1000) + "counter - " + i);
//            System.out.println(new job4j.User() + "counter - " + i);
//        }

        System.out.println("Размер объекта с двумя полями ссылочного типа занимает в памяти - " + RamUsageEstimator.sizeOf(user4) + "байт.");
        System.out.println(RamUsageEstimator.sizeOf(user1));
//        System.out.println(sizeOf(user2));
        System.out.println(RamUsageEstimator.sizeOf(user3));
//        System.out.println("Размер int у юзера1: - " + sizeOf(user1.getAge()));
//        System.out.println("Размер string у юзера1: - " + sizeOf(user1.getName()));
//        System.out.println("Размер char у юзера1: - " + sizeOf(user1.getSex()));
//        System.out.println("Размер int у юзера1: - " + sizeOf(user1.getSalary()));

//        System.out.println("Запускаем метод файналайз");
//        user1.finalize();
//        System.out.println("Метод файналайз отработал");
//
//        System.out.println("Размер пустого объекта: - " + sizeOf(user3));
    }
}
