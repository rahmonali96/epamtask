package uz.epam.lesson.task4.model;

import java.util.StringJoiner;

public class Ball {
    private Color color;
    private double weight;

    public Ball(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Ball() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (Double.compare(ball.weight, weight) != 0) return false;
        return color == ball.color;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color != null ? color.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ball.class.getSimpleName() + "[", "]")
                .add("color=" + color)
                .add("weight=" + weight)
                .toString();
    }
}
