package branchoperators.bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Базовые элементы бота
 * Выводит на экран сообщения при вводе значения от 1 до 3, иначе - отключается
 */

public class TelegramBotBasic {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter number please.. only number from 1 to 3");
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int number = 0;
            try {
                number = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {
                bufferedReader.close();
                break;
            }

            if (number == 1) {
                System.out.println("Hello"); }
            else if (number == 2) {
                System.out.println("Buy");}
            else if (number == 3) {
                System.out.println("What?");}
            else {
                System.out.println("I don't understand you, I'm turning off");
                bufferedReader.close();
                break;
            }

        }
    }
}
