package uk.co.royharrington.codewars;

import java.util.function.Function;

/**
 * CodeWars - Java Functional Programming (Part 1: The Beginning)
 *
 * @author Roy
 *
 */
public class FunctionalProgramming {
    public static Function<Student, Boolean> f = (Student s) -> "John Smith".equals(s.getFullName()) && "js123".equals(s.studentNumber);
}