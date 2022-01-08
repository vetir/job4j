package sbercraft;

import java.util.Arrays;

/**
 * Написать метод encode таким образом чтоб он изменял каждое слово в строке таким образом чтоб
 * первую букву каждого ставил в конец и добавлял к слову "оп"
 */
public class Solution_3 {
    /**
     * Реализуйте метод encode
     */
    public static void main(String[] args) {
        System.out.println(encode("собака кошка"));
    }
    public static String encode(String text) {
        // Напишите ваш код здесь...
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] letters = words[i].toCharArray();
            char firstLetter = letters[0];
            words[i] = words[i].substring(1);
            words[i] = words[i] + firstLetter + "on";
        }

        String delimiter = " ";
        return String.join(delimiter, words);
    }

    public static void runCode() {
        // Данный метод будет вызван из метода main
        // Вы можете писать здесь произвольный код для дебага вашего кода
    }
}
