package CheckingGtroups;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Groups {
    public static boolean groupCheck(String s) {
        Map<Character, Character> brace = new HashMap<>();
        brace.put('(', ')');
        brace.put('[', ']');
        brace.put('{', '}');

        Deque<Character> que = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (brace.containsKey(c)) {
                que.addLast(c);
            } else if (que.isEmpty()) {
                return false;
            } else if (brace.containsValue(c)) {
                if (brace.get(que.getLast()).equals(c)) {
                    que.removeLast();
                } else {
                    return false;
                }
            }
        }
        return que.isEmpty();
    }
}