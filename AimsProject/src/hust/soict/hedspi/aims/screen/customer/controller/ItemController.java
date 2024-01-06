package hust.soict.hedspi.aims.screen.customer.controller;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ItemController {

    @FXML
    private Button btnAddToCart;

    @FXML
    private Button btnPlay;

    @FXML
    private Label lblCost;

    @FXML
    private Label lblTitle;
    private Cart cart;

    @FXML
    void btnAddToCartClicked(ActionEvent event) {
    }
    @FXML
    void btnPlayClicked(ActionEvent event) {

    }
      private Media media;
    public ItemController(Cart cart) {
        this.cart = cart;
    }

//    public void setData(Media media) {
//        this.media = media;
//        lblTitle.setText(media.getTitle());
//        lblCost.setText(media.getCost() + " $");
//    }

    @FXML
    void btnAddToCartClicked(ActionEvent event) {
        if (!cart.getItemsOrdered().contains(media)) {
            media.setId(cart.getItemsOrdered().size() + 1);
            cart.getItemsOrdered().add(media);
            System.out.println("The media has been added to the cart.");
        } else {
            System.out.println("The media is already in the cart.");
        }
    }



    @FXML
    void btnPlayClicked(ActionEvent event) throws PlayerException {
        if (media instanceof Playable) {
            Playable playableMedia = (Playable) media;
            playableMedia.play(); // Call the play method on the media
            System.out.println("Playing: " + media.getTitle());
        }
    }
      public void setData(Media media) {
          this.media = media;
          lblTitle.setText(media.getTitle());
          lblCost.setText(media.getCost()+" $");
          if(media instanceof Playable) {
              btnPlay.setVisible(true);
          }
          else {
              btnPlay.setVisible(false);
          }
      }
}