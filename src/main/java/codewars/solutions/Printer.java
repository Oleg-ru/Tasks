package codewars.solutions;

import java.util.ArrayList;
import java.util.List;


/*
ЛУЧШЕ решение
return s.replaceAll("[a-m]", "").length() + "/" + s.length();
 */
public class Printer {

    public static void main(String[] args) {
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
    }

    /**
     *
     * @param s Used colors
     * @return String.format type '0/14'
     */
    public static String printerError(String s) {
        int countErrors = 0;
        int lengthColors = s.length();

        StringBuilder sb = new StringBuilder(s);
        List<String> listStr = new ArrayList<>();
        for (int i = 0; i < sb.length(); i++) {
            listStr.add(sb.charAt(i) + "");
        }

        for (String listVal : listStr) {
            if (!searchTrueListChars().contains(listVal)) {
                countErrors++;
            }
        }
        return String.format("%d/%d",countErrors, lengthColors);
    }
    /**
     * Search for allowed colors/
     * Поиск разрешенных цветов
     * @return list these chars
     */
    public static String searchTrueListChars() {
        //Searching "abcdefghijklm"
        byte[] abc = new byte[13];
        for (int i = 65, j = 0; i < 78; i++, j++) {
            abc[j] = (byte) i;
        }
        StringBuilder str = new StringBuilder();
        for (byte b : abc) {
            str.append((char) b);
        }
        str = new StringBuilder(str.toString().toLowerCase());
        return str.toString();
    }
}