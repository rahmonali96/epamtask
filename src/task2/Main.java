package task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Recycle recycle = new Recycle();
        int numberOfBalls = 5;
        for (int i = 0; i < numberOfBalls; i++) {
            recycle.addBall(new Ball(Color.getRandom(), random.nextInt(10)));
        }
        System.out.println(recycle.getBalls());
        System.out.println("Quantity of black balls are " + recycle.getQuantityByColor(Color.BLACK));
        System.out.println("Weight of black balls are: " + recycle.getWeightByColor(Color.BLACK));

    }
}
