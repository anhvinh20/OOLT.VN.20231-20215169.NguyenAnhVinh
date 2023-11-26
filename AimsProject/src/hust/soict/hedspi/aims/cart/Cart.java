package hust.soict.hedspi.aims.cart;


import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("The disc has been added to the cart.");
        } else {
            System.out.println("The media is almost full!");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media has been removed.");
        } else {
            System.out.println("The media was not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        int i = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
            i++;
        }
        return total;
    }

    //printCart
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items");
        int i = 1;
        float total = 0;
        for (Media disc : this.itemsOrdered) {
            if (disc != null) {
                System.out.println(i+"."+ disc.toString());
                i++;
                total += disc.getCost();
            }
        }
        System.out.println("Total Cost is:    " + totalCost());
        System.out.println("***************************************************");
// Cần phải update thêm
        public void searchById(int id) {
            System.out.println("Search results for ID: " + id);
            for (Media m : itemsOrdered) {
                if (m.getId() == id) {
                    System.out.println(m.toString());
                    return;
                }
            }
            System.out.println("No items found.");
        }

        public void searchByTitle(String title) {
            boolean found = false;
            System.out.println("Search results for keywords: " + title);
            for (Media m : itemsOrdered) {
                if (m.isMatch(title)) {
                    System.out.println(m.toString());
                    found = true;
                }
            }
            if (!found)
                System.out.println("No items found.");
        }


        public int size() {
            return itemsOrdered.size();
        }

        public void placeOrder() {
            itemsOrdered.clear();
        }



        //14.1
//    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//        for (DigitalVideoDisc disc : dvdList) {
//            if (disc != null) {
//                addDigitalVideoDisc(disc);
//            }
//        }
//    }

        //14.2
//    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
//        addDigitalVideoDisc(dvd1);
//        addDigitalVideoDisc(dvd2);
//    }
//
    }
}
