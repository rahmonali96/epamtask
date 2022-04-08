package uz.epam.lesson.task2.model;

import java.util.Random;

public enum Color {
    BLACK,WHITE, GREY;

    public static Color getRandom() {
        Color[] color = Color.values();
        return color[new Random().nextInt(3)];
    }
}
