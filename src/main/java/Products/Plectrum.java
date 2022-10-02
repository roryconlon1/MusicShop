package Products;

import behaviours.ISell;

public class Plectrum implements ISell {

    private int buyingPrice;
    private int sellingPrice;
    private String material;

    public Plectrum(int buyingPrice, int sellingPrice, String material) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.material = material;
    }

    public int markUp(){
        return this.sellingPrice - this.buyingPrice;
    }
}
