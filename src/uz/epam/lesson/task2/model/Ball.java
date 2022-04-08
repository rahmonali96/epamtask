package uz.epam.lesson.task2.model;

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
    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}
