package sbercraft;

public class Solution1_1 {
    /**
     * Реализуйте метод brokenDevice
     */
    public static int brokenDevice(int x, int y) {
        // – Почти дописал эту функцию. Пока непонятно как это работает, надо не забыть переписать.

        // – Черт, что я тут написать то хотел, говорил мне ПМ: пиши документацию. Напишу завтра после рейса в Нарнию

        // – Не стоит трогать эту магию: один раз долетел, значит и всегда долетит

        int ans = 0;
        while (y > x + 1) {
            if (y % 2 == 0) {
                y += 1;
                x += 1;
            } else {
                y /= 2;
            }
        }
        return ans + x - y;
        // – Так, кто там будет это править - кажется я напортачил, беру парашют и прыгаю, всем пока
    }

    public static void runCode() {
        // Данный метод будет вызван из метода main
        // Вы можете писать здесь произвольный код для дебага вашего кода
    }
}
