package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation","Roger Allers",87,19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction","George Lucas",87,24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation",18.99f);
        anOrder.addMedia(dvd3);

//        DigitalVideoDisc[] order2 = new DigitalVideoDisc[2];
//        order2[0] = dvd2 ;
//        order2[1] = dvd1 ;
//        anOrder.addMedia(order2);
//
//        anOrder.addMedia(dvd1,dvd2);


        anOrder.print();

        anOrder.removeMedia(dvd1);
    }
}