package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Media {

    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public boolean isMatch(String title) {
        if(title!= null){
        String[] keywords = title.split("\\s+");
        for (String word : keywords) {
            if (this.title.toLowerCase().contains(word.toLowerCase()))
                return true;
        }}
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media(String title) {
        this.title = title;
    }

    public Media(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Media(){
    }

    @Override
    public boolean equals(Object o) {
        try {
            // Object compare with itself
            if (o == this) {
                return true;
            }
            // Check if the object is an instance of Media
            if (!(o instanceof Media other)) {
                return false;
            }
            // Compare the titles and return accordingly
            return this.getTitle().equals(other.getTitle()) && this.getCost() == other.getCost();
        } catch (NullPointerException | ClassCastException e) {
            return false;
        }
    }


}

}
