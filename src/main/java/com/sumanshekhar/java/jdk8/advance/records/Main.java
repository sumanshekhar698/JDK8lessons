package com.sumanshekhar.java.jdk8.advance.records;

import java.time.LocalDate;
import java.time.Year;
import java.time.chrono.ChronoLocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Amy", LocalDate.now(), "BLR");
        person.name();
        person.city();
        System.out.println(person.name());
        System.out.println(person.city());

//        Book book = Book.builder().id("id").title("Effective Java").release(Year.of(2001)).builder();
//        Book book1 = new Book("", "", null,null);
        Book book2 = new Book("", "", Year.now(),1);


    }

    public  record Person(String name, LocalDate birthday, String city) {//introduced in Java 14

    }

}
