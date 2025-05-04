package org.example.homeworkThree;

import java.io.*;

public class FileManager {
    public static void writeToFile(String filename, String data) throws FileProcessingException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(data);
        } catch (IOException e) {
            throw new FileProcessingException("Ошибка при записи в файл: " + filename, e);
        }
    }

    public static String readFromFile(String filename) throws FileProcessingException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new FileProcessingException("Ошибка при чтении из файла: " + filename, e);
        }
        return result.toString();
    }
}
