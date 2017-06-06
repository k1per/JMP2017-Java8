package com.epam.learning.aykorenev.java8.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

/*

Create several instances of Runnable interface with different implementation using lambda expressions. Use them with threads.
        1.Create:
        ◦a Person class with name and age fields;
◦an array of Persons;
        ◦two instances of Comparator<Person> interface using lambda expressions: first one for comparing by name, second one – by age;
        ◦Then sort them using these comparators;
        ◦Use forEach method for printing information about all the persons. Use the method reference;
        2.Implement each of main Java Standard Library functional interfaces (supplier, predicate etc.) using lambda expressions.
        3.Create your own functional interface and add several its implementations using both lambda expressions and inner anonymous classes.
        4.Add few default methods to it and use them.
        5.Add few static methods to it and use them.
*/
public class Task1 {

    public static void main(String[] args) {
	    Runnable one = () -> System.out.println("Hello world");
	    Runnable two = () ->
                Stream.of(new Person("Red Crocodile", 22), new Person("Blue Crocodile", 25)).
                        sorted(comparing(Person::getAge).thenComparing(Person::getName)).
                        filter(person -> person.getName().equals("Blue Crocodile")).
                        map(Person::getName).
                        forEach(System.out::println);

        String reversedName = reversed("YellowCrocodile", input -> new StringBuilder(input).reverse().toString());
        String reversedFirstThree = reversed("George", input -> new StringBuilder(input).reverse().toString());

        Map<String, Character> hashMap = new HashMap();
        hashMap.put("Hehe", 'a');
        hashMap.put("Hoho", 'b');
        hashMap.entrySet().forEach(stringCharacterEntry ->
                System.out.println(Reversable.appendCharcharterToEnd(stringCharacterEntry.getKey(),stringCharacterEntry.getValue())));

        new Thread(one).start();
        new Thread(two).start();
        System.out.println(reversedName);
        System.out.println(reversedFirstThree);
    }

    private static String reversed(String name, Reversable reversable){
        if(name.equals("George")){
            return reversable.reverseFirstThreeLetters(name);
        }
        return reversable.reverse(name);
    }


}
