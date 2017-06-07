package com.epam.learning.aykorenev.java8.task4;

import com.epam.learning.aykorenev.java8.task2.Author;
import com.epam.learning.aykorenev.java8.task2.Book;
import com.epam.learning.aykorenev.java8.task2.Task2;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import static com.epam.learning.aykorenev.java8.task2.Task2.createAuthors;
import static com.epam.learning.aykorenev.java8.task2.Task2.createBooks;
import static java.util.Arrays.asList;

/**
 * Created by k1per on 07.06.17.
 */
public class Task4 {
    public static void main(String[] args) {
        Author[] authors = createAuthors();
        Book[] books = createBooks();
        Arrays.stream(authors).forEach(author -> author.setBookList(asList(Arrays.copyOfRange(books, 0, ThreadLocalRandom.current().nextInt(1, 3)))));
        Arrays.stream(books).forEach(book -> book.setAuthorList(asList(Arrays.copyOfRange(authors, 0, ThreadLocalRandom.current().nextInt(1, 3)))));

        Map<Integer, Set<Book>> multimap = Arrays.stream(books).collect(Collectors.groupingBy(Book::getNumberOfPages, Collectors.toSet()));
        multimap.forEach((integer, books1) -> {
            System.out.println("Books with number of pages " + integer);
            books1.forEach(book -> System.out.println(book.getTitle()));
        });
    }
}
