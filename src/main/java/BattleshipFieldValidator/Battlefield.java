package BattleshipFieldValidator;

public class Battlefield {
    public static int battleship;
    public static int cruisers;
    public static int destroyers;
    public static int sub;
    public static int currentShip;

    public static int[][] fieldBig = new int[12][12];

    public static int findShip(int x, int y) {
        if (!checkDiagonals(x, y)) {
            return -1;
        }
        fieldBig[x][y] = 0;
        currentShip += 1;
        if (fieldBig[x + 1][y] == 1) {
            findShip(x + 1, y);
        } else if (fieldBig[x][y + 1] == 1) {
            findShip(x, y + 1);
        }
        return currentShip;
    }

    public static boolean checkDiagonals(int x, int y) {
        return fieldBig[x + 1][y + 1] == 0 && fieldBig[x + 1][y - 1] == 0 && fieldBig[x - 1][y - 1] == 0 && fieldBig[x - 1][y + 1] == 0;
    }

    public static boolean fieldValidator(int[][] field) {
        battleship = 1;
        cruisers = 2;
        destroyers = 3;
        sub = 4;
        currentShip = 0;

        for (int i = 0; i < field.length; i++) {
            System.arraycopy(field[i], 0, fieldBig[i + 1], 1, field.length);
        }

        for (int y = 1; y <= field.length; y++) {
            for (int x = 1; x <= field.length; x++) {
                if (fieldBig[x][y] == 0) {
                    continue;
                } else {
                    currentShip = 0;
                    switch (findShip(x, y)) {
                        case -1:
                            return false;
                        case 1:
                            sub -= 1;
                            break;
                        case 2:
                            destroyers -= 1;
                            break;
                        case 3:
                            cruisers -= 1;
                            break;
                        case 4:
                            battleship -= 1;
                            break;
                    }
                    currentShip = 0;
                }
            }
        }

        return sub == 0 && cruisers == 0 && destroyers == 0 && battleship == 0;
    }
}