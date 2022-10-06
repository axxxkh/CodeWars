package TankTruck;

public class VolTank {
    public static int tankVol(int h, int d, int vt) {
        double r = (double) (d) / 2;
        double length = vt / (Math.PI * r * r);
        double c = Math.sqrt(r * r - Math.pow((r - h), 2));
        double triangleSq = c * (r - h);
        double angle = 2 * Math.acos((r - h) / r);
        double sectorSq = angle * r * r / 2;
        int tankLeft = (int) ((sectorSq - triangleSq) * length);

        return tankLeft;
    }
}
