package codewars.solutions;

import java.util.ArrayList;
import java.util.List;

public class Persist {

    public static void main(String[] args) {
        //System.out.println(persistence(39));
        System.out.println(persistence(4444));
    }


    public static int persistence(long n) {
        boolean flag = true;
        int count = 0;
        StringBuilder numberIn = new StringBuilder(n + "");
        List<Integer> integerList = new ArrayList<>();
        while (flag) {
            if (numberIn.length() == 1) {
                break;
            }
            for (int i = 0; i < numberIn.length(); i++) {
                int numPastMulti = Integer.parseInt(numberIn.charAt(i) + "");
                integerList.add(numPastMulti);
            }
            int result = 1;
            for (Integer integer : integerList) {
                result *= integer;
            }
            int sizeNumber = String.valueOf(result).length();
            count++;
            if (sizeNumber == 1) {
                flag = false;
            }
            else {
                numberIn = new StringBuilder(result + "");
                integerList = new ArrayList<>();
            }
        }
        return count;
    }
}
