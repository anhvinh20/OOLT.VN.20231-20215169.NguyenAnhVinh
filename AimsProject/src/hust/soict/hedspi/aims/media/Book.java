package hust.soict.hedspi.aims.media;


import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    public Book(String title){
        super(title);
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



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book - ");
        sb.append("Title: ").append(getTitle()).append(", ");
        sb.append("Category: ").append(getCategory()).append(", ");
        sb.append("Cost: ").append(getCost()).append(", ");
        sb.append("Authors: ").append(getAuthors());
        return sb.toString();
    }
}
