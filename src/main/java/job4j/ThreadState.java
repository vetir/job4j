package job4j;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(
                () -> System.out.println(Thread.currentThread().getName()));
        System.out.println(first.getState());
//        Thread second = new Thread(
//                () -> System.out.println(Thread.currentThread().getName()));
        first.start();
        System.out.println(first.getState());

//        first.interrupt ();
        System.out.println(first.interrupted());
//        System.out.println(first.isInterrupted());
        System.out.println("=================");
        System.out.println();
//        second.start();
//        second.join();
        first.join();

        System.out.println("Work done!");
    }
}
