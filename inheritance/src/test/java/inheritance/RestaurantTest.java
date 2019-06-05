package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void test_Restaurant_constructor() {
        Restaurant classUnderTest = new Restaurant("chai", "$");
        assertEquals("should return name chai","chai",classUnderTest.getName());
    }

    @Test
    public void test_Restaurant_constructor_getName() {
        Restaurant classUnderTest = new Restaurant("chai", "$$");
        assertEquals("should return name chai","chai",classUnderTest.getName());
    }

    @Test
    public void test_Restaurant_constructor_getPrice() {
        Restaurant classUnderTest = new Restaurant("chai", "$$");
        assertEquals("should return $$","$$", classUnderTest.getpriceCategory());
    }

    @Test
    public void test_testToString() {
        Restaurant classUnderTest = new Restaurant("Will", "$$");
        String expectedOutput = "Restaurant Name: Will\nPrice: $$ \nNumber of Stars: null";
        assertEquals(expectedOutput, classUnderTest.toString());
    }
    @Test
    public void test_AddReview() {
        Restaurant classUnderTest = new Restaurant("Luke", "$$");
        Review restaurantReview = new Review("Best place for PBR", 5, "Luke.ll");
        classUnderTest.addReview(restaurantReview);
        assertTrue("Should contain review", classUnderTest.containsReview(restaurantReview));
    }


}