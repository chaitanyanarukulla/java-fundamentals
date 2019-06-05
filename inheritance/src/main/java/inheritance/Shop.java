package inheritance;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private String priceCategory;
    private ArrayList<Review> reviews;
    private Integer stars;
    private long totalStars;
    private long numOfReviews;

    public Shop(String name,String description){
        this.name = name;
        this.description = description;


        public void addReview(Review review){
            Review newReview = review;
            newReview.setRestaurant(this);
            numOfReviews++;
            totalStars += newReview.getStars();
            reviews.add(newReview);
            update_Stars();
        }

        public void update_Stars(){
            stars = (int)(totalStars / numOfReviews);
        }

    }
}
