package uz.epam.lesson.task4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Card {
    private List<Ball> balls;

    public Card() {
    }

    public Card(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        return balls != null ? balls.equals(card.balls) : card.balls == null;
    }

    @Override
    public int hashCode() {
        return balls != null ? balls.hashCode() : 0;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Card.class.getSimpleName() + "[", "]")
                .add("balls=" + balls)
                .toString();
    }
}
