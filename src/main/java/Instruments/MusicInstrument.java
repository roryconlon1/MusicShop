package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class MusicInstrument implements IPlay, ISell {

    private String name;
    private Integer buyingPrice;
    private Integer sellingCost;
    private InstrumentType instrumentType;

    public MusicInstrument(String name, Integer buyingPrice, Integer sellingCost, InstrumentType instrumentType) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingCost = sellingCost;
        this.instrumentType = instrumentType;
    }

    public Integer getBuyingPrice() {
        return buyingPrice;
    }

    public Integer getSellingCost() {
        return sellingCost;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public int markUp(){
        return this.getSellingCost() - this.getBuyingPrice();
    }
}
