package hust.soict.hedspi.test.screen.customer.store;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.screen.customer.controller.CartController;
import hust.soict.hedspi.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.naming.LimitExceededException;

public class TestCartController extends Application {
    private static Store store;
    private static Cart cart;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //hust/soict/hedspi/screen/customer/view/Store.fxml
        //hust/soict/hedspi/test/screen/customer/store/TestViewStoreScreen.java
        final String STORE_FXML_FILE_PATH = "../../../../aims/screen/customer/view/Cart.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
        CartController cartController = new CartController(store,cart);
//        ViewStoreController viewStoreController = new ViewStoreController(store);
        fxmlLoader.setController(cartController);
        Parent root= fxmlLoader.load();
        primaryStage.setTitle("Cart");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) throws LimitExceededException {
        cart = new Cart();

        store = new Store();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin1", "Animation", 18.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladin2", "Animation", 18.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin3", "Animation", 18.99f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Aladin4", "Animation", 18.99f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Aladin5", "Animation", 18.99f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Aladin6 store", "Animation", 18.99f);



        // Add DVDs to the store
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);
        store.addMedia(dvd6);
        store.addMedia(dvd7);
        store.addMedia(dvd8);
        store.addMedia(dvd9);

        cart.addMedia(dvd1);
        cart.addMedia(dvd2);

        cart.addMedia(dvd3);
        cart.addMedia(dvd4);
        cart.addMedia(dvd5);
        cart.addMedia(dvd6);
        launch(args);
    }
}

