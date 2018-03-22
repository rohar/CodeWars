package uk.co.royharrington.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarMileageTest {

  @Test 
  public void testTooSmall() {
    assertEquals(0, CarMileage.isInteresting(3, new int[]{1337, 256}));
  }
  
  @Test 
  public void testAlmostAwesome() {
    assertEquals(1, CarMileage.isInteresting(1336, new int[]{1337, 256}));
  }
  
  @Test 
  public void testAwesome() {
    assertEquals(2, CarMileage.isInteresting(1337, new int[]{1337, 256}));
  }
  
  @Test 
  public void testFarNotInteresting() {
    assertEquals(0, CarMileage.isInteresting(11208, new int[]{1337, 256}));
  }
  
  @Test 
  public void testAlmostInteresting() {
    assertEquals(1, CarMileage.isInteresting(11209, new int[]{1337, 256}));
  }
  
  @Test 
  public void testInteresting() {
    assertEquals(2, CarMileage.isInteresting(11211, new int[]{1337, 256}));
  }
  
  @Test 
  public void testIncrementing() {
	    assertEquals(2, CarMileage.isInteresting(12345, new int[]{}));
  }
  
  @Test 
  public void testDecrementing() {
	    assertEquals(2, CarMileage.isInteresting(54321, new int[]{}));
  }
  
  @Test 
  public void test98() {
	    assertEquals(1, CarMileage.isInteresting(98, new int[]{}));
  }
  
  @Test 
  public void test99() {
	    assertEquals(1, CarMileage.isInteresting(99, new int[]{}));
  }
  
  @Test 
  public void test6998() {
	    assertEquals(1, CarMileage.isInteresting(6998, new int[]{}));
  }
  
  @Test 
  public void test799999() {
	    assertEquals(1, CarMileage.isInteresting(799999, new int[]{}));
  }
  
  @Test 
  public void test109() {
	    assertEquals(1, CarMileage.isInteresting(109, new int[]{}));
  }
  
  @Test 
  public void test110() {
	    assertEquals(1, CarMileage.isInteresting(110, new int[]{}));
  }
  
}