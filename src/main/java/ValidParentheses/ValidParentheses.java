package ValidParentheses;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidParentheses {
    public static boolean validParentheses(String parens) {
        List<String> parentList;
        parentList = Arrays.stream(parens.split(""))
                .filter(x -> x.equals("(") || x.equals(")"))
                .collect(Collectors.toList());
        int counter = 0;
        for (String string : parentList) {
            if (string.equals("(")) {
                counter++;
            } else {
                counter--;
            }
            if (counter < 0) {
                return false;
            }
        }
        return counter == 0;
    }
}
