package WeightForWeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WeightForWeight {
    public static String orderWeight(String strng) {
        if (strng.equals("")) {
            return "";
        }
        String[] strArray = strng.split(" ");
        String[] charArray;
        List<Integer> myList = new ArrayList<>();
        String result = new String();

        Arrays.sort(strArray);

        for (String strings : strArray) {
            charArray = strings.split("");
            myList.add(Arrays.stream(charArray)
                    .mapToInt(x -> Integer.valueOf(x)).sum());
        }

        List<Integer> sortedList = myList.stream()
                .sorted()
                .collect(Collectors.toList());

        for (Integer integer : sortedList) {
            if (!result.equals("")) {
                result += " ";
            }
            result += strArray[myList.indexOf(integer)];
            myList.set(myList.indexOf(integer), 0);
        }
        return result;
    }
}
