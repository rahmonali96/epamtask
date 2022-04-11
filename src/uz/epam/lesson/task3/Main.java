package uz.epam.lesson.task3;

import uz.epam.lesson.task3.model.Color;
import uz.epam.lesson.task3.service.CardCreator;
import uz.epam.lesson.task3.service.CardService;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\Projects\\epamtask1\\src\\uz\\epam\\lesson\\task3\\ball.txt");
        CardCreator cardCreator = new CardCreator(file);
        try {
            CardService cardService = new CardService(cardCreator.getCard());
            System.out.println(cardService.getWeightByColor(Color.BLACK));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
