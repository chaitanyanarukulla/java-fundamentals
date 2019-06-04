package inheritance;

import java.util.ArrayList;

public class Restaurant{

    private String name;
    private double stars;
    private String priceCategory;
    private ArrayList<Review> reviews;

    public Restaurant(){};

    public Restaurant(String name,double stars, String priceCategory){
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
        return String.format("A Resturant  named %s has a  average review of %d  and is in the %e price range", this.name, this.stars,this.priceCategory);
    }
}
