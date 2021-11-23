package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class L14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abca","abc"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        //Проверить равны ли все элементы в массиве
        boolean checkAll = false;
        String forCheckEqualsAllElementArr = strs[0];
        for (String str : strs) {
            if (str.equals(forCheckEqualsAllElementArr)) {
                checkAll = true;
            } else {
                checkAll = false;
                break;
            }
        }
        if (checkAll) {
            return forCheckEqualsAllElementArr;
        }


        /*
        Маркеры выхода из while
        1. isNoEqualsChar - Если нет совпадений по символам
        2. isArrEqualsSpaceElement - Если в массиве элементы пустые строки, т.е при обращении к элементу сгенерируется
            исключение "ArrayIndexOutOfBoundsException"
         */
        boolean isNoEqualsChar = true;
        boolean isArrEqualsSpaceElement = false;
        String result = "";
        List<Character> list = new ArrayList<>();
        int i = 0;
        while (true) {
            //Добавить в лист поочередно символы 1х 2х и.т.д слов
            for (String word : strs) {
                try {
                    list.add(word.toCharArray()[i]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    isArrEqualsSpaceElement = true;
                    break;
                }
            }
            //Добавил

            if (isArrEqualsSpaceElement) {
                break;
            }


            Character oneChar = list.get(0);
            for (Character character : list) {
                if (oneChar.equals(character)) {
                    continue;
                } else {
                    isNoEqualsChar = false;
                    break;//выход из for
                }
            }
            if (isNoEqualsChar) {
                result += list.get(0);
                i++;
                list = new ArrayList<>();
            } else {
                break;
            }
        }

        return result;
    }
}
