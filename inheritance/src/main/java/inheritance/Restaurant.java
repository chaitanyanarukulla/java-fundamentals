package inheritance;

import java.util.ArrayList;

public class Restaurant{

    private String name;
    private double stars;
    private String priceCategory;
    private ArrayList<Review> reviews;

    public Restaurant(String name,double stars, String priceCategory,ArrayList reviews){
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getStars() {
        return stars;
    }

    public String getpriceCategory() {
        return priceCategory;
    }

    public String toString() {
        return String.format("A Resturant  named %s has a review average of %d if and is in the %e price range", this.name, this.stars,this.priceCategory);
    }
}
