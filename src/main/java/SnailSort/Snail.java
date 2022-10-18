package SnailSort;

public class Snail {
    public static int[] snail(int[][] array) {
        int[] returnArr = new int[array.length * array.length];
        int counter = 0;
        int xStart = 0;
        int yStart = 0;
        int xEnd = array.length - 1;
        int yEnd = array.length - 1;

        if (array[0].length == 0) {
            return new int[0];
        }
        while (counter < returnArr.length - 1) {
            // horizontal walking ->
            for (int i = xStart; i <= xEnd; i++) {
                returnArr[counter++] = array[yStart][i];
            }
            yStart++;
            // vertical walking down
            for (int i = yStart; i <= yEnd; i++) {
                returnArr[counter++] = array[i][xEnd];
            }
            xEnd--;
            //horizontal backwards <-
            for (int i = xEnd; i >= xStart; i--) {
                returnArr[counter++] = array[yEnd][i];
            }
            yEnd--;
            //vertical up
            for (int i = yEnd; i >= yStart; i--) {
                returnArr[counter++] = array[i][xStart];
            }
            xStart++;
        }
        if (array.length % 2 != 0) {
            returnArr[counter] = array[xStart][yStart];
        }
        return returnArr;
    }
}