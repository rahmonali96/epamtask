package uz.epam.lesson.task3.model;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private List<Ball> balls;

    public Card() {
        this.balls = new ArrayList<>();
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void addBall(Ball ball){
        if (ball != null)
            balls.add(ball);
    }
}
