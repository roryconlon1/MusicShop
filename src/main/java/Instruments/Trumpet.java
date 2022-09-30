package Instruments;

public class Trumpet extends MusicInstrument{

    private Integer numberOfValves;

    public Trumpet(String name, Integer buyingPrice, Integer sellingCost, InstrumentType instrumentType, Integer numberOfValves) {
        super(name, buyingPrice, sellingCost, instrumentType);
        this.numberOfValves = numberOfValves;
    }

    public Integer getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(Integer numberOfValves) {
        this.numberOfValves = numberOfValves;
    }
}
