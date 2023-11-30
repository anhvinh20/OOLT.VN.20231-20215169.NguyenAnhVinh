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
    public Media searchById(int id) {
        System.out.println("Search results for ID: " + id);
        for (Media m : ItemsInStore) {
            if (m.getId() == id) {
                System.out.println(m.toString());
                return m;
            }
        }
        System.out.println("No items found.");
        return null;
    }


    public Media searchByTitle(String title) {
        boolean found = false;
        System.out.println("Search results for keywords: " + title);
        for (Media m : ItemsInStore) {
            if (m.isMatch(title)) {
                System.out.println(m.toString());
                found = true;
                return m;
            }
        }
        if (!found)
            System.out.println("No items found.");
        return null;
    }
    public void addMedia(Media media) {
        ItemsInStore.add(media);
        System.out.println("The media " + media.getTitle() + " has been added");
    }
}
