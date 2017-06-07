package com.epam.learning.aykorenev.java8.task3;

/**
 * Created by k1per on 07.06.17.
 */
public class PersonData {
    private String name;
    private String surname;
    private int numberOfChildren;
    private int salary;
    private String state;

    public PersonData(String name, String surname, int numberOfChildren, int salary, String state) {
        this.name = name;
        this.surname = surname;
        this.numberOfChildren = numberOfChildren;
        this.salary = salary;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public int getSalary() {
        return salary;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
