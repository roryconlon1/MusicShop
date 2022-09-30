package shop;

import Instruments.InstrumentType;
import Instruments.MusicInstrument;
import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public void addItem(ISell item){
        stock.add(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public int itemsInStock(){
        return this.getStock().size();
    }

    public void sellItem(ISell item){
        this.stock.remove(item);
    }

    public int findProfit(){
        int sum = 0;
        for(ISell item : stock){
            sum += item.markUp();
        }
        return sum;
    }
}
