package Instruments;

public class Guitar extends MusicInstrument{

    private final String guitarType;
    private int numberOfStrings;

    public Guitar(String name, Integer buyingPrice, Integer sellingCost, InstrumentType instrumentType, String guitarType, int numberOfStrings) {
        super(name, buyingPrice, sellingCost, instrumentType);
        this.guitarType = guitarType;
        this.numberOfStrings = numberOfStrings;
    }

    public String getGuitarType() {
        return guitarType;
    }

}
