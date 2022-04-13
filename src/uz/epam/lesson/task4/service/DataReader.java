package uz.epam.lesson.task4.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    private File file;

    public DataReader() {
    }

    public DataReader(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public List<String> extractText() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<String> balls = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            balls.add(line);
        }
        return balls;
    }
}
