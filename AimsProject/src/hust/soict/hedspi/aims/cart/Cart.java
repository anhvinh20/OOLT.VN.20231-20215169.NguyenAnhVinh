package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

import java.util.Scanner;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    private int qtyOrdered ;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered <MAX_NUMBER_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        }else{
            System.out.println("The cart is almost full!");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null ) {
                itemsOrdered[i] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc was not found in the cart.");
    }

    public float totalCost(){
        float total = 0 ;
        for(int i=0 ; i<qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    //printCart
    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items");
        System.out.println("1. " +itemsOrdered[0]);
        for(int i = 1; i < qtyOrdered; i++) {
            int j = i+1;
            System.out.println(j + ". " +itemsOrdered[i]);
        }
        System.out.println("Total Cost is:    " + totalCost());
        System.out.println("***************************************************");
    }

    // search by title
    public void searchCartTitle() {
        String title1;
        int dem = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input title: ");
        title1 = keyboard.nextLine();
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].isMatchTitle(title1) == true) {
                System.out.println(itemsOrdered[i]);
                dem ++;
                break;
            }
        }
        if(dem == 0) {
            System.out.println("Don't found this title in your cart!");
        }
    }


    //14.1
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (disc != null) {
                addDigitalVideoDisc(disc);
            }
        }
    }

    //14.2
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
}
