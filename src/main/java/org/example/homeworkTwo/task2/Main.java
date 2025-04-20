package org.example.homeworkTwo.task2;

import java.util.List;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Иван", Arrays.asList(
                        new Book("Джером Сэлинджер «Над пропастью во ржи»", 212, 2007),
                        new Book("Харуки Мураками «Норвежский лес»", 363, 1994),
                        new Book("Алексей Иванов «Общага-на-Крови»", 152, 2005),
                        new Book("Лорен Оливер «Прежде чем я упаду»", 477, 2010),
                        new Book("Эллен Том, Люси Ивисон «Первокурсники»", 456, 2018))),
                new Student("Игорь", Arrays.asList(
                        new Book("Ася Лавринович «От одного зайца»", 111, 2012),
                        new Book("Анна Джейн «Мой идеальный смерч»", 323, 1996),
                        new Book("Донна Тартт «Тайная история»", 486, 1990),
                        new Book("Орхан Памук «Новая жизнь»", 290, 2015),
                        new Book("Павел Санаев «Хроники Раздолбая. Похороните меня за плинтусом-2»", 704, 1984))),
                new Student("Лена", Arrays.asList(
                        new Book("Джером Сэлинджер «Над пропастью во ржи»", 212, 2007),
                        new Book("Харуки Мураками «Норвежский лес»", 363, 1994),
                        new Book("Алексей Иванов «Общага-на-Крови»", 152, 2005),
                        new Book("Орхан Памук «Новая жизнь»", 290, 2015),
                        new Book("Павел Санаев «Хроники Раздолбая. Похороните меня за плинтусом-2»", 704, 1984)))
        );

        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(book -> Optional.of(book.getYear()))
                .forEach(yearOptional -> yearOptional
                        .ifPresentOrElse(
                                year -> System.out.println("Год выпуска книги: " + year),
                                () -> System.out.println("Книга не найдена")
                        ));
    }
}