package HelpYourGranny;

import java.util.Map;

public class HelpYourGranny {
    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {

        String town = null;
        String lastTown = null;
        Double totalDistance = 0.0;
        Double firstDistance = 0.0;
        Double nextDistance = 0.0;

        for (String s : arrFriends) {
            for (String[] towns : ftwns) {
                if (towns[0].equals(s)) {
                    town = towns[1];
                    break;
                }
            }
            if (h.containsKey(town)) {
                if (firstDistance == 0 && nextDistance == 0) {
                    firstDistance = h.get(town);
                    totalDistance += firstDistance;
                } else if (nextDistance == 0) {
                    nextDistance = h.get(town);
                    totalDistance += Math.sqrt(Math.abs(nextDistance * nextDistance - firstDistance * firstDistance));
                } else {
                    firstDistance = nextDistance;
                    nextDistance = h.get(town);
                    totalDistance += Math.sqrt(Math.abs(nextDistance * nextDistance - firstDistance * firstDistance));
                }
                lastTown = town;
                town = null;
            }
        }
        totalDistance += h.get(lastTown);
        return (int) (double) (totalDistance);
    }
}
