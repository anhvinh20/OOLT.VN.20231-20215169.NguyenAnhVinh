package AimsProject;

import java.util.ArrayList;

public class DigitalVideoDisc {
    private String title ;
    private String category ;
    private String director ;
    private int length ;
    private float cost;
    private ArrayList<DigitalVideoDisc> shoppingCart ;
// Getter
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
// Constructor
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public void addToCart(String title, String category, String director, int length, float cost ){
        DigitalVideoDisc temp = new DigitalVideoDisc(title,category,director,length,cost);
        shoppingCart.add(temp);
    }
}
