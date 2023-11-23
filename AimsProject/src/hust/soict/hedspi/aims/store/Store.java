package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBER_STORED = 20;
    private DigitalVideoDisc itemsInStore[] =
            new DigitalVideoDisc[MAX_NUMBER_STORED];

    private int qtyStored = 0 ;

    //Adds the DVD
    public void addDVD(DigitalVideoDisc disc){
        if(qtyStored <MAX_NUMBER_STORED){
            itemsInStore[qtyStored] = disc;
            qtyStored++;
            System.out.println("The disc has been added in the store.");
        }else{
            System.out.println("The store is almost full!");
        }
    }

    //Removes the DVD
    public void removeDVD(DigitalVideoDisc dics){
        for (int i = 0; i < qtyStored; i++) {
            if (itemsInStore[i] != null ) {
                itemsInStore[i] = null;
                qtyStored--;
                System.out.println("The disc in the store has been removed.");
                return;
            }
        }
        System.out.println("The disc was not found in the store.");
    }


}
