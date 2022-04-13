package uz.epam.lesson.task4;

import uz.epam.lesson.task4.model.Card;
import uz.epam.lesson.task4.model.Color;
import uz.epam.lesson.task4.service.CardCreator;
import uz.epam.lesson.task4.service.CardService;
import uz.epam.lesson.task4.service.DataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader(new File("ball.txt"));
        try {
            List<String> list = dataReader.extractText();
            CardCreator cardCreator = new CardCreator();
            Card card = cardCreator.createBallsFromList(list);
            CardService cardService = new CardService(card);
            System.out.println(cardService.getQuantityByColor(Color.BLACK));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
