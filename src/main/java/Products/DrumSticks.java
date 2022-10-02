package Products;

import behaviours.ISell;

public class DrumSticks  implements ISell {

    private String name;
    private int buyingPrice;
    private int sellingCost;
    private int numberInSet;

    public DrumSticks(String name, int buyingPrice, int sellingCost, int numberInSet) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingCost = sellingCost;
        this.numberInSet = numberInSet;
    }

    public int getNumberInSet() {
        return numberInSet;
    }

    public int markUp(){
        return this.sellingCost - this.buyingPrice;
    }
}
