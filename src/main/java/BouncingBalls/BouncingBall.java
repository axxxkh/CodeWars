package BouncingBalls;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {

        if ((h <= window) || (h <= 0) || bounce <= 0 || bounce >= 1) {
            return -1;
        } else {
            int n = 1;
            h = h * bounce;
            while (h > window) {
                n += 2;
                h = h * bounce;
            }
            return n;
        }
    }
}