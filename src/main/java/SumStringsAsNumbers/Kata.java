package SumStringsAsNumbers;

public class Kata {
    public static String sumStrings(String a, String b) {
        StringBuilder first = new StringBuilder(a);
        StringBuilder second = new StringBuilder(b);
        StringBuilder result = new StringBuilder();
        int i = 0;
        int sum;
        int firstNum = 0;
        int secondNum = 0;
        int z;
        first.reverse();
        second.reverse();

        while (first.length() > 0 | second.length() > 0) {

            if (first.length() > 0) {
                firstNum = Character.getNumericValue(first.charAt(0));
                first.deleteCharAt(0);
            }

            if (second.length() > 0) {
                secondNum = Character.getNumericValue(second.charAt(0));
                second.deleteCharAt(0);
            }

            sum = firstNum + secondNum + i;
            i = 0;
            if (sum > 9) {
                i = 1;
                sum %= 10;
            }

            firstNum = 0;
            secondNum = 0;

            result.append(sum);
        }

        if (i == 1) {
            result.append(1);
        }

        result.reverse();
        if (result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.toString();

    }
}
