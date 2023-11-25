package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {

    private String director ;
    private int length ;


    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }


    // Constructor
    public DigitalVideoDisc(int id, String title){
        super(id,title);
    }
    public DigitalVideoDisc(String title) {
        super(title);


    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    @Override
    public String toString() {
        String print = String.format("%-15s%s", getTitle() , getCost());
        return print ;
    }




    // Hàm kiểm tra xem title nhập vào có trùng với title trong giỏ hàng không
    public boolean isMatchTitle(String title1) {
        return this.getTitle().equals(title1);
    }

}
