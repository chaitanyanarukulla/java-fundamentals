package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void test_Restaurant_constructor() {
        Restaurant classUnderTest = new Restaurant("chai", 1.2, "$$");
        assertEquals("should return name chai","chai",classUnderTest.getName());
    }

    @Test
    public void test_Restaurant_constructor_getName() {
        Restaurant classUnderTest = new Restaurant("chai", 1.2, "$$");
        assertEquals("should return name chai","chai",classUnderTest.getName());
    }

    @Test
    public void test_Restaurant_constructor_getPrice() {
        Restaurant classUnderTest = new Restaurant("chai", 1.2, "$$");
        assertEquals("should return $$","$$", classUnderTest.getpriceCategory());
    }

    @Test
    public void test_getName() {
    }

    @Test
    public void test_getStars() {
    }


    @Test
    public void test_toString1() {
    }
}