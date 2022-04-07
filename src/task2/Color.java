package task2;

import java.util.Random;

public enum Color {
    BLACK,WHITE, GREY;

    public static Color getRandom() {
        Color[] color = Color.values();
        return color[new Random().nextInt(3)];
    }
}
