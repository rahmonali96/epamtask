package uz.epam.lesson.task4.service;

import uz.epam.lesson.task4.model.Ball;
import uz.epam.lesson.task4.model.Card;
import uz.epam.lesson.task4.model.Color;

import java.util.ArrayList;
import java.util.List;

public class CardCreator {
    public Card createBallsFromList(List<String> balls) {
        List<Ball> balls1 = new ArrayList<>();
        Card card = new Card();
        for (String ball : balls) {
            if (ball != null && !ball.trim().isEmpty()) {
                String[] strings = ball.split(" ");
                try {
                    Color color = Color.valueOf(strings[0]);
                    double weight = Double.parseDouble(strings[1]);
                    balls1.add(new Ball(color, weight));
                } catch (IllegalArgumentException ignored) {
                    System.out.println("Illegal argument: " + strings[0] + " : " + strings[1]);
                }
            }
        }
        card.setBalls(balls1);
        return card;
    }
}
