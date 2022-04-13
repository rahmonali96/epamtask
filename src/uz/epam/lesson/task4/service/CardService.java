package uz.epam.lesson.task4.service;

import uz.epam.lesson.task4.model.Ball;
import uz.epam.lesson.task4.model.Card;
import uz.epam.lesson.task4.model.Color;

import java.util.stream.Stream;

public class CardService {
    private Card card;

    public CardService() {
    }

    public CardService(Card card) {
        this.card = card;
    }

    public double getWeightByColor(Color color) {
        return getStreamByColor(color)
                .mapToDouble(Ball::getWeight).sum();
    }

    public long getQuantityByColor(Color color){
        return getStreamByColor(color)
                .count();
    }

    private Stream<Ball> getStreamByColor(Color color) {
        return card.getBalls().stream()
                .filter(ball -> ball.getColor().equals(color));
    }
}
