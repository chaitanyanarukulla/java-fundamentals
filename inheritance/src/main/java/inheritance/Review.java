package inheritance;


public class Review {
    private String body;
    private String author;
    private Integer stars;
    private Restaurant restaurant;
    private Theater theater;
    private Shop shop;

    public Review(String body, int stars, String author) {
        this.body = body;
        this.stars = stars;
        this.author = author;
    }

    public Review(String body, int stars, String author, Restaurant restaurant) {
        this.body = body;
        this.stars = stars;
        this.author = author;
        this.restaurant = restaurant;
        restaurant.addReview(this);
    }

    public Review(String body, int stars, String author, Theater theater) {
        this.body = body;
        this.stars = stars;
        this.author = author;
        this.theater = theater;
        theater.addReview(this);
    }

    public Review(String body, int stars, String author, Shop shop) {
        this.body = body;
        this.stars = stars;
        this.author = author;
        this.shop = shop;
        shop.addReview(this);
    }

    public Integer getStars() {
        return stars;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return String.format("Restaurant: %s\nReview: %s \nNumber of Stars: %s\nAuthor: %s", restaurant.getName(), body, stars, author);
    }
}
