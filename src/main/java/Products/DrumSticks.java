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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingCost() {
        return sellingCost;
    }

    public void setSellingCost(int sellingCost) {
        this.sellingCost = sellingCost;
    }

    public int getNumberInSet() {
        return numberInSet;
    }

    public void setNumberInSet(int numberInSet) {
        this.numberInSet = numberInSet;
    }

    public int markUp(){
        return this.sellingCost - this.buyingPrice;
    }
}
