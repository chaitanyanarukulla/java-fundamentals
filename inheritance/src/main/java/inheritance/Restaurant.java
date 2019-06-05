package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant{

    private String name;
    private Integer stars;
    private String priceCategory;
    private long totalStars;
    private long numOfReviews;
    ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, String priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return this.name;
    }

    public Integer getStars() {
        return this.stars;
    }

    public String getpriceCategory() {
        return this.priceCategory;
    }

    public boolean containsReview(Review review) {
        return reviews.contains(review);
    }

    public void addReview(Review review) {
        Review newReview = review;
        newReview.setRestaurant(this);
        numOfReviews++;
        totalStars += newReview.getStars();
        reviews.add(newReview);
        update_Stars();
    }

    public void update_Stars() {
        stars = (int)(totalStars / numOfReviews);
    }

    @Override
    public String toString() {
        String avgStars = stars == null ? "No Stars" : Integer.toString(stars);
        return String.format("Restaurant Name: %s\nPrice: %s \nNumber of Stars: %s", name, priceCategory, stars);
    }
}
