package DirectionsReduction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        Map<String, Integer> dir = new HashMap<>();
        dir.put("NORTH", 1);
        dir.put("SOUTH", -1);
        dir.put("EAST", 2);
        dir.put("WEST", -2);

        if (arr.length <= 1 || arr == null) {
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if ((dir.get(arr[i]) + dir.get(arr[i + 1])) == 0) {
                arr[i] = null;
                arr[i + 1] = null;
                i++;
            }
        }
        final String[] resultArr = Arrays.stream(arr)
                .filter(Objects::nonNull)
                .toArray(String[]::new);

        if (resultArr.length != arr.length) {
            return dirReduc(resultArr);

        } else {
            return arr;
        }
    }
}