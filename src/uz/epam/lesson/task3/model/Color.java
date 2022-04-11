package uz.epam.lesson.task3.model;

import java.util.Random;

public enum Color {
    BLACK,WHITE,GREY;

    public static Color getRandom() {
        Color[] color = Color.values();
        return color[new Random().nextInt(3)];
    }
}
