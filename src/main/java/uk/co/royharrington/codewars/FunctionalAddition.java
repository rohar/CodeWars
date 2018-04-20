package uk.co.royharrington.codewars;

import java.util.function.Function;

/**
 * CodeWars - Functional Addition
 *
 * @author Roy
 *
 */
public class FunctionalAddition {
    public static Function<Integer, Integer> add(int j) {
        return (Integer i) -> i + j;
    }
}
