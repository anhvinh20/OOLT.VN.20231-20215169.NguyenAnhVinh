package hust.soict.hedspi.aims.media;


import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

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

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(){
        // TODD Auto-generated constructor stub
    }
    public void  addAuthor(String authorName){
        int count = 0;
        for (String o : authors) { //dai dien tung ten tac gia
            if(o.equals(authorName)){
                count = 1;
                break;
            }
        }
        if( count == 0)
            authors.add(authorName);
        else
            System.out.println("The author's name existed ! Can't add");
    }

    public void removeAuthor(String authorName){
        int count = 0;
        for (String o : authors) {
            if(o.equals(authorName)){
                count = 1;
                break;
            }
        }
        if(count == 1)
            authors.removeIf(o->o.equals(authorName));
        else
            System.out.println("The author's name not found !");
    }
}
