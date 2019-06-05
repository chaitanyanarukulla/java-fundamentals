package inheritance;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private String priceCategory;
    private ArrayList<Review> reviews;

    public Shop(String name,String description){
        this.name = name;
        this.description = description;

    }
}
