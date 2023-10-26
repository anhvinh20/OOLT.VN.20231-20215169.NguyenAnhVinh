package AimsProject;

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

//    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
//        for(int i=0 ; i<qtyOrdered ; i++){
//            if(itemsOrdered[i] == disc){
//
//            }
//        }
//    }

      public double totalCost(){
            double total = 0 ;
            for(int i=0 ; i<qtyOrdered; i++){
                total += itemsOrdered[i].getCost();
            }
            return total;
      }
}
