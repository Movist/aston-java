package org.example.homeworkThree;

import static org.example.homeworkThree.FileManager.readFromFile;
import static org.example.homeworkThree.FileManager.writeToFile;

public class Main {
    public static void main(String[] args) {
        String filename = "file.txt";
        String textToWrite = "Данные для записи";

        try {
            writeToFile(filename, textToWrite);
            System.out.println("Данные записаны в файл " + filename);

            String content = readFromFile(filename);
            System.out.println("Содержимое файла:");
            System.out.println(content);
        } catch (FileProcessingException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
