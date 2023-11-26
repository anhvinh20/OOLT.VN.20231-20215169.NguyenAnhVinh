package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

public class Store {
    public Store() {
    }

    ArrayList<Media> ItemsInStore = new ArrayList<>();
    public void removeMedia(Media media) {
        if(ItemsInStore.remove(media)){
        System.out.println("The media " + media.getTitle() + " has been removed");
        } else {
            System.out.println("The media was not found!");
        }

    }

    public void addMedia(Media media) {
        ItemsInStore.add(media);
        System.out.println("The media " + media.getTitle() + " has been added");
    }
}
