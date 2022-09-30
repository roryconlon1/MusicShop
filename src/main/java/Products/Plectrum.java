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

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int markUp(){
        return this.sellingPrice - this.buyingPrice;
    }
}
