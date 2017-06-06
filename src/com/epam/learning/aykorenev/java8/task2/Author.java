package com.epam.learning.aykorenev.java8.task2;

import java.util.List;

/**
 * Created by k1per on 06.06.2017.
 */
public class Author {
    private String name;
    private short age;
    private List<Book> bookList;

    public Author(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public Author(String name, short age, List<Book> bookList) {
        this.name = name;
        this.age = age;
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bookList=" + bookList.size() +
                '}';
    }
}
