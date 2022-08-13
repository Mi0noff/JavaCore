package hightlevel;

    public class EndsWith {

        /**
         * Данный метод проверяет, что массив word имеет последние элементы, одинаковые с массивом post
         * @param word первый массив
         * @param post второй массив
         * @return одинаковые элементы или нет
         */

        public static boolean getCompirasionElements (char [] word, char [] post) {

            int arrayLengthDifference = word.length - post.length;
            int countCompirasionElements = 0;

            for (int i = 0 + arrayLengthDifference; i < word.length; i++ ) {
                for (int j = 0; j < post.length; j++) {
                    if (word [i] == post [j]) {
                        countCompirasionElements++;
                    }
                }
            }
            if (countCompirasionElements == post.length) {
                return true;
            }
            else {
                return false;
            }
        }
    }