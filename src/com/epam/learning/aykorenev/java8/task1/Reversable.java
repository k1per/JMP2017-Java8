package com.epam.learning.aykorenev.java8.task1;

import java.util.function.Function;

/**
 * Created by k1per on 06.06.2017.
 */
@FunctionalInterface
public interface Reversable<T extends String> {
    T reverse(T input);

    default String reverseFirstThreeLetters(String name){
        return new StringBuilder(name.substring(0, 3)).reverse().append(name.substring(3)).toString();
    }

    static String appendCharcharterToEnd(String name, char character){
       return new StringBuilder(name).append(character).toString();
    }
}
