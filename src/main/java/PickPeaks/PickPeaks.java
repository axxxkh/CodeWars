package PickPeaks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> returnMap = new HashMap<>();
        List<Integer> posList = new ArrayList<>();
        List<Integer> peekList = new ArrayList<>();
        int[] peaks = new int[arr.length];

        for (int i = arr.length - 1; i > 0; i--) {
            if ((arr[i] < arr[i - 1]) || (arr[i] == arr[i - 1]) && (i + 1 < arr.length) && (peaks[i + 1] == -1)) {
                peaks[i] = -1;
            } else if (arr[i] > arr[i - 1]) {
                peaks[i] = 1;
            } else {
                peaks[i] = 0;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (peaks[i] == -1 && peaks[i - 1] == 1) {
                posList.add(i - 1);
                peekList.add(arr[i - 1]);
            }
        }
        returnMap.put("pos", posList);
        returnMap.put("peaks", peekList);
        return returnMap;
    }
}
