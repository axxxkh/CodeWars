package ValidBraces;

import java.util.*;
import java.util.stream.Collectors;

public class ValidBraces {
    public static boolean isValid(String braces) {
        Map<String, String> brace = new HashMap<>();
        brace.put("(", ")");
        brace.put("[", "]");
        brace.put("{", "}");

        List<String> bracesList = Arrays.stream(braces.split("")).collect(Collectors.toList());
        Deque<String> que = new LinkedList<>();

        for (String s : bracesList) {
            if (brace.containsKey(s)) {
                que.addLast(s);
            } else if (brace.containsValue(s)) {
                if (brace.get(que.getLast()).equals(s)) {
                    que.removeLast();
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid2(String braces) {
        Map<Character, Character> brace = new HashMap<>();
        brace.put('(', ')');
        brace.put('[', ']');
        brace.put('{', '}');

        Deque<Character> que = new LinkedList<>();

        for (char c : braces.toCharArray()) {
            if (brace.containsKey(c)) {
                que.addLast(c);
            } else if (brace.containsValue(c)) {
                if (brace.get(que.getLast()).equals(c)) {
                    que.removeLast();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
