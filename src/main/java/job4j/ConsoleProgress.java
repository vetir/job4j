package job4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleProgress implements Runnable {

    public static void main(String[] args) {
        Thread progress = new Thread(new ConsoleProgress());
        progress.start();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        progress.interrupt();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            List<String> process = new ArrayList<>(Arrays.asList("|", "/", "--", "\\"));
            for (int i = 0; i < 4; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
//                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                System.out.print("\r Load: process " + process.get(i));
            }
        }
    }
}
