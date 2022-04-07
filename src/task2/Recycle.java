package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Recycle {
    private final List<Ball> balls;

    public Recycle() {
        this.balls = new ArrayList<>();
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void addBall(Ball ball){
        if (ball != null)
            balls.add(ball);
    }

    private Stream<Ball> getStreamByColor(Color color) {
        return balls.stream()
                .filter(ball -> ball.getColor().equals(color));
    }

    public double getWeightByColor(Color color) {
        return getStreamByColor(color)
                .mapToDouble(Ball::getWeight).sum();
    }

    public long getQuantityByColor(Color color){
        return getStreamByColor(color)
                .count();
    }


}
