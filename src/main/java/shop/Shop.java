package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public void addItem(ISell item){
        stock.add(item);
    }

    public ArrayList<ISell> getStock() {
        return stock;
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
