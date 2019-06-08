package inheritance;

import java.util.HashSet;

public class Shop {
    private String name;
    private String description;
    private String price;
    private Integer stars;
    private long starsTotal;
    private HashSet<Review> reviews = new HashSet();

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Integer getNumStars() {
        return stars;
    }

    public String getDescription() {
        return description;
    }

    public HashSet<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        Review newReview = review;
        newReview.setShop(this);
        reviews.add(newReview);

    }

    @Override
    public String toString() {
        String avgStars = stars == null ? "No Stars" : Integer.toString(stars);
        return String.format("Shop Name: %s\nDescription: %s\nPrice: %s\nNumber of Stars: %s", name, description, price, avgStars);
    }
}
