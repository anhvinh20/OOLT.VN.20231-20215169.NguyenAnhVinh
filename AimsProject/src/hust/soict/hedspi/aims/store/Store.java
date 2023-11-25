package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

import java.util.ArrayList;

public class Store {
    public Store() {
    }

    ArrayList<DigitalVideoDisc> ItemsInStore = new ArrayList<DigitalVideoDisc>();
    public void removeDVD(DigitalVideoDisc disc) {
        ItemsInStore.remove(disc);
        System.out.println("The media " + disc.getTitle() + " has been removed");
    }

    public void addDVD(DigitalVideoDisc disc) {
        ItemsInStore.add(disc);
        System.out.println("The disc " + disc.getTitle() + " has been added");
    }
}
