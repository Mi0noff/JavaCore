package arrays;

import java.util.Arrays;

public class FirstArrayTask {

    /**
     * Данный метод возвращает количество четных чисел в массиве, массив передается в параметрах метода
     * @param array массив чисел
     * @return количество четных чисел в массиве
     */

    public static boolean isSuccess(int array) {
        return array % 2 == 0;
    }

    public static int getCountEvenNumbers(int [] array) {

        int completeResult = 0;
        for (int value : array) {
            if (FirstArrayTask.isSuccess(value)) {
                completeResult++;
            }
        }
        return completeResult;

    }
}
