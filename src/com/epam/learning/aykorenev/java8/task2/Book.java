package com.epam.learning.aykorenev.java8.task2;

import java.util.List;

/**
 * Created by k1per on 06.06.2017.
 */
public class Book {

    private String title;
    private List<Author> authorList;
    private int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public Book(String title, List<Author> authorList, int numberOfPages) {
        this.title = title;
        this.authorList = authorList;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorList=" + authorList.size() +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
