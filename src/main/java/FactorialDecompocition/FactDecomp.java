package FactorialDecompocition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FactDecomp {
    public static String decomp(int n) {
        IntStream range = IntStream.rangeClosed(2, n);
        ArrayList<Integer> factorialRow = new ArrayList<>(range.boxed().collect(Collectors.toList()));
        Map<Integer, Integer> powerRow = new HashMap<>();

        for (int i = factorialRow.size() - 1; i >= 0; i--) {
            for (int j = 0; j < factorialRow.size(); j++) {
                if (factorialRow.get(i) != 1 && factorialRow.get(i) % factorialRow.get(j) == 0) {
                    if (powerRow.containsKey(factorialRow.get(j))) {
                        powerRow.put(factorialRow.get(j), powerRow.get(factorialRow.get(j)) + 1);
                    } else {
                        powerRow.put(factorialRow.get(j), 1);
                    }
                    factorialRow.set(i, factorialRow.get(i) / factorialRow.get(j));
                    j--;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            if (powerRow.containsKey(i)) {
                if (i != 2) {
                    result.append(" * ");
                }
                result.append(i);
                if (powerRow.get(i) > 1) {
                    result.append("^" + powerRow.get(i));
                }
            }
        }
        return result.toString();
    }
}