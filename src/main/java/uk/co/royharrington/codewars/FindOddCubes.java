package uk.co.royharrington.codewars;

import java.util.Arrays;

/**
 * CodeWars - Sum of Odd Cubed Numbers
 *
 * @author Roy
 *
 */
public class FindOddCubes {
    public static int cubeOdd(int arr[]) {
        return Arrays.stream(arr)
                .filter(i -> i % 2 != 0)
                .map(i -> i * i * i)
                .sum();
    }
}
