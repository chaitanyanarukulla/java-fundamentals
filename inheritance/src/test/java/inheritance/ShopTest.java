package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    Shop testShop;

    @Before
    public void setup() {
        testShop = new Shop("Chai", "Test Review", "$");
    }

    @Test
    public void test_NewShop() {
        assertEquals("Shop Name Should be Chai", "Chai", testShop.getName());
        assertEquals("Shop description Should Test Review", "Test Review", testShop.getDescription());
        assertEquals("Shop price Should be $", "$", testShop.getPrice());
    }

    @Test
    public void test_ToString() {
        String expectedOutput = "Shop Name: Chai\nDescription: Test Review\nPrice: $\nNumber of Stars: No Stars";
        assertEquals(expectedOutput, expectedOutput, testShop.toString());
    }

    @Test
    public void test_AddReview() {
        Review review = new Review("Test Review", 5, "Chai");
        testShop.addReview(review);
        assertTrue("Should contain review", testShop.getReviews().contains(review));
    }
}