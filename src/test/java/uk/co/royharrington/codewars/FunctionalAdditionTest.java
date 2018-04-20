package uk.co.royharrington.codewars;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertTrue;

/**
 * CodeWars - Functional Addition
 *
 * @author Roy
 *
 */
public class FunctionalAdditionTest {
    @Test
    public void testAdd1() throws Exception {
        Function<Integer, Integer> f = FunctionalAddition.add(1);
        assertTrue("Exected 2", f.apply(1) == 2);
    }

}
