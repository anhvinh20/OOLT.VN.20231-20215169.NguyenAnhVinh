package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    // Constructor
    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
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

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
