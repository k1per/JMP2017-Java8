package com.epam.learning.aykorenev.java8.task3;

/**
 * Created by k1per on 07.06.17.
 */
@FunctionalInterface
public interface Calculatetable {
        double calculateTaxes(int income, double subsidy, int numberOfChildren);
}
