package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void test_NewReview() {
        Review review = new Review("This place has free beer", 5, "Chai");
        String[] outputValues = {"This place has free beer", "5", "Chai"};
        assertArrayEquals(outputValues, new String[] {review.getBody(), Integer.toString(review.getStars()), review.getAuthor()});

    }

    @Test
    public void test_NewReview_with_Restaurant() {
        Restaurant classUnderTest = new Restaurant("LukePBR", "$$");
        Review review = new Review("This place has free beer", 3, "Luke", classUnderTest);
        String[] outputValues = {"This place has free beer", "3", "Luke", classUnderTest.toString()};
        assertArrayEquals(outputValues, new String[] {review.getBody(), Integer.toString(review.getStars()), review.getAuthor(), review.getRestaurant().toString()});
    }

    @Test
    public void test_getStars() {
        Restaurant newRestaurant = new Restaurant("LukePBR", "$$");
        Review review = new Review("This place has free beer", 3, "Luke", newRestaurant);
        assertEquals(3, (int) newRestaurant.getStars());
    }

    @Test
    public void test_getBody() {
        Review review = new Review("This place has free beer", 3, "Luke");
        assertEquals("This place has free beer",review.getBody());
    }

    @Test
    public void test_getAuthor() {
        Review review = new Review("This place has free beer", 3, "Luke");
        assertEquals("Luke",review.getAuthor());
    }


    @Test
    public void test_ToString() {
        Restaurant newRestaurant = new Restaurant("Luke", "$$");
        Review review = new Review("PBR is served here", 5, "Luke",newRestaurant);
        assertEquals("Restaurant: Luke\nReview: PBR is served here \nNumber of Stars: 5\nAuthor: Luke", review.toString());
    }
}