package uz.epam.lesson.task3.service;

import uz.epam.lesson.task3.model.Ball;
import uz.epam.lesson.task3.model.Card;
import uz.epam.lesson.task3.model.Color;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CardCreator {
    private File file;

    public CardCreator() {
    }

    public CardCreator(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Card getCard() throws Exception {
        Scanner scanner = new Scanner(file);
        Card card = new Card();
        while (scanner.hasNext()) {
            String ball = scanner.nextLine();
            String[] ballDetails = ball.split(" ");
            Color color = Color.valueOf(ballDetails[0]);
            double weight = Double.parseDouble(ballDetails[1]);
            card.addBall(new Ball(color, weight));
        }
        return card;
    }
}
