package codewars.solutions;

public class SqEveryDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

    public static int  squareDigits(int n) {
        StringBuilder numberToStr = new StringBuilder(n + "");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberToStr.length(); i++) {
            int numToSquare = Integer.parseInt("" + numberToStr.charAt(i));
            result.append(numToSquare * numToSquare);
        }
        return Integer.parseInt(result.toString());
    }
}
